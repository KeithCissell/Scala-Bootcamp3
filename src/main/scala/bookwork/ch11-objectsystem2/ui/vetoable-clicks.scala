// src/main/scala/bookwork/ch11-objectsystem2/ui/vetoable-clicks.scala
import bookwork.objectsystem.ui._
import bookwork.objectsystem.observer._

object VetoClicks {
  def main(args: Array[String]) {

    val observableButton =
      new Button("Okay") with ObservableClicks with VetoableClicks {
        override val maxAllowed: Int = 2
      }

    assert(observableButton.maxAllowed == 2, s"maxAllowed = ${observableButton.maxAllowed}")

    class ClickCountObserver extends Observer[Clickable] {
      var count = 0
      def receiveUpdate(state: Clickable): Unit = count += 1
    }

    val clickCountObserver = new ClickCountObserver
    observableButton.addObserver(clickCountObserver)

    val n = 5
    for (i <- 1 to n) observableButton.click()
  }
}
