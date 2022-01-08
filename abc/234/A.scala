package abc234A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val t = sc.nextLong
  val ans = f(f(f(t) + t) + f(f(t)))
  println(ans)

  def f(x: Long): Long = {
    x * x + 2 * x + 3
  }
}
