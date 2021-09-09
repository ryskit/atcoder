package B093

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val a, b = sc.nextLong
  val k = sc.nextInt

  val ax = if (a + k > b) b else a + k - 1
  val as = a to ax

  val bx = if (b - k < a) a else b - k + 1
  val bs = bx to b
  val answer = (as ++ bs).foldLeft(Set.empty[Long]) {
    case (acc, v) => acc + v
  }
  answer.toSeq.sorted.foreach(println)
}
