package abc094C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val xs = Vector.fill(n)(sc.nextLong)
  val sortedXs = xs.sorted
  val mid = n / 2
  val evenMiddle = (sortedXs(mid - 1) + sortedXs(mid)) / 2
  (0 until n).foreach { i =>
    if (xs(i) <= evenMiddle) {
      println(sortedXs(mid))
    } else {
      println(sortedXs(mid - 1))
    }
  }
}
