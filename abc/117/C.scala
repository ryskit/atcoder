package abc117C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, m = sc.nextInt
  val xs = Vector.fill(m)(sc.nextInt).sorted

  val ans =
    if (n >= m) 0
    else {
      val diffs = xs.zip(xs.tail).map(v => v._2 - v._1)
      diffs.sorted.slice(0, m - n).sum
    }

  println(ans)
}
