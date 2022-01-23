package abc236B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val as = (1 until n * 4).foldLeft(Map.empty[Int, Int]) {
    case (acc, i) =>
      val a = sc.nextInt
      acc + (a -> (acc.getOrElse(a, 0) + 1))
  }
  val ans = as.foldLeft(0) {
    case (ans, pair) => if (pair._2 == 3) pair._1 else ans
  }
  println(ans)
}
