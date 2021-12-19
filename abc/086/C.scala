package abc086C

// https://atcoder.jp/contests/abc086/tasks/arc089_a

import java.util.Scanner

object Main extends App {
  val scanner = new Scanner(System.in)
  val N = scanner.nextInt
  val list = List.fill(N)((scanner.nextInt, scanner.nextInt, scanner.nextInt))
  val answer = ((0, 0, 0) :: list)
    .zip(list)
    .map({
      case ((ct, cx, cy), (nt, nx, ny)) => {
        val dt = nt - ct
        val dist = (nx - cx).abs + (ny - cy).abs
        (dt, dist)
      }
    })
    .forall({
      case (dt, dist) => dt >= dist && dt % 2 == dist % 2
    })
  if (answer) println("Yes") else println("No")
}
