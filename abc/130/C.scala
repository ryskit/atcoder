package abc130C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val w, h, x, y = sc.nextLong
  val ans1 = w.toDouble * h.toDouble / 2.0
  val ans2 = if (w == x * 2 && h == y * 2) 1 else 1
  println(f"$ans1%.6f $ans2")
}
