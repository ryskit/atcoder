package arc086A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, k = sc.nextInt
  val variationCount = (1 to n)
    .foldLeft(Set.empty[Int]) {
      case (acc, i) =>
        val a = sc.nextInt
        acc + a
    }
    .size

  val answer =
    if (variationCount <= k) 0
    else variationCount - k

  println(answer)
}
