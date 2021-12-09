package abc226B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val mapping = (1 to n).foldLeft(Map.empty[Int, Set[String]]) {
    case (acc, i) =>
      val l = sc.nextInt
      val a = Vector.fill(l)(sc.next).toString()
      val s = acc.getOrElse(l, Set.empty[String])
      acc + (l -> (s + a))
  }
  val ans = mapping.foldLeft(0) {
    case (sum, m) => sum + m._2.size
  }
  println(ans)
}
