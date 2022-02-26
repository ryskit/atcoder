package abc241C

object Main extends App {
  solve()
  def solve() {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val s = Vector.fill(n)(sc.next)
    val dxs = Vector(1, 1, 0, -1)
    val dys = Vector(0, 1, 1, 1)
    for {
      i <- 0 until n
      j <- 0 until n
    } {
      (0 until 4).foreach { d =>
        val dx = dxs(d)
        val dy = dys(d)
        var whiteCount = 0
        (0 until 6).foreach { k =>
          val nx = i + dx * k
          val ny = j + dy * k
          if (0 <= nx && nx < n && 0 <= ny && ny < n) {
            if (s(nx)(ny) == '.') whiteCount += 1
          } else {
            whiteCount += 1000
          }
        }
        if (whiteCount <= 2) {
          println("Yes")
          return
        }
      }
    }
    println("No")
  }
}
