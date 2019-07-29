name := "kaleidoscope"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.8"

scalaSource in Compile := baseDirectory.value / "src" / "core"

scalaSource in Test := baseDirectory.value / "src" / "test"

libraryDependencies += "com.propensive" %% "contextual" % "1.2.1"

// Expected contents: probably.jar
unmanagedBase in Test := baseDirectory.value / "lib"

libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value

//libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.14.0" % "test"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"


