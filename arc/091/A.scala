package arc091A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, m = sc.nextLong

  val answer =
    if (n == 1 && m == 1) 1
    else if (n == 1) m - 2
    else if (m == 1) n - 2
    else (n - 2) * (m - 2)

  println(answer)
}
