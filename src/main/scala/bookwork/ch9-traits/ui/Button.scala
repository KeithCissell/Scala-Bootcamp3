// src/main/scala/bookwork/ch9-traits/ui/Button.scala
package bookwork.traits.ui

class Button(val label: String) extends Widget {

  def click(): Unit = updateUI

  def updateUI: Unit = { /* logic to change GUI appearance */ }
}
