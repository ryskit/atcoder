package B066

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s = sc.next
  val (answer, _) = (2 to s.length - 2 by 2).foldLeft(0, s) {
    case ((maxLength, prev), _) =>
      val current = prev.dropRight(2)
      val len = current.length
      val (f, b) = current.splitAt(len / 2)
      if (f == b) {
        (maxLength.max(current.length), current)
      } else {
        (maxLength, current)
      }
  }
  println(answer)
}
