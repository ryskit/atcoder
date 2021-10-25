package arc086C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, k = sc.nextInt
  val variations = (1 to n).foldLeft(Map.empty[Int, Int]) {
    case (acc, _) =>
      val a = sc.nextInt
      acc + (a -> (acc.getOrElse(a, 0) + 1))
  }
  val sortedVariations = variations.toVector.sortBy(x => x._2)
  val variationCount = variations.size
  val answer =
    if (variationCount <= k) 0
    else
      (0 until variationCount - k).foldLeft(0L) {
        case (sum, i) => sum + sortedVariations(i)._2
      }

  println(answer)
}
