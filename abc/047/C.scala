package abc047C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s = sc.next

  // WWBBWBWBWWBB
  //
  val (total1, _) = s.tail.foldLeft(0, s.head) {
    case ((total, prev), c) =>
      if (c == prev) (total, c)
      else (total + 1, c)
  }
  val (total2, _) = s.reverse.tail.foldLeft(0, s.reverse.head) {
    case ((total, prev), c) =>
      if (c == prev) (total, c)
      else (total + 1, c)
  }
  println(total1.min(total2))
}
