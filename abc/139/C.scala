package C139

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val hs = Seq.fill(n)(sc.nextInt)
  var prev = 0
  val (answer, _) = hs.foldLeft(0, 0) {
    case ((max, tmpMax), h) =>
      if (prev >= h) {
        val tm = tmpMax + 1
        prev = h
        (max.max(tm), tm)
      } else {
        prev = h
        (max.max(0), 0)
      }
  }
  println(answer)
}
