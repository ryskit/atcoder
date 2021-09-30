package B055

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val answer = (1 to n).foldLeft(1L) {
    case (p, i) => p * i % 1_000_000_007L
  }
  println(answer)
}
