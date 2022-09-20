package tessoku_book_A08

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val h = sc.nextInt
  val w = sc.nextInt
  val cs = Array.fill(h)(Array.fill(w)(0))
  for {
    h <- 0 until h
    w <- 0 until w
  } {
    val v = sc.nextInt
    if (w == 0) cs(h)(w) = v
    else cs(h)(w) = cs(h)(w - 1) + v
  }

  val q = sc.nextInt
  val sb = new collection.mutable.StringBuilder
  (1 to q).foreach { _ =>
    val leftTop = (sc.nextInt - 1, sc.nextInt - 1)
    val rightBottom = (sc.nextInt - 1, sc.nextInt - 1)

    if (leftTop._2 == 0) {
      val sum = (leftTop._1 to rightBottom._1).foldLeft(0) { (sum, h) =>
        sum + cs(h)(rightBottom._2)
      }
      sb.append(s"$sum\n")
    } else {
      val sum = (leftTop._1 to rightBottom._1).foldLeft(0) { (sum, h) =>
        sum + (cs(h)(rightBottom._2) - cs(h)(leftTop._2 - 1))
      }
      sb.append(s"$sum\n")
    }
  }
  println(sb.toString())
}
