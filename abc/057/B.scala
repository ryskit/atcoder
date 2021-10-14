package B057

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, m = sc.nextInt
  val abs = Vector.fill(n)((sc.nextLong, sc.nextLong))
  val cds = Vector.fill(m)((sc.nextLong, sc.nextLong))
  val answer = abs.foldLeft(Vector.empty[Int]) {
    case (minAcc, ab) =>
      val (_, index) = cds.zipWithIndex.foldLeft(Long.MaxValue, 0) {
        case ((min, index), (cd, i)) =>
          val d = math.abs(ab._1 - cd._1) + math.abs(ab._2 - cd._2)
          if (d < min) (d, i + 1)
          else (min, index)
      }
      minAcc :+ index
  }
  answer.foreach(println)
}
