package agc015B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val ss = sc.next.toVector
  val total = ss.length - 1
  val ans = ss.zipWithIndex.foldLeft(0L) {
    case (sum, (s, i)) =>
      if (s == 'U') {
        val x1 = (total - i) * 1
        val x2 = i * 2
        sum + x1 + x2
      } else {
        val x1 = i * 1
        val x2 = (total - i) * 2
        sum + x1 + x2
      }
  }
  println(ans)
}
