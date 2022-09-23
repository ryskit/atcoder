package tessoku_book_A12

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val k = sc.nextInt
  val a = (1 to n).foldLeft(Array.fill(n + 1)(0)) { (acc, i) =>
    acc(i) = sc.nextInt
    acc
  }

  var l: Long = 1
  var r: Long = 1000000000
  while (l < r) {
    val m = (l + r) / 2
    val ans = check(m)
    if (ans) r = m
    else l = m + 1
  }
  println(l)

  def check(x: Long): Boolean = {
    var sum: Long = 0
    (1 to n).foreach { i =>
      sum += x / a(i).toLong
    }
    sum >= k
  }
}
