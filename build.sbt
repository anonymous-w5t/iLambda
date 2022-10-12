val scala3Version = "3.1.1"

lazy val xyz = project.in(file("lib/xyz"))
  .enablePlugins(ScalaJSPlugin)
  .settings(scalaVersion := scala3Version)

lazy val whilelang = project.in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "lambda",
    version := "0.1.0",
    scalaVersion := scala3Version,
    scalaJSUseMainModuleInitializer := true,
    Compile / mainClass := Some("lambda.frontend.Main"),
    Compile / fastLinkJS / scalaJSLinkerOutputDirectory := baseDirectory.value / "lib" / "xyz"/ "tool" / "js" / "gen",
    libraryDependencies ++= Seq(
      ("org.typelevel" %%% "cats-parse" % "0.3.4")
    )
  )
  .dependsOn(xyz)