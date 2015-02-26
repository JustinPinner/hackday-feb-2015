import _root_.sbt.Keys._
import play.Project._

name := "hackday-feb-2015"

version := "1.0"

playScalaSettings

libraryDependencies ++= Seq(
  "com.gu" %% "content-api-client" % "5.1"
)