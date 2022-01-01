package abc070C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val ts = Vector.fill(n)(BigInt(sc.nextLong))
  val ans = ts.tail.foldLeft(ts.head) {
    case (ans, t) =>
      lcm(ans, t)
  }
  println(ans)
  def lcm(x: BigInt, y: BigInt): BigInt = {
    (x * y) / gcm(x, y)
  }

  def gcm(x: BigInt, y: BigInt): BigInt = {
    if (y == 0) x
    else gcm(y, x % y)
  }
}
