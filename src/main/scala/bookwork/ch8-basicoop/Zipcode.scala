// src/main/scala/bookwork/ch8-basicoop/Zipcode.scala
package bookwork.basicoop

case class ZipCode(zip: Int, extension: Option[Int] = None) {
  require(valid(zip, extension),
    s"Invalid Zip+4 specified: $toString")

  protected def valid(z: Int, e: Option[Int]): Boolean = {
    if (0 < z && z <= 99999) e match {
      case None       => validUSPS(z, 0)
      case Some(e)  => 0 < e && e <= 9999 && validUSPS(z, e)
    }
    else false
  }

  /** Is it a real US Postal Service zip code? */
  protected def validUSPS(i: Int, e: Int): Boolean = true

  override def toString =
    if (extension != None) s"$zip-${extension.get}" else zip.toString
}

object ZipCode {
  def apply (zip: Int, extension: Int): ZipCode =
    new ZipCode(zip, Some(extension))


  def main(args: Array[String]) {
    println(ZipCode(12345))
    println(ZipCode(12345, Some(6789)))
    println(ZipCode(12345, 6789))

    try {
      ZipCode(0, 6789)
    } catch {
      case e: java.lang.IllegalArgumentException => e
    }

    try{
      ZipCode(12345, 0)
    } catch {
      case e: java.lang.IllegalArgumentException => e
    }
  }
}
