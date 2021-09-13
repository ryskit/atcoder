package A003

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val ss = sc.next
  val (n, w, s, e) = ss.foldLeft(0, 0, 0, 0) {
    case ((n, w, s, e), c) =>
      c match {
        case 'N' => (n + 1, w, s, e)
        case 'W' => (n, w + 1, s, e)
        case 'S' => (n, w, s + 1, e)
        case 'E' => (n, w, s, e + 1)
      }
  }

  println(if (isOk(n, s) && isOk(w, e)) "Yes" else "No")

  def isOk(x: Int, y: Int): Boolean = {
    (x == 0 && y == 0) || (x != 0 && y != 0)
  }
}
