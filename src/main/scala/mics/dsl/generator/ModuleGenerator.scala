package mics.dsl.generator

import java.nio.file.Path

import mics.dsl.service.Module

import scala.util.{Success, Try}

case class ModuleGenerator(directory: Path, artifact: Module) extends CodeGenerator[Module] {
  override def generate: Try[String] = Success("TBD")
}
