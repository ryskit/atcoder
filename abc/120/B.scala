import java.util.Scanner

import scala.annotation.tailrec

object B120 extends App {

  @tailrec
  def gcd(x: Int, y: Int): Int = {
    if (y == 0) x
    else gcd(y, x % y)
  }
  val sc = new Scanner(System.in)
  val a = sc.nextInt
  val b = sc.nextInt
  val k = sc.nextInt

  val md = gcd(a, b)
  val l = (1 to md).filter(md % _ == 0)
  println(l(l.size - k))
}
