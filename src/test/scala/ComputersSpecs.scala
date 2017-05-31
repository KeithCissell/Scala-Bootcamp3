// src/test/scala/ComputersSpecs.scala
package modulework
import org.specs2.mutable.Specification

object ComputersSpecs extends Specification {
  import modulework.Computers

  "DesktopComputer takes amount of Ram, Storage and connected device" should {
    "return strings for them" in {
      val myExternalDevices = List("Keyboard", "Mouse", "Printer")
      val myDesktop = new DesktopComputer(16, 1000, myExternalDevices)

      // Check if computer was setup correctly
      myDesktop.ram === 16
      myDesktop.storage === 10
      myDesktop.externalDevices === myExternalDevices

      // Test .getSpecs() inherited from Computer
      myDesktop.getSpecs() === "RAM: 16 GB\nHDD: 1000 GB"

      // Test .getNumDevices()
      myDesktop.getNumDevices() === 3
    }
  }

}
