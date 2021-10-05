package A004

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val a, b, c = sc.nextLong
  val inputs = Vector((a, b, c), (b, c, a), (c, a, b))
  val answer = inputs.foldLeft(Long.MaxValue) {
    case (minDiff, (input1, input2, divider)) =>
      val d1 = divider / 2
      val d2 = divider - d1
      val diff = math.abs((input1 * input2 * d1) - (input1 * input2 * d2))
      minDiff.min(diff)
  }
  println(answer)
}
