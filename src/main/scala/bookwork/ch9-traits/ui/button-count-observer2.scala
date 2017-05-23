// src/main/scala/bookwork/ch9-traits/ui/button-count-observer2.scala
import bookwork.traits.ui._
import bookwork.traits.observer._

object BCO2 {
  def main(args: Array[String]) {

    val button = new Button("Click Me!") with Subject[Button] {

      override def click(): Unit = {
        super.click()
        notifyObservers(this)
      }
    }

    class ButtonCountObserver extends Observer[Button] {
      var count = 0
      def receiveUpdate(state: Button): Unit = count += 1
    }

    val bco1    = new ButtonCountObserver
    val bco2    = new ButtonCountObserver

    button addObserver bco1
    button addObserver bco2

    (1 to 5) foreach (_ => button.click())

    assert(bco1.count == 5)
    assert(bco2.count == 5)
    println("Success!")
  }
}
