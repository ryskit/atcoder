package C093

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val inputs = Vector.fill(3)(sc.nextInt).sorted
  val diff1 = inputs(2) - inputs(0)
  val diff2 = inputs(2) - inputs(1)
  val d1r = diff1 % 2
  val d2r = diff2 % 2
  val dr =
    if (d1r + d2r == 0) 0
    else if (d1r + d2r == 1) 2
    else 1
  val answer = diff1 / 2 + diff2 / 2 + dr
  println(answer)
}
