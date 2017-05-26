// src/main/scala/bookwork/ch11-objectsystem2/ui/Button.scala
package bookwork.objectsystem.ui
import bookwork.objectsystem.ui.Clickable

class Button(val label: String) extends Widget with Clickable {

  // Simple hack for demonstration process
  def draw(): Unit = println(s"Drawing: $this")

  // From Clickable:
  protected def updateUI(): Unit = println(s"$this clicked; updating UI")

  override def toString() = s"(button: label=$label, ${super.toString()})"
}
