// To test the template run `g8` or `g8Test` from the sbt session.
lazy val root = (project in file(".")).
  settings(
    name := "csw.g8",
    test in Test := {
      val _ = (g8Test in Test).toTask("").value
    },
    scriptedLaunchOpts ++= List("-Xms1024m", "-Xmx1024m", "-XX:ReservedCodeCacheSize=128m", "-Xss2m", "-Dfile.encoding=UTF-8"),
    resolvers += Resolver.url("typesafe", url("http://repo.typesafe.com/typesafe/ivy-releases/"))(Resolver.ivyStylePatterns),
    scriptedBufferLog := false
  )