package abc221B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s, t = sc.next
  val ok = if (s == t) {
    true
  } else {
    (0 until s.length - 1).foldLeft(false) {
      case (ok, i) =>
        if (!ok) {
          val replaced = s.updated(i, s(i + 1)).updated(i + 1, s(i))
          replaced == t
        } else {
          ok
        }
    }
  }
  println(if (ok) "Yes" else "No")
}
