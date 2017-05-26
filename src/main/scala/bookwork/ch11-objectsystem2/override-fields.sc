// src/main/scala/bookwork/ch11-objectsystem2/override-fields.sc

class C1 {
  val name = "C1"
  var count = 0
}

class ClassWithC1 extends C1 {
  override val name = "ClassWithC1"
  count = 1
}

val c = new ClassWithC1()
println(c.name)
println(c.count)

// ABSTRACT overrides --------------------------------------

abstract class C2 {
  val name: String
  var count: Int
}

class ClassWithC2 extends C2 {
  val name = "ClassWithC2"
  var count = 1
}

val c2 = new ClassWithC1()
println(c2.name)
println(c2.count)
