package agc016A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s = sc.next
  val ans = "abcdefghijklmnopqrstuvwxyz".toSeq.foldLeft(Int.MaxValue) {
    case (minCount, c) =>
      var t = s
      var count = 0
      while (t != (c.toString * t.length)) {
        val td = (0 until t.length - 1).foldLeft("") {
          case (con, i) =>
            if (t(i) == c) con + t(i).toString
            else con + t(i + 1).toString
        }
        t = td
        count += 1
      }
      minCount.min(count)
  }
  println(ans)
}
