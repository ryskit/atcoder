package C121

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, m = sc.nextInt
  val abs = Vector.fill(n)((sc.nextLong, sc.nextInt))
  val (answer, _) = abs.sortBy(x => x._1).foldLeft(0L, m) {
    case ((sumPrice, mm), ab) =>
      if (mm == 0) (sumPrice, mm)
      else {
        val buyCnt = if (mm >= ab._2) ab._2 else mm
        val prices = ab._1 * buyCnt
        (sumPrice + prices, mm - buyCnt)
      }
  }
  println(answer)
}
