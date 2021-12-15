ThisBuild / version := "0.1.0-SNAPSHOT"

//ThisBuild / scalaVersion := "2.13.7"
scalaVersion := "2.12.15"
libraryDependencies += "org.typelevel" %% "cats-effect" % "2.5.3"
libraryDependencies += "tf.tofu" %% "tofu-concurrent" % "0.10.6"

lazy val root = (project in file("."))
  .settings(
    name := "tofu-interop-bug-example"
  )

scalacOptions += "-Ypartial-unification"
