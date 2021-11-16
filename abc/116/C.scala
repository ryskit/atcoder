package abc116C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val hs = Vector.fill(n)(sc.nextInt)
  val ans = solve(hs)
  println(ans)
  def solve(xs: Vector[Int]): Int = {
    if (xs.isEmpty) 0
    else {
      val m = xs.min
      val (f, b) = xs.map(_ - m).span(_ > 0)
      m + solve(f) + (if (b.nonEmpty) solve(b.tail) else 0)
    }
  }
}
