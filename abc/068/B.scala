package B068

import java.util.Scanner

import scala.annotation.tailrec

object Main extends App {
  val scanner = new Scanner(System.in)
  val N = scanner.nextInt
  val (answer, _) = (1 to N)
    .foldLeft((1, 0))({
      case ((max, count), x) => {
        val c = divideCount(x, 0)
        if (c > count) (x, c)
        else (max, count)
      }
    })
  println(answer)

  @tailrec
  def divideCount(n: Int, acc: Int): Int = {
    if (n % 2 == 0) divideCount(n / 2, acc + 1)
    else acc
  }
}
