package tessoku_bookB04

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.next
  val answer = ((n.length - 1 to 0 by -1), n.toSeq).zipped.map { (p, i) =>
    if (i == '1') Math.pow(2, p).toInt
    else 0
  }.sum
  println(answer)
}
