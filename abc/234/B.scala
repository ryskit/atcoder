package abc234B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val points = Vector.fill(n) {
    val x, y = sc.nextDouble
    (x, y)
  }
  val ans = (0 until n).foldLeft(0d) {
    case (max, i) =>
      val max2 = (i + 1 until n).foldLeft(0d) {
        case (max2, j) =>
          val a = points(i)
          val b = points(j)
          val x1 = math.abs(a._1 - b._1)
          val y1 = math.abs(a._2 - b._2)
          max2.max(math.sqrt(x1 * x1 + y1 * y1))
      }
      max.max(max2)
  }
  println(f"$ans%.10f")
}
