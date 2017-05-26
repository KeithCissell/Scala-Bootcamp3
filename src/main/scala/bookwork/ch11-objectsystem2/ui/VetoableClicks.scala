// src/main/scala/bookwork/ch9-traits/ui2/VetoableClicks.scala
package bookwork.objectsystem.ui
import bookwork.objectsystem.observer._

trait VetoableClicks extends Clickable {
  // Default number of allowed clicks.
  val maxAllowed = 1
  private var count = 0

  abstract override def click() = {
    if (count < maxAllowed) {
      count += 1
      super.click()
    }
  }
}
