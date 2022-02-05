package abc238B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val as = Vector.fill(n)(sc.nextInt)
  val borders = Array.fill(n + 1)(0)
  (0 until n).foreach { i =>
    val a = as(i)
    (i + 1 to 0 by -1).foreach { j =>
      if (j == 0) borders.update(j, 0)
      else {
        borders.update(j, calc(borders(j - 1) + a))
      }
    }
  }
  val sortedBorders = borders.sorted :+ 360
  val (ans, _) = sortedBorders.tail.foldLeft(0, sortedBorders.head) {
    case ((max, prev), x) =>
      val d = x - prev
      (max.max(d), x)
  }
  println(ans)

  def calc(n: Int): Int = {
    if (n <= 359) n
    else {
      n - 360
    }
  }
}
