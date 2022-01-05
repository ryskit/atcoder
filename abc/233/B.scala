package abc233B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val l, r = sc.nextInt
  val s = sc.next
  val (ans, _) =
    s.toSeq.zipWithIndex.foldLeft(Vector.empty[String], Vector.empty[String]) {
      case ((str, strForReverse), (c, i)) =>
        if (i < l - 1) {
          (str :+ c.toString, strForReverse)
        } else if (i >= l - 1 && i <= r - 1) {
          if (i == r - 1)
            (
              str :+ (strForReverse :+ c.toString).reverse.mkString,
              Vector.empty
            )
          else (str, strForReverse :+ c.toString)
        } else {
          (str :+ c.toString, Vector.empty)
        }
    }
  println(ans.mkString)
}
