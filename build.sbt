libraryDependencies += "org.scalatest" %% "scalatest-flatspec" % "3.2.12" % "test"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.12" % "test"

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.3"

lazy val root = (project in file("."))
  .settings(
    name := "fpscala"
  )
