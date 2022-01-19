package agc035A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val as = Vector.fill(n)(sc.nextLong)
  val base = 0 until n
  val map = as.foldLeft(Map.empty[Long, Int]) {
    case (acc, a) => acc + (a -> (acc.getOrElse(a, 0) + 1))
  }

  val ans =
    if (n % 3 != 0) map.getOrElse(0, 0) == n
    else {
      val v = map.keys.toVector
      if (v.size == 1) map.getOrElse(0, 0) == n
      else if (v.size == 2) map.getOrElse(0, 0) == n / 3
      else if (v.size == 3) {
        val (v0, v1, v2) = (v(0), v(1), v(2))
        if ((v0 ^ v1 ^ v2) != 0) false
        else map(v(0)) == n / 3 && map(v(1)) == n / 3 && map(v(2)) == n / 3
      } else false
    }

  println(if (ans) "Yes" else "No")
}
