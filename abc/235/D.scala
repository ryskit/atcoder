package abc235D

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val a = sc.nextInt
  val n = sc.nextInt
  val solved = Array.fill[(Boolean, Int)](1000006)((false, Int.MaxValue))
  solved.update(1, (true, 0))
  solve(1, 0)
  val ans = solved(n)
  println(
    if (ans._1) ans._2
    else -1
  )

  def solve(x: Int, count: Int): Unit = {
    if (n * 2 >= x) {
      val currentCount = count + 1
      val p1 = pattern1(x)
      if (solved.isDefinedAt(p1)) {
        val c1 = solved(p1)
        if (!c1._1 || currentCount < c1._2) {
          solved.update(p1, (true, currentCount))
          solve(p1, currentCount)
        }
      }
      if (x >= 10 && x % 10 != 0) {
        val p2 = pattern2(x)
        val c2 = solved(p2)
        if (solved.isDefinedAt(p2)) {
          if (!c2._1 || currentCount < c2._2) {
            solved.update(p2, (true, currentCount))
            solve(p2, currentCount)
          }
        }
      }
    }
  }

  def pattern1(x: Int): Int = {
    x * a
  }

  def pattern2(x: Int): Int = {
    val tmp = x.toString.toSeq
    (tmp.last.toString + tmp.init.toString()).toInt
  }
}
