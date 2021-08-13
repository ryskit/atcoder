package B063

import java.util.Scanner

object Main extends App {
  val scanner = new Scanner(System.in)
  val s = scanner.next
  val set = s.toSet[Char]
  if (s.length == set.size) println("yes")
  else println("no")
}
