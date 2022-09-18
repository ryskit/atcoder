package abc061C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val k = sc.nextLong
  val count = Array.fill(100010)(0L)
  solve()

  def solve() {
    (1 to n).foreach { i =>
      val a = sc.nextInt
      val b = sc.nextLong
      count.update(a, count(a) + b)
    }

    var sum = 0L
    (0 until 100010).foreach { i =>
      sum += count(i)
      if (k <= sum) {
        println(i)
        return
      }
    }
  }
}
