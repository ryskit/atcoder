package abc225A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s = sc.next
  val ans = s.toVector.permutations.foldLeft(Set.empty[String]) {
    case (acc, p) => acc + p.toString()
  }
  println(ans.size)
}
