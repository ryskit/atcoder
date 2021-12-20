package abc158D

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s = sc.next
  val q = sc.nextInt
  val (count, acc1, acc2) =
    (1 to q).foldLeft(0, Vector.empty[String], Vector.empty[String]) {
      case ((count, acc1, acc2), i) =>
        val t = sc.nextInt
        if (t == 1) {
          (count + 1, acc1, acc2)
        } else {
          val f = sc.nextInt
          val c = sc.next
          if (f == 1) {
            if (count % 2 == 0) (count, c +: acc1, acc2)
            else (count, acc1, acc2 :+ c)
          } else {
            if (count % 2 == 0) (count, acc1, acc2 :+ c)
            else (count, c +: acc1, acc2)
          }
        }
    }

  val ans = if (count % 2 == 0) {
    acc1.mkString + s + acc2.mkString
  } else {
    acc2.reverse.mkString + s.reverse + acc1.reverse.mkString
  }
  println(ans)
}
