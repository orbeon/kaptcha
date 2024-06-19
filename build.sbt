libraryDependencies ++= Seq(
  "com.jhlabs" % "filters" % "2.0.235-1",
  "javax.servlet" % "javax.servlet-api" % "3.1.0"
)

scalaVersion      := "2.13.12"
crossPaths        := false
organization      := "org.orbeon"
name              := "kaptcha"
version           := "2.3.3-SNAPSHOT"

githubOwner       := "orbeon"
githubRepository  := "kaptcha"
githubTokenSource := TokenSource.Environment("GITHUB_TOKEN")
