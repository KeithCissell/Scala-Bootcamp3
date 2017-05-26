// src/main/scala/modulework/Computers.scala
import modulework.Values._

object Computers {
  abstract class Computer {
    val ram: Int
    val storage: Int
    def getSpecs() = {
      println(s"RAM: $ram GB")
      println(s"HDD: $storage GB")
    }
  }

  case class DesktopComputer(ram: Int, storage: Int, externalDevices: List[String])
  extends Computer {
    def getExternalDevices() = {
      println("Devices connected to your desktop computer:")
      for (d <- externalDevices) println(d)
      println
    }
  }

  case class CellPhone(ram: Int, storage: Int, carrier: String)
  extends Computer {
    def getCarrier() = println(s"Cellphone Carrier: $carrier")
  }

  def main(args: Array[String]) = {
    val myExternalDevices = List("Keyboard", "Mouse", "Printer")
    val myDesktop = new DesktopComputer(16, 1000, myExternalDevices)
    myDesktop.getSpecs()
    myDesktop.getExternalDevices()

    val myPhone = new CellPhone(4, 64, "AT&T")
    myPhone.getSpecs()
    myPhone.getCarrier()
  }
}
