package agc008A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val x, y = sc.nextLong
  var min = 1L << 60
  if (x <= y) min = math.min(min, y - x)
  if (-x <= y) min = math.min(min, y + x + 1)
  if (x <= -y) min = math.min(min, -y - x + 1)
  if (-x <= -y) min = math.min(min, -y + x + 2)
  println(min)
}
