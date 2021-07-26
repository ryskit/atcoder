package B116

import java.util.Scanner
import scala.collection.mutable

object Main extends App {
  val scanner = new Scanner(System.in)
  val s = scanner.nextInt
  val as = mutable.HashSet.empty[Int]
  var x = s
  while (!as.contains(x)) {
    as.add(x)
    if (x % 2 == 0) {
      x = x / 2
    } else {
      x = x * 3 + 1
    }
  }
  println(as.size + 1)
}
