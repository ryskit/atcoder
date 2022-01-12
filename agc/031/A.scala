package agc031A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val s = sc.next
  val MOD = 1000000007
  val eachCounts = s.foldLeft(Map.empty[Char, Int]) {
    case (acc, c) =>
      val count = acc.getOrElse(c, 0)
      acc + (c -> (count + 1))
  }
  val ans = eachCounts.values.foldLeft(1L) {
    case (mul, v) => (v + 1) * mul % MOD
  } - 1

  println(ans)
}
