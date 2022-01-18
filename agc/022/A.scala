package abc022A
// https://atcoder.jp/contests/agc022/tasks/agc022_a

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s = sc.next

  val ans = if (s.length < 26) {
    s + first(0, s.length, 'a').toString
  } else {
    val INF = "z" * 26
    var res = INF
    (0 until s.length).foreach { i =>
      if (s(i) != 'z') {
        val c = first(0, i, (s(i).toInt + 1).toChar)
        if (c != '?') {
          val t = s.substring(0, i) + c.toString
          res = if (res < t) res else t
        }
      }
    }
    if (res < INF) res else -1
  }
  println(ans)

  def first(left: Int, right: Int, mi: Char): Char = {
    (mi to 'z').foreach { c =>
      var exist = false
      (left until right).foreach { i =>
        if (s(i) == c) {
          exist = true
        }
      }
      if (!exist) {
        return c
      }
    }
    '?'
  }
}
