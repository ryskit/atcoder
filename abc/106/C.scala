package C106

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s = sc.next
  val k = BigInt(sc.nextLong)
  val answer = if (s.length == 1) {
    s(0)
  } else {
    val ones = s.takeWhile(c => c == '1')
    val idx = s.indexWhere(c => c != '1')
    if (ones.length >= k) "1" else s.charAt(idx).toString
  }
  println(answer)
}
