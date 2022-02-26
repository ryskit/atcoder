package abc241B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, m = sc.nextInt
  val am = (1 to n).foldLeft(Map.empty[Int, Int]) {
    case (acc, i) =>
      val a = sc.nextInt
      acc + (a -> (acc.getOrElse(a, 0) + 1))
  }
  val bs = Vector.fill(m)(sc.nextInt)
  val (_, ans) = bs.foldLeft(am, true) {
    case ((acc, res), b) =>
      if (res) {
        if (acc.getOrElse(b, 0) > 0) {
          (acc + (b -> (acc.getOrElse(b, 0) - 1)), true)
        } else {
          (acc, false)
        }
      } else {
        (acc, false)
      }
  }
  println(if (ans) "Yes" else "No")
}
