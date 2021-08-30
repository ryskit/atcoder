package C152

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val p = Seq.fill(n)(sc.nextInt)
  val (answer, _) = p.foldLeft(0, p.head) {
    case ((count, minValue), current) =>
      val min = current.min(minValue)
      if (current <= minValue) (count + 1, min)
      else (count, min)
  }
  println(answer)
}
