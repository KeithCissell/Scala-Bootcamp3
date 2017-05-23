// src/main/scala/bookwork/ch9-traits/ui/Button2.scala
package bookwork.traits.ui2
import bookwork.traits.ui.Widget

class Button(val label: String) extends Widget with Clickable {
  protected def updateUI(): Unit = { /* logic to change GUI appearance */ }
}
