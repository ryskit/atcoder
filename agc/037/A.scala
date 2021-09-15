package A037

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s = sc.next
  val (_, _, answer) = s.toSeq.foldLeft("", "", 0) {
    case ((prev, current, count), c) =>
      val target = current + c
      if (target != prev) (target, "", count + 1)
      else (prev, target, count)
  }
  println(answer)
}
