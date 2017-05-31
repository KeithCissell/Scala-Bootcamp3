package com.specs2tutorial
import org.specs2.mutable.Specification

object BasicFunctionsSpec extends Specification with BasicFunctions {
  "when we send a list of Ints sumUpList" should {
    "add them up" in {
      val numbers:List[Int] = List(1,2,3,4,5)
      // the triple equal sign is shorthand for checking if two values are the same
      sumUpList(numbers) === 15

      // This would also work
      sumUpList(numbers) must beEqualTo(15)

      // Or This
      sumUpList(numbers) must be_==(15)
    }
  }

  "when we send a list of Ints to filterList filterList" should {
    "only contain the unfiltered Ints" in {
      val numbers:List[Int] = List(1,2,3,4,5)
      val filteredList = filterList(numbers,2)

      //filteredList should not contain 1 or 2 so lets check that the size is right
      filteredList.size must be_==(3)

      //In this case we know what numbers filteredList must contain so lets check that they're there
      filteredList must contain(3,4,5)
    }
  }

  "when we send two integers findGCD" should {
    "find the greatest common divisor" in {
      val gcd = findGCD(45, 63)
      //The gcd of 45 and 63 is 9 so lets see if thats what we got!
      gcd === 9
    }
  }
}
