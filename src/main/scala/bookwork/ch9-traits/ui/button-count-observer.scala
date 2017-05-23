// src/main/scala/bookwork/ch9-traits/ui/button-count-observer.scala
import bookwork.traits.ui._
import bookwork.traits.observer._

object BCO {
  def main(args: Array[String]) {
    
    class ButtonCountObserver extends Observer[Button] {
      var count = 0
      def receiveUpdate(state: Button): Unit = count += 1
    }

    val button  = new ObservableButton("Click Me!")
    val bco1    = new ButtonCountObserver
    val bco2    = new ButtonCountObserver

    button addObserver bco1
    button addObserver bco2

    (1 to 5) foreach (_ => button.click())

    assert(bco1.count == 5)
    assert(bco2.count == 5)
  }
}
