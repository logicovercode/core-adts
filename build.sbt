name := "core-adts"

version := "0.0.001"

scalaVersion := "2.13.8"

crossScalaVersions := Seq("2.13.8", "3.3.1")

val projectSourceDirs = List("adts")
Compile / unmanagedSourceDirectories ++= projectSourceDirs.map(dir => (Compile / baseDirectory).value / dir)

organization := "com.logicovercode"

val techLead = Developer(
  "techLead",
  "techLead",
  "techlead@logicovercode.com",
  url("https://github.com/logicovercode")
)
developers := List(techLead)

homepage := Some(
  url("https://github.com/logicovercode/core-adts")
)
scmInfo := Some(
  ScmInfo(
    url("https://github.com/logicovercode/core-adts"),
    "git@github.com:logicovercode/core-adts.git"
  )
)

licenses += ("MIT", url("https://opensource.org/licenses/MIT"))

//publishing related settings

//crossPaths := false
//publishMavenStyle := true
publishTo := Some(Opts.resolver.sonatypeStaging)

publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(true)

val fSbtAdtsProject = project in file(".")
