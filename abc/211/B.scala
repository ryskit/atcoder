package abc211B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val ans = if (Set.fill(4)(sc.next).size == 4) "Yes" else "No"
  println(ans)
}
