// src/main/scala/bookwork/ch11-objectsystem2/payroll-template-method.sc

case class Address(city: String, state: String, zip: String)
case class Employee(name: String, salary: Double, address: Address)

abstract class Payroll {
  def netPay(employee: Employee): Double = {
    val fedTaxes = calcFedTaxes(employee.salary)
    val stateTaxes = calcStateTaxes(employee.salary, employee.address)
    employee.salary - fedTaxes - stateTaxes
  }

  def calcFedTaxes(salary: Double): Double
  def calcStateTaxes(salary: Double, address: Address): Double
}

object Payroll2014 extends Payroll {
  val stateRate = Map(
    "XX" -> 0.05,
    "YY" -> 0.03,
    "ZZ" -> 0.0)

  def calcFedTaxes(salary: Double): Double = salary * 0.25
  def calcStateTaxes(salary: Double, address: Address): Double = {
    // Assume the address.state is valid
    salary * stateRate(address.state)
  }
}

val tom = Employee("Tom Jones", 100000.0, Address("MyTown", "XX", "12345"))
val jane = Employee("Jane Doe", 110000.0, Address("BigCity", "YY", "67890"))

println(Payroll2014.netPay(tom))
println(Payroll2014.netPay(jane))
