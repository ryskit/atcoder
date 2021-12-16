package keyence2020C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, k, s = sc.nextInt
  val (ans, _, _) = (1 to n).foldLeft(
    Vector.empty[Int],
    if (s + 1 > 1000000000) 1 else 1000000000,
    k
  ) {
    case ((acc, rem, kCnt), i) =>
      if (kCnt > 0) {
        (acc :+ s, rem, kCnt - 1)
      } else {
        (acc :+ rem, rem, kCnt)
      }
  }
  println(ans.mkString(" "))
}
