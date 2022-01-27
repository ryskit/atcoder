package abc068A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val x = sc.nextLong
  val divideCount = x / 11 * 2
  val mod = x % 11
  val ans =
    if (0 < mod && mod < 7) divideCount + 1
    else if (mod >= 7) divideCount + 2
    else divideCount

  println(ans)
  // 6 -> 2, 3, 4, 5
  // 5 -> 1, 3, 4, 6
  // 4 -> 1, 2, 5, 6
  // 3 -> 1, 2, 5, 6
  // 2 -> 1, 3, 4, 6
  // 1 -> 2, 3, 4, 5
  // 27217477801
  // 24949354650
}
