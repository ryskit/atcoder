package C073

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val t = sc.nextLong
  val ts = Vector.fill(n)(sc.nextLong)
  val answer = ts.tail.zipWithIndex.foldLeft(t) {
    case (sum, (ti, prevTiIndex)) =>
      if (ti - ts(prevTiIndex) < t) sum + ti - ts(prevTiIndex)
      else sum + t
  }
  println(answer)
}
