package agc009A
// https://atcoder.jp/contests/agc009/tasks/agc009_a

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val as: Array[Long] = Array.fill(n)(0)
  val bs: Array[Long] = Array.fill(n)(0)
  (0 until n).foreach { i =>
    val a, b = sc.nextLong
    as(i) = a
    bs(i) = b
  }
  val total = (n - 1 to 0 by -1).foldLeft(0L) {
    case (currentTotal, i) =>
      val newA = as(i) + currentTotal
      val b = bs(i)
      val r = newA % b
      if (r == 0) currentTotal
      else {
        currentTotal + (b - r)
      }
  }
  println(total)
}
