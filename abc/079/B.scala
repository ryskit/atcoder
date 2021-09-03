package B079

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val N = sc.nextInt

  def solve(n: Int): Long = {
    def loop(n: Int, prev: (Long, Long)): Long = {
      if (n == 0) prev._2
      else if (n == 1) prev._1
      else
        loop(n - 1, (prev._1 + prev._2, prev._1))
    }
    loop(n, (1L, 2L))
  }

  println(solve(N))
}
