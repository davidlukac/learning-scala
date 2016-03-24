name := "Learning Scala"

version := "v0.1.0-SNAPSHOT"

scalaVersion := "2.11.7"

crossScalaVersions := Seq("2.11.0", "2.11.7")

mainClass in (Compile, run) := Some("com.davidlukac.learn.scala.LogicalFunctions")

resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"

libraryDependencies += "org.scalautils" % "scalautils_2.11" % "2.1.5"

// Test dependencies.

libraryDependencies += "org.scalactic" %% "scalactic" % "2.2.6"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"

libraryDependencies += "junit" % "junit" % "4.10" % "test"
