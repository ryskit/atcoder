package B092

import java.util.Scanner

object Main extends App {
  val scanner = new Scanner(System.in)
  val n = scanner.nextInt
  val d = scanner.nextInt
  val x = scanner.nextInt
  val as = List.fill(n)(scanner.nextInt)
  val answer = as.foldLeft(0)({
    case (acc, a) =>
      acc + LazyList.from(1, a).takeWhile(v => v <= d).size
  })
  println(answer + x)
}
