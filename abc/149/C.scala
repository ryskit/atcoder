package C149

import java.util.Scanner
import scala.annotation.tailrec
import scala.util.control.Breaks

object Main extends App {
  val scanner = new Scanner(System.in)
  val x = scanner.nextInt
  val b = new Breaks
  var i = x
  b.breakable {
    while (true) {
      if (i == 2) b.break()
      else if (i % 2 == 0) i += 1
      else {
        if (isPrime(i, 2)) b.break
        else i += 1
      }
    }
  }

  println(i)

  @tailrec
  def isPrime(x: Int, divider: Int): Boolean = {
    if (x % divider == 0) false
    else {
      val nextDivider = divider + 1
      if (x == nextDivider) true
      else isPrime(x, divider + 1)
    }
  }
}
