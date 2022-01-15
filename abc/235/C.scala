package abc235C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, q = sc.nextInt
  val as = (1 to n).foldLeft(Map.empty[Long, Vector[Long]]) {
    case (acc, i) => {
      val a = sc.nextLong
      val target = acc.getOrElse(a, Vector.empty[Long])
      acc.updated(a, target :+ i)
    }
  }
  (1 to q).foreach { i =>
    val x, k = sc.nextInt
    val target = as.getOrElse(x, Vector.empty[Long])
    if (target.size >= k) {
      println(target(k - 1))
    } else {
      println(-1)
    }
  }
}
