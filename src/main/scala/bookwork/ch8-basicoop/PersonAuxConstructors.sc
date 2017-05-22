// src/main/scala/bookwork/ch8-basicoop/PersonAuxConstructors.sc
import bookwork.basicoop.{Address, Person}

val a1 = new Address("1 Scala Lane", "Anytown", "CA", "98765")
println(a1)

val a2 = new Address("98765")
println(a2)

println(new Person("Buck Trends1"))
println(new Person("Buck Trends2", Some(20), Some(a1)))
println(new Person("Buck Trends3", 20, a2))
println(new Person("Buck Trends4", 20))
