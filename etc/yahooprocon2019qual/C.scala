package yahooprocon2019qualC

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val k, a, b = sc.nextLong

  val ans =
    if (b - a <= 2 || k < a - 1) k + 1
    else {
      var biscuits = a
      var kx = k
      kx -= a - 1
      if (kx % 2 == 1) {
        biscuits += 1
        kx -= 1
      }
      val count = math.max(0L, (k - (a - 1)) / 2)
      biscuits += count * (b - a)
      biscuits
    }
  println(ans)
}
