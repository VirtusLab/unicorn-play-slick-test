name := """sports-insurance-server"""

version := "1.0-SNAPSHOT"

resolvers += "sonatype-staging" at "https://oss.sonatype.org/content/repositories/staging/"

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.2.2",
  "com.typesafe.play" %% "play-slick" % "0.8.0-M1",
  "org.postgresql" % "postgresql" % "9.2-1003-jdbc4"
//  "org.virtuslab" %% "unicorn-play" % "0.6.0-M7"
)

fork in Test := false

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalacOptions ++= Seq("-feature")