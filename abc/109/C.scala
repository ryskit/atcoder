package abc109C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val x = sc.nextLong
  val xs = Vector.fill(n)(sc.nextLong)
  val answer = xs.foldLeft(0L) {
    case (ans, xi) => gcm(ans, math.abs(x - xi))
  }
  println(answer)

  def gcm(x: Long, y: Long): Long = {
    if (y == 0) x
    else gcm(y, x % y)
  }
}
