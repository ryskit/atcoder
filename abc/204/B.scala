package abc204B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val as = Vector.fill(n)(sc.nextInt)
  val ans = as.collect {
    case a: Int => if (a >= 10) a - 10 else 0
  }.sum
  println(ans)
}
