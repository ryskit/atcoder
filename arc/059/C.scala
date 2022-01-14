package arc059C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val as = Vector.fill(n)(sc.nextLong)
  val ans = (-100 to 100).foldLeft(Long.MaxValue) {
    case (min, x) =>
      val min2 = as.foldLeft(0L) {
        case (total, a) =>
          val cost = (a - x) * (a - x)
          total + cost
      }
      min.min(min2)
  }

  println(ans)
}
