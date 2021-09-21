package A012

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val as = Vector.fill(3 * n)(sc.nextLong).sorted
  val answer = (0 until n).foldLeft(0L) {
    case (sum, i) => sum + as(3 * n - 1 - (2 * i + 1))
  }
  println(answer)
}
