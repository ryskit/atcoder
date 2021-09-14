package C155

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val (m, max) = (1 to n).foldLeft(Map.empty[String, Int], 0) {
    case ((acc, max), _) =>
      val s = sc.next
      val count = acc.getOrElse(s, 0) + 1
      (acc + (s -> count), math.max(max, count))
  }
  println(m.filter(x => x._2 == max).keys.toSeq.sorted.mkString("\n"))
}
