package abc122C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, q = sc.nextInt
  val s = sc.next.toVector
  val ok = Array.fill(n + 10)(0)
  val sum = Array.fill(n + 10)(0)
  (0 until n - 1).foreach { i =>
    if (s(i) == 'A' && s(i + 1) == 'C') {
      ok.update(i, 1)
    }
  }
  sum.update(0, ok(0))
  (1 until n).foreach(i => sum.update(i, sum(i - 1) + ok(i)))

  (1 to q).foreach { _ =>
    val l = sc.nextInt - 1
    val r = sc.nextInt - 1
    var ans = sum(r - 1)
    if (l > 0) ans = ans - sum(l - 1)

    println(ans)
  }
}
