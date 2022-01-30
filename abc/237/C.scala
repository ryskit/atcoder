package abc237C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s = sc.next
  val r = s.reverse
  val ans =
    if (s == r) "Yes"
    else {
      val raCount = firstACount(r.toVector)
      val saCount = firstACount(s.toVector)
      val rslice = r.slice(raCount, r.length - saCount).mkString("")
      val sslice = s.slice(saCount, s.length - raCount).mkString("")
      if (sslice == rslice && saCount <= raCount) "Yes"
      else "No"
    }
  println(ans)

  def firstACount(s: Vector[Char]): Int = {
    var count = 0
    var i = 0
    var res = true
    while (res) {
      if (s(i) == 'a') {
        count = count + 1
        i = i + 1
      } else {
        res = false
      }
    }
    count
  }
}
