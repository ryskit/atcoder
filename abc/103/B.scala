package B103

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s, t = sc.next
  val (_, answer) = (0 to s.length).foldLeft(s, false) {
    case ((prev, result), _) =>
      if (result) {
        (prev, result)
      } else {
        val next = prev.last + prev.init
        (next, prev == t)
      }
  }
  println(if (answer) "Yes" else "No")
}
