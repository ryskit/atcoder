package A029

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s = sc.next
  var sv = s.toVector
  val (answer, _) = (0 until sv.size).foldLeft(0L, 0) {
    case ((acc, count), idx) =>
      val current = sv(idx)
      if (current == 'W') {
        (acc + idx - count, count + 1)
      } else (acc, count)
  }
  println(answer)
}
