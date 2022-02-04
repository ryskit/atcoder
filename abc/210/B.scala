package abc210B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val s = sc.next
  val who: Option[Int] = s.toSeq.zipWithIndex.collectFirst {
    case (c, i) if c == '1' => i
  }
  println(if (who.get % 2 == 0) "Takahashi" else "Aoki")
}
