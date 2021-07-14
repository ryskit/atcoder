package qualB

import java.util.Scanner

object Main extends App {
  val scanner = new Scanner(System.in)
  val N = scanner.nextInt
  val A = scanner.nextInt
  val B = scanner.nextInt
  val S = scanner.next.toCharArray
  val border = A + B
  S.zipWithIndex.foldLeft((0, 0))({
    case ((pass, abroad), (s, idx))
        if s == 'b' && A + B > pass && B > abroad => {
      println("Yes")
      (pass + 1, abroad + 1)
    }
    case ((pass, abroad), (s, idx)) if s == 'a' && A + B > pass => {
      println("Yes")
      (pass + 1, abroad)
    }
    case (acc, _) => {
      println("No")
      acc
    }
  })
}
