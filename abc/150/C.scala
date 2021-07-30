package C150

import java.util.Scanner

object Main extends App {
  val scanner = new Scanner(System.in)
  val n = scanner.nextInt
  val ps = Seq.fill(n)(scanner.nextInt)
  val qs = Seq.fill(n)(scanner.nextInt)
  def solve(x: Seq[Int]): Int = (1 to n).permutations.toSeq.indexOf(x)
  println(math.abs(solve(ps) - solve(qs)))
}
