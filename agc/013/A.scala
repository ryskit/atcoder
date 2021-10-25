package abc013A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val as = Vector.fill(n)(sc.nextLong)
  val s1 = resolve(as)
  val s2 = resolve(as.reverse)
  println(if (s1 < s2) s1 else s2)

  def getAscDesc(a: Long, prevA: Long): Int = {
    if (prevA < a) 0
    else if (a < prevA) 1
    else 2
  }

  def resolve(list: Vector[Long]): Long = {
    val (acc, e, _) = list.zipWithIndex.foldLeft(
      Vector.empty[Vector[Long]],
      Vector.empty[Long],
      2
    ) {
      case ((acc, e, ascDesc), (a, ai)) =>
        if (e.isEmpty) (acc, e :+ a, ascDesc)
        else {
          if (ascDesc == 2) (acc, e :+ a, getAscDesc(a, list(ai - 1)))
          else {
            val prevA = list(ai - 1)
            if (ascDesc == 0 && prevA <= a) {
              (acc, e :+ a, ascDesc)
            } else if (ascDesc == 1 && prevA >= a) {
              (acc, e :+ a, ascDesc)
            } else {
              (acc :+ e, Vector(a), 2)
            }
          }
        }
    }
    if (0 < e.size) acc.size + 1 else acc.size
  }
}
