package abc239B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val x = BigDecimal(sc.nextLong)
  val ans = (x / 10).setScale(0, math.BigDecimal.RoundingMode.FLOOR)
  println(ans)
}
