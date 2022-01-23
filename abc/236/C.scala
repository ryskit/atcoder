package abc236C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, m = sc.nextInt
  val ss = Vector.fill(n)(sc.next)
  val ts = (1 to m).foldLeft(Map.empty[String, String]) {
    case (acc, i) =>
      val t = sc.next
      acc + (t -> t)
  }
  val ans = ss.foldLeft(Vector.empty[String]) {
    case (acc, s) =>
      if (ts.isDefinedAt(s)) acc :+ "Yes" else acc :+ "No"
  }
  println(ans.mkString("\n"))
}
