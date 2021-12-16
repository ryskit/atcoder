package abc137C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt

  val acc = (0 until n).foldLeft(Map.empty[String, Long]) {
    case (acc, i) =>
      val s = sc.next.toSeq.sorted.toString()
      if (acc.contains(s)) {
        acc + (s -> (acc.getOrElse(s, 0L) + 1L))
      } else {
        acc + (s -> 0L)
      }
  }
  println(acc.toSeq)
  println(acc.values.map(i => (0L to i).sum).sum)
}
