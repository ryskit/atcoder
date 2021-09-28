package C135

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val as: Vector[Long] = Vector.fill(n + 1)(sc.nextLong)
  val bs: Vector[Long] = Vector.fill(n)(sc.nextLong)

  val (answer, _) = as.tail.zip(bs).foldLeft(0L, as.head) {
    case ((sum, a), (nextA, b)) => {
      if (a < b) {
        val m = math.min(b - a, nextA)
        val next = math.max(nextA - m, 0L)
        (sum + a + m, next)
      } else {
        (sum + b, nextA)
      }
    }
  }
  println(answer)
}
