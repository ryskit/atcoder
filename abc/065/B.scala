package B065

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val as =
    (1 to n).foldLeft(Vector.empty[Int] :+ 0)((acc, _) => acc :+ sc.nextInt)
  val (_, answer) = (1 to 101010).foldLeft(as(1), -1) {
    case ((current, result), idx) =>
      if (current == 2) {
        (0, idx)
      } else {
        (as(current), result)
      }
  }
  println(answer)
}
