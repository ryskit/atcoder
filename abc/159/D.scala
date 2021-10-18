package abc159D

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val ma = Array.fill(2 * 100000 + 5)(0L)
  val as = (1 to n).foldLeft(Vector.empty[Int]) {
    case (va, _) =>
      val a = sc.nextInt
      ma.update(a, ma(a) + 1L)
      va :+ a
  }
  val eachCombinations = Array.fill(2 * 100000 + 5)(0L)
  val total = ma.zipWithIndex.foldLeft(0L) {
    case (combinations, (m, i)) =>
      if (2 <= m) {
        val c = m * (m - 1) / 2
        eachCombinations.update(i, c)
        combinations + c
      } else combinations
  }
  as.foreach { a =>
    val combination = eachCombinations(a)
    val aCount = ma(a)
    if (aCount - 1 < 2) {
      println(total - combination)
    } else {
      val currentCombination = (aCount - 1L) * (aCount - 2L) / 2L
      println(total - (combination - currentCombination))
    }
  }
}
