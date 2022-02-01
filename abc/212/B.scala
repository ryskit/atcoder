package abc212B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val xs = sc.next.toVector.map(_.toString.toInt)

  val ans =
    if (xs.count(x => x == xs.head) == 4) "Weak"
    else {
      val (ans, _) = xs.tail.foldLeft(true, xs.head) {
        case ((res, prev), x) =>
          if (res) {
            if (next(prev) == x) (res, x)
            else (false, x)
          } else {
            (res, x)
          }
      }
      if (ans) "Weak" else "Strong"
    }
  println(ans)

  def next(x: Int): Int = {
    if (x < 9) x + 1
    else 0
  }
}
