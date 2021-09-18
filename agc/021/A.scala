package A021

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.next

  val lastIdx = n.length - 1
  val nRev = n.reverse
  val (_, answer) =
    nRev.toSeq.map(_.toString.toInt).zipWithIndex.foldLeft(false, 0) {
      case ((nextMinus1, sum), (x, idx)) =>
        if (nextMinus1) {
          if (idx != lastIdx) (true, sum + 9) else (true, sum + x - 1)
        } else {
          if (x == 9) (false, sum + x)
          else {
            if (idx != lastIdx) (true, sum + 9) else (true, sum + x)
          }
        }
    }

  println(answer)
}
