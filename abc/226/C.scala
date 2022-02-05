package abc226C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val times = Array.fill(n + 10)(0L)
  val requires = (1 to n).foldLeft(Vector.empty[Vector[Int]]) {
    case (requires, ti) =>
      val t = sc.nextLong
      val k = sc.nextInt
      times.update(ti, t)
      if (k == 0) {
        requires :+ Vector.empty[Int]
      } else {
        val acc = Vector.fill(k)(sc.nextInt)
        requires :+ acc
      }
  }

  val needs = Array.fill(n + 10)(false)
  needs.update(n, true)

  (n to 1 by -1).foreach { i =>
    if (needs(i)) {
      requires(i - 1).foreach { j =>
        needs.update(j, true)
      }
    }
  }

  val ans = (1 to n).foldLeft(0L) {
    case (sum, i) =>
      if (needs(i)) {
        sum + times(i)
      } else {
        sum
      }
  }
  println(ans)
}
