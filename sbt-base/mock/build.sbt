name := "mock"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.16",
  "com.typesafe.akka" %% "akka-http" % "10.0.3",
  "com.typesafe.akka" %% "akka-parsing" % "10.0.3",
  "de.heikoseeberger" %% "akka-sse" % "2.0.0" excludeAll ExclusionRule(organization = "com.typesafe.akka"),
  "ch.megard" %% "akka-http-cors" % "0.1.10",
  "com.typesafe.akka" %% "akka-slf4j" % "2.4.16" exclude("org.slf4j", "slf4j-api"),
  "org.slf4j" % "slf4j-api" % "1.7.21",
  "ch.qos.logback" % "logback-classic" % "1.1.7",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0" exclude("org.slf4j", "slf4j-api"),
  "com.typesafe"  % "config" % "1.3.1",
  "org.json4s" %% "json4s-native" % "3.5.0",
  "org.json4s" %% "json4s-core" % "3.5.0",
  "org.json4s" %% "json4s-ext" % "3.5.0",
  "org.yaml" % "snakeyaml" % "1.16",
  "io.kamon" %% "kamon-core" % "0.6.4" excludeAll ExclusionRule(organization = "com.typesafe.akka"),
  "org.slf4j" % "jul-to-slf4j" % "1.7.21",
  // Testing
  "junit" % "junit" % "4.11" % "test",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "org.scalacheck" %% "scalacheck" % "1.13.4" % "test",
  "com.typesafe.akka" %% "akka-testkit" % "2.4.14" % "test"
)
