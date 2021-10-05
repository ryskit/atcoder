package B046

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, k = sc.nextLong
  val answer = (1L to n).foldLeft(1L) {
    case (total, v) =>
      if (v == 1) total * k
      else total * (k - 1)
  }
  println(answer)
}
