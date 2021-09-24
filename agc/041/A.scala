package A041

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, a, b = sc.nextLong
  val diff = b - a
  val answer =
    if (diff % 2 == 0) diff / 2
    else {
      val left = a + (diff - 1) / 2
      val right = n - b + 1 + (diff - 1) / 2
      left.min(right)
    }

  println(answer)
}
