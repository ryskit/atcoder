package abc082C
// https://atcoder.jp/contests/abc082/tasks/arc087_a

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val as = (1 to n).foldLeft(Map.empty[Long, Int]) {
    case (acc, i) =>
      val a = sc.nextLong
      if (!acc.isDefinedAt(a)) {
        acc + (a -> 1)
      } else {
        val e = acc.getOrElse(a, -1)
        acc + (a -> (e + 1))
      }
  }
  val ans = as.foldLeft(0L) {
    case (count, (key, value)) =>
      if (key == value) {
        count
      } else if (key < value) {
        val newCnt = count + (value - key)
        newCnt
      } else {
        val newCnt = count + value
        newCnt
      }
  }
  println(ans)
}
