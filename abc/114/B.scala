package B114

import java.util.Scanner

object Main extends App {
  val scanner = new Scanner(System.in)
  val s = scanner.next
  val target = 753
  val (_, answer) = (1 to s.length - 2).foldLeft(s, Int.MaxValue)({
    case ((str, diff), _) => {
      val x = str.take(3).mkString("").toInt
      val d = math.abs(x - target)
      if (diff > d) (str.tail, d)
      else (str.tail, diff)
    }
  })
  println(answer)
}
