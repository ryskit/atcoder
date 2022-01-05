package arc098C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val s = sc.next
  val (eastCount, westCount) = s.toSeq.foldLeft(0, 0) {
    case ((e, w), c) =>
      if (c == 'E') (e + 1, w)
      else (e, w + 1)
  }
  val (_, _, ans) = s.toSeq.zipWithIndex
    .foldLeft((0, 0), (westCount, eastCount), Int.MaxValue) {
      case ((left, right, min), (c, i)) =>
        val (rw, re) = right
        val currentRight = {
          if (c == 'W') (rw - 1, re)
          else (rw, re - 1)
        }
        val nextLeft =
          if (c == 'W') (left._1 + 1, left._2)
          else (left._1, left._2 + 1)
        val turnCount = left._1 + currentRight._2
        (nextLeft, currentRight, min.min(turnCount))
    }
  println(ans)
}
