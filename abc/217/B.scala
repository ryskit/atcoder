package abc217B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val ss = Set.fill(3)(sc.next)
  val ans = Vector("ABC", "ARC", "AGC", "AHC").foldLeft("") {
    case (r, s) =>
      if (!ss.contains(s)) s
      else r
  }
  println(ans)
}
