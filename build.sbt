name := "scala-beginner"

ThisBuild / scalaVersion := "2.13.2"

libraryDependencies += "org.creativescala" %% "doodle" % "0.9.0"

Global/cancelable := true

lazy val docs = project
  .in(file("output"))
  .enablePlugins(MdocPlugin)
  .settings(
    mdocIn := file("slides"),
    mdocOut := file("output")
  )
