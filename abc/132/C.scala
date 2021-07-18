package C132

import java.util.Scanner

object Main extends App {
  val scanner = new Scanner(System.in)
  val n = scanner.nextInt
  val ds = List.fill(n)(scanner.nextInt)
  val dsSorted = ds.sorted
  val answer = dsSorted(n / 2) - dsSorted(n / 2 - 1)
  println(answer)

}
