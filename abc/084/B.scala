package B084

import java.util.Scanner

object Main extends App {
  val scanner = new Scanner(System.in)
  val a = scanner.nextInt
  val b = scanner.nextInt
  val s = scanner.next
  val ss = s.split("-")
  val answer = if (ss.size == 2) {
    if (ss(0).length == a && ss(1).length == b) "Yes" else "No"
  } else "No"
  println(answer)
}
