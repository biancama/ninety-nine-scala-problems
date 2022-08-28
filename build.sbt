val scala3Version = "3.1.3"

lazy val root = project
  .in(file("."))
  .settings(
    name := "ninety-nine-scala-problems",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )

libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.16.0" % "test"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.13" % Test
libraryDependencies += "org.scalatestplus" %% "scalacheck-1-16" % "3.2.13.0" % "test"