package abc237D

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val s = sc.next.toVector
  val ans = (n - 1 to 0 by -1).foldLeft(Vector(n)) {
    case (acc, i) =>
      if (s(i) == 'L') acc :+ i
      else i +: acc
  }
  println(ans.mkString(" "))
}
