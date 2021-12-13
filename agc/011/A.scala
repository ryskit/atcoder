package agc011A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val c, k = sc.nextLong
  val ts = Vector.fill(n)(sc.nextLong).sorted

  val (available, count) = ts.foldLeft(Vector.empty[Long], 0) {
    case ((available, count), ti) =>
      if (available.isEmpty) {
        (available :+ ti, 0)
      } else {
        val size = available.size
        val first = available.head
        if (c <= size || first + k < ti) {
          (Vector(ti), count + 1)
        } else {
          (available :+ ti, count)
        }
      }
  }
  val ans =
    if (available.isEmpty) count
    else {
      count + 1
    }
  println(ans)
}
