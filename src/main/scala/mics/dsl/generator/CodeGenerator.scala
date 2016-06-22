package mics.dsl.generator

import java.io.{PrintWriter, File}
import java.nio.file.Paths
import mics.dsl.service.Data.ServiceData
import mics.dsl.service.Data._
import mics.dsl.service.Service
import play.twirl.api.Html
import scala.sys.process._
import scala.util.{Failure, Success, Try}

case class CodeGenerator(service: Service, directory: String) {
  val path = Paths.get(directory)

  def generateCode: Try[Boolean] = {
    generate.map(_ => true)
  }

  private def generate: Try[String] = service.data match {
    case Some(ServiceData(serviceName, serviceDescription, packageName, modules)) =>
      createProject(serviceName)
      for {
        module <- modules
        moduleData <- module.data
        moduleCode: Html = twirl.html.controller(packageName, moduleData)
        saved = writeToFile(s"$path\\$serviceName\\app", packageName, "controllers", s"${moduleData.name}Controller.scala", moduleCode.body.trim)
      } yield true
      val routesCode: Html = twirl.html.routes(packageName, modules)
      writeToFile(s"$path\\$serviceName", "", "conf", "routes", routesCode.body.trim)
      Success(s"$serviceName project successfully generated!")
    case _ =>
      Failure(new RuntimeException(s"Service is not defined completely"))
  }

  private def createProject(projectName: String): Try[String] = Try {
    val activatorCmd = s"C:\\play\\activator\\dist-1.3.10\\bin\\activator.bat new $path/$projectName play-scala"
    activatorCmd.!!
  }

  private def writeToFile(basePath: String, packageName: String, component: String, fileName: String, fileContent: String): Boolean = {
    val filePath = basePath + "\\" + packageName.split('.').mkString("\\") + "\\" + component + "\\" + fileName
    val file = new File(filePath)
    file.getParentFile.mkdirs()
    file.createNewFile()
    val writer = new PrintWriter(file)
    writer.write(fileContent)
    writer.close()
    true
  }
}