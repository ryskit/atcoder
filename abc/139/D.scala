package D139

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextLong

  val answer =
    if (n == 1) 0
    else {
      (1L until n).sum
    }
  println(answer)
}
