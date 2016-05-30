package mics.dsl.generator

import java.nio.file.Path
import mics.dsl.service._
import scala.util.{Failure, Try}
import scala.sys.process._

case class ServiceGenerator(directory: Path, artifact: Service) extends CodeGenerator[Service] {
  override def generate: Try[String] = artifact match {
    case ServiceWithModules(serviceName, serviceDescription, packageName, modules) =>
      val x = twirl.html.controller(packageName, modules.head.asInstanceOf[ModuleWithActions]).body
      createProject(serviceName)
    case _ =>
      Failure(new RuntimeException(s"Service is not defined completely"))
  }

  private def createProject(projectName: String): Try[String] = Try {
    val activatorCmd = s"C:\\play\\activator\\dist-1.3.10\\bin\\activator.bat new $directory/$projectName play-scala"
    activatorCmd.!!
  }
}
