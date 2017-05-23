// src/main/scala/bookwork/ch9-traits/ui/Clickable.scala
package bookwork.traits.ui2

trait Clickable {
  def click(): Unit = updateUI

  protected def updateUI(): Unit
}
