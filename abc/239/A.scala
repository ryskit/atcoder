package abc239A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val h = sc.nextInt
  val ans = calc(h)
  println(ans)

  def calc(x: Double): Double = {
    math.sqrt(x * (12800000 + x))
  }
}
