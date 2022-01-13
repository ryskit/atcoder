package abc047C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s = sc.next

  val (total, _) = s.tail.foldLeft(0, s.head) {
    case ((total, prev), c) =>
      if (c == prev) (total, c)
      else (total + 1, c)
  }
  println(total)
}
