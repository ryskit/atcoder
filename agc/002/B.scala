package agc002B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, m = sc.nextInt
  val boxRed = Array.fill(n)(0)
  val boxRW = Array.fill(n)(1)
  boxRed.update(0, 1);
  (1 to m).foreach { i =>
    val x = sc.nextInt - 1
    val y = sc.nextInt - 1
    if (boxRed(x) > 0) boxRed.update(y, 1)
    if (boxRW(x) == 1) boxRed.update(x, 0)
    boxRW.update(x, boxRW(x) - 1)
    boxRW.update(y, boxRW(y) + 1)
  }
  val ans = (0 until n).foldLeft(0) {
    case (total, i) =>
      if (boxRed(i) == 1 && boxRW(i) > 0) total + 1
      else total
  }
  println(ans)
}
