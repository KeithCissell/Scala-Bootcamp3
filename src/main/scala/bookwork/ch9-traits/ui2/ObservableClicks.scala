// src/main/scala/bookwork/ch9-traits/ui/ObservableClicks.scala
package bookwork.traits.ui2
import bookwork.traits.observer._

trait ObservableClicks extends Clickable with Subject[Clickable] {
  abstract override def click(): Unit = {
    super.click()
    notifyObservers(this)
  }
}
