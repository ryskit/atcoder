package C141

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val k = sc.nextInt
  val q = sc.nextInt
  val as = List.fill(q)(sc.nextInt)
  val winners: Map[Int, Int] = as.foldLeft(Map.empty[Int, Int])({
    case (acc, a) =>
      acc + (a -> (acc.getOrElse(a, 0) + 1))
  })
  (1 to n).foreach { a =>
    val winPoint: Int = winners.getOrElse(a, 0)
    if (k - q + winPoint > 0) {
      println("Yes")
    } else {
      println("No")
    }
  }
}
