package agc007A
// https://atcoder.jp/contests/agc007/tasks/agc007_a

object Main extends App {
  def solve(): Unit = {
    val sc = new java.util.Scanner(System.in)
    val h, w = sc.nextInt
    val areas = Vector.fill(h)(sc.next)
    val count = (0 until h).foldLeft(0) {
      case (count, i) =>
        count + areas(i).count(_ == '#')
    }
    val ans =
      if (count == h + w - 1) "Possible"
      else "Impossible"

    println(ans)
  }
  solve()
}
