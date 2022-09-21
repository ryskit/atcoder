package tessoku_book_A09

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val h = sc.nextInt
  val w = sc.nextInt
  val n = sc.nextInt

  val ds = Array.fill(1502)(Array.fill(1502)(0))

  (1 to n).foreach { i =>
    val a = sc.nextInt
    val b = sc.nextInt
    val c = sc.nextInt
    val d = sc.nextInt
    ds(a)(b) += 1
    ds(a)(d + 1) -= 1
    ds(c + 1)(b) -= 1
    ds(c + 1)(d + 1) += 1
  }

  // 横に累積和
  for {
    h <- 1 to h
    w <- 1 to w
  } {
    ds(h)(w) += ds(h)(w - 1)
  }

  // 縦に累積和
  for {
    h <- 1 to h
    w <- 1 to w
  } {
    ds(h)(w) += ds(h - 1)(w)
  }

  val sb = new collection.mutable.StringBuilder()

  for {
    hi <- 1 to h
    wi <- 1 to w
  } {
    if (wi == w)
      sb.append(s"${ds(hi)(wi)} \n")
    else
      sb.append(s"${ds(hi)(wi)} ")
  }
  println(sb.toString())
}
