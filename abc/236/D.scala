package abc236D
// https://atcoder.jp/contests/abc236/tasks/abc236_d

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val dp: Array[Array[Int]] = Array.ofDim(n * 2 + 1, n * 2 + 1)
  (1 until 2 * n).foreach { i =>
    (i + 1 to 2 * n).foreach { j =>
      val x = sc.nextInt
      val jRow = dp(i)
      jRow.update(j, x)
      dp.update(i, jRow)
    }
  }

  var ans = 0
  def calc(dancer: Vector[Int], score: Int): Unit = {
    if (dancer.isEmpty) {
      ans = math.max(ans, score)
    } else {
      val last = dancer.last
      for (i <- 0 until dancer.size - 1) {
        val other = dancer(i)
        calc(
          dancer.slice(0, i) ++ dancer.slice(i + 1, dancer.size - 1),
          score ^ dp(other)(last)
        )
      }
    }
  }
  calc((1 to 2 * n).toVector, 0)
  println(ans)
}
