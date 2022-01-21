package abc231B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val ans = (1 to n)
    .foldLeft(Map.empty[String, Int]) {
      case (acc, i) =>
        val s = sc.next
        acc + (s -> (acc.getOrElse(s, 0) + 1))
    }
    .maxBy(a => a._2)
    ._1
  println(ans)
}
