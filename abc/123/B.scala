package B123

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val times = Seq.fill(5)(sc.nextInt)
  val timeMap = times.zipWithIndex.foldLeft(Map.empty[Int, Int])({
    case (acc, (time, idx)) =>
      val r = time % 10
      acc + (idx -> (if (r == 0) 10 else r))
  })
  val (answer, _) = timeMap.toSeq
    .sortBy(_._2)
    .reverse
    .foldLeft(0, 0)({
      case ((sum, cnt), (idx, r)) =>
        if (cnt == 4) {
          (sum + times(idx), cnt + 1)
        } else {
          (sum + times(idx) + (10 - r), cnt + 1)
        }
    })
  println(answer)
}
