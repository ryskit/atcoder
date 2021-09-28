package B100

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val d, n = sc.nextInt
  val answer =
    if (d == 0) {
      if (n == 100) n + 1 else n
    } else {
      val v = math.pow(100, d).toInt
      if (n == 100) v * n + v else v * n
    }
  println(answer)
}
