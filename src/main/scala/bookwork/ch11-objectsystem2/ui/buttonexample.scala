// src/main/scala/bookwork/ch11-objectsystem2/ui/buttonexample.scala
import bookwork.objectsystem.ui._

object ButtonExample {
  def main(args: Array[String]) {
    val b = new Button("Submit")

    b.draw()
  }
}
