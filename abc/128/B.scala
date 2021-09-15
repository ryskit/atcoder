package B128

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val m = (0 until n).foldLeft(Map.empty[String, List[(Int, Int)]]) {
    case (acc, idx) =>
      val s = sc.next
      val p = sc.nextInt
      val l = acc.getOrElse(s, List.empty[(Int, Int)])
      acc + (s -> (l :+ (p, idx)))
  }
  m.toSeq
    .sortBy(x => x._1)
    .foreach(v => {
      println(v._2.sortBy(_._1).reverse.map(_._2 + 1).mkString("\n"))
    })
}
