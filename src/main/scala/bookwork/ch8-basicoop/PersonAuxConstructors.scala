// src/main/scala/bookwork/ch8-basicoop/PersonAuxConstructors.scala
package bookwork.basicoop

case class Address(street: String, city: String, state: String, zip: String) {

  def this(zip: String) =
    this("[unknown]", Address.zipToCity(zip), Address.zipToState(zip), zip)
}

object Address {

  def zipToCity(zip: String) = "Anytown"
  def zipToState(zip: String) = "CA"
}

case class Person(
  name: String, age: Option[Int], address: Option[Address]) {

  def this(name: String) = this(name, None, None)

  def this(name: String, age: Int) = this(name, Some(age), None)

  def this(name: String, age: Int, address: Address) =
    this(name, Some(age), Some(address))

  def this(name: String, address: Address) = this(name, None, Some(address))
}

object PersonAuxConstructors {
  def main(args: Array[String]) {

    val a1 = new Address("1 Scala Lane", "Anytown", "CA", "98765")
    println(a1)

    val a2 = new Address("98765")
    println(a2)

    println(new Person("Buck Trends1"))
    println(new Person("Buck Trends2", Some(20), Some(a1)))
    println(new Person("Buck Trends3", 20, a2))
    println(new Person("Buck Trends4", 20))
  }
}
