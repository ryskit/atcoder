package codefestival2017qualcB

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val as = Vector.fill(n)(sc.nextInt)
  val (r, total) = as.foldLeft(1, 1) {
    case ((r, total), a) =>
      val tr =
        if (a % 2 == 0) r * 2
        else r
      (tr, total * 3)
  }
  println(total - r)
}
