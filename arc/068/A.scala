package arc068A
// https://atcoder.jp/contests/arc068/tasks/arc068_a

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
}
