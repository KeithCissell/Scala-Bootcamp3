// src/main/scala/bookwork/ch9-traits/ui/ObservableButton.scala
package bookwork.traits.ui
import bookwork.traits.observer._

class ObservableButton(name: String)
    extends Button(name) with Subject[Button] {

  override def click(): Unit = {
    super.click
    notifyObservers(this)
  }
}
