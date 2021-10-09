package A042

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val v = Vector.fill(3)(sc.nextInt)
  println(if (v.count(_ == 5) == 2 && v.count(_ == 7) == 1) "YES" else "NO")
}
