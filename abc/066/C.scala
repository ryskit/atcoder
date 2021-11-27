package abc066C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val as = (n until 0 by -1).foldLeft(Vector.empty[Long]) {
    case (acc, i) =>
      val a = sc.nextLong
      if (i % 2 == 0) acc :+ a
      else a +: acc
  }

  println(as.mkString(" "))
}
