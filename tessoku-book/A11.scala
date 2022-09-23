package tessoku_book_A11

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val x = sc.nextInt
  val a = (1 to n).foldLeft(Array.fill(n + 1)(0)) {
    case (acc, i) =>
      acc(i) = sc.nextInt
      acc
  }

  def binarySearch(x: Int, n: Int): Int = {
    @scala.annotation.tailrec
    def go(x: Int, l: Int, r: Int): Int = {
      val m = (l + r) / 2
      if (x == a(m)) m
      else if (x < a(m)) go(x, l, m - 1)
      else go(x, m + 1, r)
    }
    go(x, 1, n)
  }

  val ans = binarySearch(x, n)
  println(ans)
}
