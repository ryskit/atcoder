package C161

import java.util.Scanner
import scala.annotation.tailrec

object Main extends App {
  val scanner = new Scanner(System.in)
  val N = scanner.nextLong
  val K = scanner.nextLong
  println(solve(N, K))

  @tailrec
  def solve(n: Long, k: Long): Long = {
    val mod = n % k
    val diff = if (mod == n) (n - k).abs else (mod - k).abs
    val nextDiff = (diff - k).abs
    if (diff > nextDiff) {
      if (nextDiff == 0) nextDiff
      else solve(diff, k)
    } else
      diff
  }
}
