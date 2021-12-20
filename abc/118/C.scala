package abc118C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val as = Vector.fill(n)(sc.nextLong)

  val ans =
    if (n == 1) as(0)
    else {
      as.tail.foldLeft(gcm(as(0), as(1))) {
        case (min, a) =>
          min.min(gcm(min, a))
      }
    }
  println(ans)

  def lcm(x: Long, y: Long): Long = {
    (x * y) / gcm(x, y)
  }

  def gcm(x: Long, y: Long): Long = {
    if (y == 0) x
    else gcm(y, x % y)
  }
}
