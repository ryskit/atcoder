package A065

import java.util.Scanner

import scala.annotation.tailrec

object Main extends App {
  val scanner = new Scanner(System.in)
  val S = scanner.next
  if (solve(S.toList.reverse)) println("YES") else println("NO")

  @tailrec
  def solve(s: List[Char]): Boolean = {
    s match {
      case List('m', 'a', 'e', 'r', 'd', x @ _*)           => solve(x.toList)
      case List('r', 'e', 'm', 'a', 'e', 'r', 'd', x @ _*) => solve(x.toList)
      case List('e', 's', 'a', 'r', 'e', x @ _*)           => solve(x.toList)
      case List('r', 'e', 's', 'a', 'r', 'e', x @ _*)      => solve(x.toList)
      case List()                                          => true
      case _                                               => false
    }
  }
}
