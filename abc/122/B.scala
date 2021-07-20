package B122

import java.util.Scanner

object Main extends App {
  val scanner = new Scanner(System.in)
  val s = scanner.next
  val acgt = List('A', 'C', 'G', 'T')
  val (answer, _, _) = s.foldLeft((0, 0, 'a'))({
    case ((max, keep, prev), next: Char) => {
      if (acgt.contains(next))
        (math.max(max, keep + 1), keep + 1, next)
      else if (acgt.contains(prev))
        (math.max(max, keep), 0, next)
      else
        (max, 0, next)
    }
  })
  println(answer)
}
