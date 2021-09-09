package B133

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, d = sc.nextInt
  val xs = (1 to n).foldLeft(Seq.empty[Seq[Int]]) {
    case (acc, _) =>
      acc :+ (1 to d).foldLeft(Seq.empty[Int]) {
        case (acc2, _) => acc2 :+ sc.nextInt
      }
  }
  val couples = for {
    i <- 0 until n
    j <- i + 1 until n
  } yield (i, j)
  val answer = couples.foldLeft(0L) {
    case (count, (y, z)) =>
      val sum = xs(y).zip(xs(z)).foldLeft(0L) {
        case (sumYZ, (yv, zv)) => sumYZ + ((yv - zv) * (yv - zv))
      }
      val a = math.sqrt(sum)
      val f = a.floor
      if (a - f == 0) count + 1 else count
  }
  println(answer)
}
