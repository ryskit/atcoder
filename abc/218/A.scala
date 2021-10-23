package abc218A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val s = sc.next
  val answer = if (s(n - 1) == 'o') "Yes" else "No"
  println(answer)
}
