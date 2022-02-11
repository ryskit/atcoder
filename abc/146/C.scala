package abc146C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val a, b, x = sc.nextLong

  var ok = 0L
  var ng = 1000000001L
  while (ok + 1 != ng) {
    val mid = (ok + ng) / 2
    if (check(mid) <= x) {
      ok = mid
    } else {
      ng = mid
    }
  }
  println(ok)

  def check(n: Long): Long = {
    a * n + b * d(n)
  }

  def d(n: Long): Int = {
    n.toString.length
  }
}
