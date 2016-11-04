scalaVersion := "2.12.0"

libraryDependencies ++= Seq(
  "org.scalikejdbc" %% "scalikejdbc" % "2.5.0-RC2",
  "org.mindrot"     %  "jbcrypt"     % "0.3m",
  "org.scalatest"   %% "scalatest"   % "3.0.0" % "test"
)
