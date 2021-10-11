package B098

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val ss = sc.next.toArray
  val answer = (1 until n).foldLeft(0) {
    case (max, idx) =>
      val (s1, s2) = ss.splitAt(idx)
      max.max((s1.toSet & s2.toSet).size)
  }
  println(answer)
}
