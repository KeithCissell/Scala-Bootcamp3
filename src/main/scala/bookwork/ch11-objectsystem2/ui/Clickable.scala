// src/main/scala/bookwork/ch11-objectsystem2/ui/Clickable.scala
package bookwork.objectsystem.ui

trait Clickable {
  def click(): Unit = updateUI

  protected def updateUI(): Unit
}
