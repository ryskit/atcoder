package abc144D

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val a, b, x = sc.nextInt

  val half = a * a * b / 2
  val result =
    if (x < half) math.atan(a * b * b / (2.0 * x))
    else math.atan((2.0 * b - 2.0 * x / (a * a)) / a)

  val ans = result / math.Pi * 180
  println(f"$ans%.10f")
}
