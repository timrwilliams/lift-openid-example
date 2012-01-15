name := "timrwilliams"
 
scalaVersion := "2.9.1"

seq(webSettings :_*)

scanDirectories in Compile := Nil

resolvers ++= Seq(
  "Scala Tools Snapshot" at "http://scala-tools.org/repo-releases/",
  "Scala Tools Snapshot" at "http://scala-tools.org/repo-snapshots/",
  "Java.net Maven2 Repository" at "http://download.java.net/maven/2/",
  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
  "JetS3t Repository" at "http://www.jets3t.org/maven2"
)

// if you have issues pulling dependencies from the scala-tools repositories (checksums don't match), you can disable checksums
//checksums := Nil

libraryDependencies ++= {
  val liftVersion = "2.4-M5" // Put the current/latest lift version here
  Seq(
    "net.liftweb" %% "lift-webkit" % liftVersion % "compile->default",
    "net.liftweb" %% "lift-mapper" % liftVersion % "compile->default",
    "net.liftweb" %% "lift-widgets" % liftVersion % "compile->default",
    "net.liftweb" %% "lift-openid" % liftVersion % "compile->default",
    "net.liftweb" %% "lift-wizard" % liftVersion % "compile->default")
}

libraryDependencies += "org.mortbay.jetty" % "jetty" % "6.1.22" % "container"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "0.9.26"

libraryDependencies += "org.scalatest" %% "scalatest" % "1.6.1" % "test"
