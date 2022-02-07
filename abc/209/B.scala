package abc209B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, x = sc.nextInt
  val as = Vector.fill(n)(sc.nextInt)
  val sum = as.sum - n / 2
  println(if (x >= sum) "Yes" else "No")
}
