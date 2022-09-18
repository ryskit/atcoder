package teppan_bookA03

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val k = sc.nextInt
  val p = (1 to n).foldLeft(List.empty[Int])((acc, _) => acc :+ sc.nextInt)
  val q = (1 to n).foldLeft(List.empty[Int])((acc, _) => acc :+ sc.nextInt)

  var result = "No"
  for {
    pv <- p
    qv <- q
  } {
    if (k == pv + qv) result = "Yes"
  }

  println(result)
}
