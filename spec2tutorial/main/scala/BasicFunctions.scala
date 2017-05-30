package com.specs2tutorial

trait BasicFunctions {
  def sumUpList(ls: List[Int]): Int = {
    ls.foldLeft(0)(_+_)
  }

  def filterList(ls: List[Int], greaterThan: Int): List[Int] = {
    ls.filter(e => e > greaterThan)
  }

  def findGCD(n:Int,m:Int): Int =
    if (m == 0) n
    else findGCD(m, n % m)
}
