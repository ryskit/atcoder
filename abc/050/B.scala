package B050

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val t = Seq.fill(n)(sc.nextInt)
  val m = sc.nextInt
  val answer = (1 to m).foldLeft(Seq.empty[Int]) {
    case (result, _) =>
      val p, x = sc.nextInt
      result :+ (t.sum - t(p - 1) + x)
  }
  answer.foreach(println)
}
