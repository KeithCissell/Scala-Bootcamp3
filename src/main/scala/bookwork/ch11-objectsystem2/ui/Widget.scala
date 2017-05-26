// src/main/scala/bookwork/ch11-objectsystem2/ui/Widget.scala
package bookwork.objectsystem.ui

abstract class Widget {
  def draw(): Unit
  override def toString() = "(widget)"
}
