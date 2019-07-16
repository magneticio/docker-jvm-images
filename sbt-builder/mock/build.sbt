name := "mock"

version := "0.1"

scalaVersion := "2.12.8"

val akkaVersion = "2.5.19"
val akkaHttpVersion = "10.1.8"
val elastic4sVersion = "6.2.9"

resolvers ++= Seq(
  "Sonatype Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases",
  Resolver.bintrayRepo("magnetic-io", "vamp")
)

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
  "io.fabric8" % "kubernetes-client" % "4.3.0",
  "io.fabric8" % "openshift-client" % "4.3.0",
  "org.slf4j" % "slf4j-api" % "1.7.26",
  "com.lightbend.akka" %% "akka-stream-alpakka-sse" % "0.16",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2",
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.6",
  "com.fasterxml.jackson.dataformat" % "jackson-dataformat-yaml" % "2.9.2",
  "com.fasterxml.jackson.core" % "jackson-core" % "2.9.2",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.9.2",
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.9.2",
  "org.apache.commons" % "commons-lang3" % "3.7",
  "com.hazelcast" % "hazelcast" % "3.11.2",
  "com.hazelcast" % "hazelcast-kubernetes" % "1.1.0",
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
  "me.snowdrop" % "istio-client-uberjar" % "1.1.0",
  "me.snowdrop" % "servicecatalog-client" % "1.1.1",
  "io.vamp" % "conditionals" % "0.1.14" exclude("org.sonatype.sisu", "sisu-guava"),
  "com.github.seratch" % "jslack" % "1.0.26",
  "com.chuusai" %% "shapeless" % "2.3.3",
  "org.mongodb" % "mongodb-driver" % "3.5.0",
  "org.shredzone.acme4j" % "acme4j" % "2.1",
  "org.shredzone.acme4j" % "acme4j-utils" % "2.1",
  "org.bouncycastle" % "bcprov-jdk15on" % "1.61",
  "org.bouncycastle" % "bcpkix-jdk15on" % "1.61", 
  "com.sksamuel.elastic4s" %% "elastic4s-core" % elastic4sVersion,
  "com.google.cloud" % "google-cloud-dns" % "0.54.0-alpha",
  "dnsjava" % "dnsjava" % "2.1.8",
  "org.awaitility" % "awaitility-scala" % "3.1.2",
  "org.scalanlp" %% "breeze" % "0.13.2",
  "org.scalanlp" %% "breeze-natives" % "0.13.2",
  "org.f100ded.scala-url-builder" %% "scala-url-builder" % "0.9.0",
  // for the http client
  "com.sksamuel.elastic4s" %% "elastic4s-http" % elastic4sVersion,
  "de.flapdoodle.embed" % "de.flapdoodle.embed.mongo" % "2.0.1" % Test,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test,
  "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion % Test,
  "org.mockito" % "mockito-core" % "2.13.0" % Test,
  "org.scalacheck" %% "scalacheck" % "1.14.0" % Test,
  "org.scalatest" %% "scalatest" % "3.0.8" % Test,
  "org.scalamock" %% "scalamock" % "4.3.0" % Test
)
