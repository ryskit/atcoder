package C095

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val a, b, c, x, y = sc.nextInt
  val answer = (0 to math.max(x, y) * 2).foldLeft(Int.MaxValue) {
    case (min, ab) =>
      val xx = (x - ab / 2).ceil.toInt match {
        case tx if tx < 0 => 0
        case tx           => tx
      }
      val yy = (y - ab / 2).ceil.toInt match {
        case ty if ty < 0 => 0
        case ty           => ty
      }
      min.min(xx * a + yy * b + c * ab)
  }
  println(answer)
}
