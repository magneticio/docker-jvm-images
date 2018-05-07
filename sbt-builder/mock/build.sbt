name := "mock"

scalaVersion := "2.12.4"

val akkaVersion = "2.5.11"
val akkaHttpVersion = "10.1.1"

resolvers ++= Seq(
  "Sonatype Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases",
  Resolver.bintrayRepo("magnetic-io", "vamp")
)

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
  "com.lightbend.akka" %% "akka-stream-alpakka-sse" % "0.16",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2",
  "io.fabric8" % "kubernetes-client" % "3.1.8",
  "io.fabric8" % "openshift-client" % "3.1.8",
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.6",
  "com.fasterxml.jackson.dataformat" % "jackson-dataformat-yaml" % "2.9.2",
  "com.fasterxml.jackson.core" % "jackson-core" % "2.9.2",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.9.2",
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.9.2",
  "org.apache.commons" % "commons-lang3" % "3.7",
  "com.hazelcast" % "hazelcast" % "3.9.1",
  "javax.cache" % "cache-api" % "1.0.0",
  "com.github.gilbertw1" %% "slack-scala-client" % "0.2.2",
  "ai.api" % "libai" % "1.6.12",
  "io.spray" %% "spray-json" % "1.3.3",
  "com.typesafe.akka" %% "akka-http-spray-json" % "10.0.11",
  "com.github.swagger-akka-http" %% "swagger-akka-http" % "0.11.0",
  "org.feijoas" %% "mango" % "0.14",
  "org.scalactic" %% "scalactic" % "3.0.4",
  "com.typesafe.akka" %% "akka-http-spray-json" % "10.0.11",
  "com.nulab-inc" %% "scala-oauth2-core" % "1.3.0",
  "com.nulab-inc" %% "akka-http-oauth2-provider" % "1.3.0",
  "ch.megard" %% "akka-http-cors" % "0.2.2",
  "io.vamp" % "istio-client-uberjar" % "0.10-vampversion",
  "io.vamp" % "conditionals" % "0.1.10" exclude("org.sonatype.sisu", "sisu-guava"),
  "com.github.seratch" % "jslack" % "1.0.26",
  "com.chuusai" %% "shapeless" % "2.3.3",
  "com.typesafe.akka" %% "akka-http-testkit" % "10.0.11" % Test,
  "org.mockito" % "mockito-core" % "2.13.0" % Test,
  "org.scalatest" %% "scalatest" % "3.0.4" % Test
  )
