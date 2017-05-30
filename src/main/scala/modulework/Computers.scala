// src/main/scala/modulework/Computers.scala
package modulework.Computers
import modulework.Values._

object Computers {
  abstract class Computer {
    val ram: Int
    val storage: Int
    def getSpecs() = s"RAM: $ram GB" + "\n" + s"HDD: $storage GB"
  }

  class DesktopComputer(ram: Int, storage: Int) extends Computer {
    val externalDevices = List("Keyboard", "Mouse", "Printer")
    def getExternalDevices() = "Devices connected to your desktop computer:\n" + externalDevices
  }

  class CellPhone(ram: Int, storage: Int) extends Computer {
    val carrier = "AT&T"
    def getCarrier() = s"Cellphone Carrier: $carrier"
  }

  def main(args: Array[String]) = {
    val myDesktop = new DesktopComputer(16, 1000)
    println(myDesktop.getSpecs())
    myDesktop.getExternalDevices()

    val myPhone = new CellPhone(4, 64)
    println(myPhone.getSpecs())
    myPhone.getCarrier()
  }
}
