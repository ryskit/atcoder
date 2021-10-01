package C145

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val p = (0 until n).permutations.toSeq
  val xys = Vector.fill(n)((sc.nextInt, sc.nextInt))
  val sum = p.foldLeft(0d) {
    case (sum, ts) =>
      val (distance, _) = ts.tail.foldLeft(0d, xys(ts.head)) {
        case ((d, prev), cidx) => {
          val current = xys(cidx)
          val x = prev._1 - current._1
          val y = prev._2 - current._2
          (d + math.sqrt((x * x) + (y * y)), current)
        }
      }
      sum + distance
  }
  println(sum / p.length)
}
