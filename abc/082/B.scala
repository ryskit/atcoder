package abc082B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s = sc.next.toCharArray.sorted.mkString("")
  val t = sc.next
  val answer = (0 until t.length).foldLeft(s < t) {
    case (result, i) =>
      if (result) result
      else {
        val (f, b) = t.splitAt(i + 1)
        s < b + f
      }
  }
  println(if (answer) "Yes" else "No")
}
