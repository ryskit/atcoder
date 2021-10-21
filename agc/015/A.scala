package abc015A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, a, b = sc.nextLong
  val answer =
    if (a > b) 0
    else if (n == 1) if (a == b) 1 else 0
    else (n - 2) * (b - a) + 1
  println(answer)
}
