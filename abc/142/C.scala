package C142

import java.util.Scanner

object Main extends App {
  val scanner = new Scanner(System.in)
  val n = scanner.nextInt
  val as = List.fill(n)(scanner.nextInt)
  println(
    as.zipWithIndex
      .sortWith((a1, a2) => a1._1 < a2._1)
      .map(a => a._2 + 1)
      .mkString(" ")
  )
}
