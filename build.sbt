ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.11"

lazy val root = (project in file("."))
  .settings(
    name := "absolute-units-scala",
    idePackagePrefix := Some("cl.ravenhill.alpaca")
  )

libraryDependencies += "org.scalameta" % "munit_2.13" % "1.0.0-M8"
