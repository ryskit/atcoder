package agc006A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val s, t = sc.next
  val answer =
    if (s == t) n
    else {
      val matchLength = (1 until n).foldLeft(0) {
        case (max, i) =>
          val ss = s.slice(i, n)
          val tt = t.slice(0, ss.length)
          if (ss == tt) max.max(ss.length)
          else max
      }
      n * 2 - matchLength
    }

  println(answer)
}
