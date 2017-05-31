// src/main/scala/modulework/Computers.scala
package modulework.Computers
import modulework.Values._

object Computers {
  abstract class Computer(val ram: Int, val storage: Int) {
    def getSpecs() = s"RAM: $ram GB" + "\n" + s"HDD: $storage GB"
  }

  class DesktopComputer(ram: Int, storage: Int, externalDevices: List[String])
      extends Computer(ram, storage) {
    def getExternalDevices() = "Devices connected to your desktop computer:\n" + externalDevices
  }

  class CellPhone(ram: Int, storage: Int, carrier: String)
      extends Computer(ram, storage) {
    def getCarrier() = s"Cellphone Carrier: $carrier"
  }

  def main(args: Array[String]) = {
    val myExternalDevices = List("Keyboard", "Mouse", "Printer")
    val myDesktop = new DesktopComputer(16, 1000, myExternalDevices)
    println(myDesktop.getSpecs())
    println(myDesktop.getExternalDevices())

    val myPhone = new CellPhone(4, 64, "AT&T")
    println(myPhone.getSpecs())
    println(myPhone.getCarrier())
  }
}
