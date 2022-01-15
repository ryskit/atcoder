package abc235B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val hs = Vector.fill(n)(sc.nextLong)
  val (ans, _) = hs.tail.foldLeft(hs.head, true) {
    case ((current, keep), h) =>
      if (keep) {
        if (current < h) (h, keep)
        else (current, false)
      } else {
        (current, keep)
      }
  }
  println(ans)
}
