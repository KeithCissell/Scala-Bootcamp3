// src/main/scala/bookwork/ch9-traits/ui/ObservableClicks.scala
package bookwork.objectsystem.ui
import bookwork.objectsystem.observer._

trait ObservableClicks extends Clickable with Subject[Clickable] {
  abstract override def click(): Unit = {
    super.click()
    notifyObservers(this)
  }
}
