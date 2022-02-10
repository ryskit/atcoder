package abc207B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val a, b, c, d = sc.nextDouble()
  val ans =
    if (c * d <= b) -1
    else {
      (a / (c * d - b)).ceil.toLong
    }
  println(ans)
}
