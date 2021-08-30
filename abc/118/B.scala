package B118

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val m = sc.nextInt
  val answer = (1 to n).foldLeft(Set.empty[Int]) {
    case (set, nn) =>
      val k = sc.nextInt
      val current = Set.fill(k)(sc.nextInt)
      if (nn == 1) current
      else set & current
  }
  println(answer.size)
}
