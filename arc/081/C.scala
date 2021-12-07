package arc081C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val as = Vector.fill(n)(sc.nextLong)
  val bars = as.groupBy(identity).view.mapValues(_.size).filter(_._2 >= 2)
  val highers = bars.toVector.sortBy(_._1).reverse.take(2)
  val ans = highers match {
    case h if h.size == 2 => {
      val a1 = h(0)._1 * h(1)._1
      val a2 = if (h(0)._2 >= 4) h(0)._1 * h(0)._1 else 0
      a1.max(a2)
    }
    case h if h.size == 1 && h.head._2 >= 4 => h.head._1 * h.head._1
    case _                                  => 0
  }
  println(ans)
}
