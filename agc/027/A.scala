package A027

import java.util.Scanner

object Main extends App {
  val scanner = new Scanner(System.in)
  val n = scanner.nextInt
  val x = scanner.nextInt
  val as = List.fill(n)(scanner.nextInt).sorted
  val sum = as.sum

  val (count, remaining) = as.init.foldLeft((0, x))({
    case ((count, r), v) if r >= v => (count + 1, r - v)
    case ((count, r), _)           => (count, r)
  })
  val answer = if (as.last == remaining) count + 1 else count
  println(answer)
}
