package A221

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val a, b = sc.nextInt
  val answer = math.pow(32, a - b).toLong
  println(answer)
}
