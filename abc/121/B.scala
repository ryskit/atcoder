package B121

import java.util.Scanner

object Main extends App {
  val scanner = new Scanner(System.in)
  val N = scanner.nextInt
  val M = scanner.nextInt
  val C = scanner.nextInt
  val B = List.fill(M)(scanner.nextInt)
  val A = List.fill(N)(List.fill(M)(scanner.nextInt))
  val answer = A.foldLeft(0)((acc, a) => {
    val r = a
      .zip(B)
      .foldLeft(0)({
        case (sum, (aa, bb)) => sum + aa * bb
      })
    if (r + C > 0) acc + 1
    else acc
  })
  println(answer)
}
