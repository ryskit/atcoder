package algorithm

import scala.annotation.tailrec

object BinarySearch extends App {

  def binarySearch(k: Int, s: Seq[Int]): Int = {
    @tailrec
    def loop(key: Int, a: Seq[Int], leftIdx: Int, rightIdx: Int): Int = {
      val left = 0
      val right = a.size - 1
      val mid = left + (right - left) / 2
      if (a(mid) == key) return mid + leftIdx
      if (a.size == 1) return -1
      if (key < a(mid)) loop(key, a.slice(left, mid + 1), leftIdx, mid - 1)
      else loop(key, a.slice(mid + 1, right + 1), leftIdx + mid + 1, rightIdx)
    }
    loop(k, s, 0, a.size - 1)
  }

  val a = Vector(3, 5, 8, 10, 14, 17, 21, 39)
  println(binarySearch(21, a))
}
