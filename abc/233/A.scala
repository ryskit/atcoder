package abc233A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val x, y = sc.nextInt
  val ans =
    if (x >= y) 0
    else {
      ((y - x).toDouble / 10).ceil.toInt
    }
  println(ans)
}
