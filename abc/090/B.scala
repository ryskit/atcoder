package B090

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val a = sc.nextInt
  val b = sc.nextInt
  val answer = (a to b).foldLeft(0) {
    case (count, n) =>
      val f = n / 1000
      val b = n % 100
      if (f / 10 == b % 10 && f % 10 == b / 10) count + 1 else count
  }
  println(answer)
}
