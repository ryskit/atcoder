package C115

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, k = sc.nextInt
  val h = Vector.fill(n)(sc.nextLong).sorted
  val answer = (0 to n - k).foldLeft(Long.MaxValue) {
    case (min, idx) =>
      val maxIdx = idx + k - 1
      min.min(h(maxIdx) - h(idx))
  }
  println(answer)
}
