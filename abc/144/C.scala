package C144

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextLong
  val answer = (1 to math.sqrt(n).toInt).view.foldLeft(Long.MaxValue) {
    case (min, i) =>
      if (n % i.toLong == 0L) {
        min.min(n / i + i - 2L)
      } else min
  }
  println(answer)
}
