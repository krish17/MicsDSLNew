package mics.dsl.generator

import java.io.{File, PrintWriter}
import java.nio.file.Path
import mics.dsl.service._
import play.twirl.api.Html
import scala.util.{Failure, Try}
import scala.sys.process._
import mics.dsl.service.Data._

case class ServiceGenerator(directory: Path, artifact: Service) extends CodeGenerator[Service] {
  override def generate: Try[String] = artifact.data match {
    case Some(ServiceData(serviceName, serviceDescription, packageName, modules)) =>
      //createProject(serviceName)
      for {
        module <- modules
        moduleData <- module.data
        moduleCode: Html = twirl.html.controller(packageName, moduleData)
        saved = writeToFile(s"$directory\\$serviceName\\app", packageName, "controllers", s"${moduleData.name}Controller.scala", moduleCode.toString)
      } yield true
    case _ =>
      Failure(new RuntimeException(s"Service is not defined completely"))
  }

  private def createProject(projectName: String): Try[String] = Try {
    val activatorCmd = s"C:\\play\\activator\\dist-1.3.10\\bin\\activator.bat new $directory/$projectName play-scala"
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
