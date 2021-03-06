import sbt._

object LibraryDependencies {
  val ScalaCheck = "org.scalacheck" %% "scalacheck" % "1.15.1"
  val TypesafeConfig = "com.typesafe" % "config" % "1.4.1"
  val ApacheCommons = "org.apache.commons" % "commons-lang3" % "3.11"
  val ScalaTest = "org.scalatest" %% "scalatest" % "3.2.3"
  val ScalaTestPlusScalaCheck =
    "org.scalatestplus" %% "scalacheck-1-14" % "3.2.2.0"
  val KindProjector = "org.typelevel" % "kind-projector" % "0.11.1"
  val OrganizeImports =
    "com.github.liancheng" %% "organize-imports" % "0.4.4"
  val PureConfig = "com.github.pureconfig" %% "pureconfig" % "0.14.0"
  val ScalaCheckGenRegexp = "wolfendale" %% "scalacheck-gen-regexp" % "0.1.2"
  val NewType = "io.estatico" %% "newtype" % "0.4.4"
}
