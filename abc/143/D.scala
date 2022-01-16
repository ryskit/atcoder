package abc143D
// https://atcoder.jp/contests/abc143/tasks/abc143_d
// a<b+c -> a - b < c
// b<c+a -> b - a < c
// c<a+b -> c < a + b
object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val ls = Vector.fill(n)(sc.nextInt)
  val cnt = Array.fill(2010)(0L)
  ls.foreach { l =>
    cnt.update(l, cnt(l) + 1)
  }
  (1 until 2010).foreach { i =>
    cnt.update(i, cnt(i) + cnt(i - 1))
  }
  var ans = 0L
  for {
    a <- 0 until n
    b <- 0 until n
    if (a != b)
  } {
    val mi = math.max(ls(a) - ls(b), ls(b) - ls(a))
    val ma = ls(a) + ls(b)

    var cn = 0L
    if (0 <= ma - 1) cn = cnt(ma - 1)
    cn -= cnt(mi)

    if (mi < ls(a) && ls(a) < ma) cn -= 1
    if (mi < ls(b) && ls(b) < ma) cn -= 1
    ans += cn
  }
  ans = ans / 6
  println(ans)
}
