package abc073C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val ms = (1 to n).foldLeft(Map.empty[Long, Boolean]) {
    case (acc, _) =>
      val keyA = sc.nextLong
      val a = acc.get(keyA)
      val after = if (a.isEmpty) true else if (a.get) false else true
      acc + (keyA -> after)
  }
  println(ms.count(v => v._2))
}
