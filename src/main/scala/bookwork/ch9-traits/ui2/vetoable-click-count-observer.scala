// src/main/scala/bookwork/ch9-traits/ui/button-count-observer2.scala
import bookwork.traits.ui2._
import bookwork.traits.observer._

object VCCO {
  def main(args: Array[String]) {

    // no override of "click" in Button required!
    val button = new Button("Click Me!") with ObservableClicks with VetoableClicks {
      override val maxAllowed = 2
    }

    class ClickCountObserver extends Observer[Clickable] {
      var count = 0
      def receiveUpdate(state: Clickable): Unit = count += 1
    }

    val bco1 = new ClickCountObserver
    val bco2 = new ClickCountObserver

    button addObserver bco1
    button addObserver bco2

    (1 to 5) foreach (_ => button.click())

    assert(bco1.count == 2, s"bco1.count ${bco1.count} != 5")
    assert(bco2.count == 2, s"bco2.count ${bco2.count} != 5")
    println("Success!")
  }
}
