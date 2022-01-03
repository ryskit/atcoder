package abc058C
// https://atcoder.jp/contests/abc058/tasks/arc071_a

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val ss = Vector.fill(n)(sc.next)

  val ans = ('a' to 'z').foldLeft("") {
    case (ans, c) =>
      val minCount = charMinCount(ss, c)
      ans + (c.toString * minCount)
  }
  println(ans)

  def charMinCount(vs: Vector[String], target: Char): Int = {
    vs.foldLeft(Int.MaxValue) {
      case (minTotal, s) =>
        minTotal.min(charCount(s, target))
    }
  }

  def charCount(s: String, target: Char): Int = {
    s.count(_ == target)
  }
}
