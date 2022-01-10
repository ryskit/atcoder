package agc039A
// https://atcoder.jp/contests/agc039/tasks/agc039_a

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s = sc.next
  val k = sc.nextLong
  val firstChar = s.head
  val lastChar = s.last
  val firstCharCount = s.takeWhile(c => c == firstChar).length
  val lastCharCount = s.reverse.takeWhile(c => c == lastChar).length

  val ans = if (s.length == firstCharCount) {
    firstCharCount.toLong * k / 2
  } else {
    val betweenStr = s.slice(s.length - lastCharCount, s.length) + s.slice(
      0,
      s.length - lastCharCount
    )
    if (k > 1) {
      val (_, replaceCount1) = s.tail.foldLeft(s.head, 0L) {
        case ((prev, replaceCount), c) =>
          if (c == prev) ('0', replaceCount + 1)
          else (c, replaceCount)
      }
      val (_, replaceCount2) = betweenStr.tail.foldLeft(betweenStr.head, 0L) {
        case ((prev, replaceCount), c) =>
          if (c == prev) ('0', replaceCount + 1)
          else (c, replaceCount)
      }
      (replaceCount1 + (k - 1) * replaceCount2)
    }
  }

  println(ans)
}
