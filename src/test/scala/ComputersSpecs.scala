// src/test/scala/ComputersSpecs.scala
package modulework
import org.specs2.mutable.Specification

object ComputersSpecs extends Specification {
  import modulework.Computers._

  "DesktopComputer takes amount of Ram, Storage and connected device and" should {
    val myExternalDevices = List("Keyboard", "Mouse", "Printer")
    val myDesktop = new DesktopComputer(16, 1000, myExternalDevices)

    "Properly construct the class" in {
      // Check if computer was setup correctly
      (myDesktop.ram === 16) and
      (myDesktop.storage === 1000) and
      (myDesktop.externalDevices === myExternalDevices)
    }
    "Return proper string for getSpecs" in {
      // Test .getSpecs() inherited from Computer
      myDesktop.getSpecs() === "RAM: 16 GB\nHDD: 1000 GB"
    }
    "Return the number of devices connected" in {
      // Test .getNumDevices()
      myDesktop.getNumDevices() === 3
    }
  }

  "CellPhone takes amount of Ram, Storage and a Carrier and" should {
    val myPhone = new CellPhone(4, 64, "AT&T")

    "Properly construct the class" in {
      // Check if computer was setup correctly
      (myPhone.ram === 4) and
      (myPhone.storage === 64) and
      (myPhone.carrier === "AT&T")
    }
    "Return proper string for getSpecs" in {
      // Test .getSpecs() inherited from Computer
      myPhone.getSpecs() === "RAM: 4 GB\nHDD: 64 GB"
    }
    "Return proper string fro getCarrier" in {
      // Test .getCarrier
      myPhone.getCarrier() === "Cellphone Carrier: AT&T"
    }
  }
}
