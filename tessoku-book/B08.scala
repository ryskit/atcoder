package tessoku_book_B08

// どうしてもTLEになる
object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val cs = Array.fill(1501)(Array.fill(1501)(0))
  (0 until n).foreach { i =>
    val x = sc.nextInt
    val y = sc.nextInt
    cs(y)(x) += 1
  }
  for {
    y <- 1 to 1500
    x <- 1 to 1500
  } {
    if (y == 1) cs(y)(x) += cs(y)(x - 1)
    else cs(y)(x) += cs(y)(x - 1) + cs(y - 1)(x) - cs(y - 1)(x - 1)
  }

  val q = sc.nextInt
  val sb = new collection.mutable.StringBuilder()
  (1 to q).foreach { _ =>
    val a = sc.nextInt
    val b = sc.nextInt
    val c = sc.nextInt
    val d = sc.nextInt
    val result = cs(d)(c) - (cs(d)(a - 1) + cs(b - 1)(c)) + cs(a - 1)(a - 1)
    sb.append(s"$result\n")
  }
  println(sb.toString())
}
