import sbt.librarymanagement.CrossVersion

sealed trait ScalaVersionADT extends Product with Serializable
object ScalaVersionADT {
  def fromString(str: String): ScalaVersionADT =
    CrossVersion.partialVersion(str) match {
      case Some((2, 11)) => `2.11`
      case Some((2, 12)) => `2.12`
      case Some((2, 13)) => `2.13`
      case _             => throw new RuntimeException("")
    }
}
case object `2.11` extends ScalaVersionADT
case object `2.12` extends ScalaVersionADT
case object `2.13` extends ScalaVersionADT
