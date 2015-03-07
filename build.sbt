name := """akka-sample-camel-scala"""

version := "2.3.9"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-camel" % "2.3.9",
  "org.apache.camel" % "camel-jetty" % "2.14.1",
  "org.apache.camel" % "camel-quartz" % "2.14.1",
  "org.slf4j" % "slf4j-api" % "1.7.2",
  "ch.qos.logback" % "logback-classic" % "1.0.7"
)



fork in run := true