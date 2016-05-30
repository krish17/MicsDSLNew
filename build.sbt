name := "MicsDSL"

version := "1.0"

scalaVersion := "2.11.8"

lazy val root = (project in file(".")).enablePlugins(SbtTwirl)

TwirlKeys.templateImports += "mics.dsl._"

sourceDirectories in (Compile, TwirlKeys.compileTemplates) := (unmanagedSourceDirectories in Compile).value
