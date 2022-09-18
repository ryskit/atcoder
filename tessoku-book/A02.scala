package tessoku_bookA02

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val x = sc.nextInt
  val as = (1 to n).foldLeft(List.empty[Int])((acc, _) => acc :+ sc.nextInt)
  println(if (as.contains(x)) "Yes" else "No")
}
