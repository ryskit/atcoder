package tessoku_book_B06

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val a = Array.fill[Int](n + 2)(0)
  (1 to n).foreach { i =>
    if (i == 1) a(i) = sc.nextInt
    else a(i) = sc.nextInt + a(i - 1)
  }
  val q = sc.nextInt
  val sb = new collection.mutable.StringBuilder
  (1 to q).foreach { qi =>
    val l = sc.nextInt
    val r = sc.nextInt
    val count = r - l + 1
    val atari = a(r) - a(l - 1)
    val hazure = count - atari
    val result =
      if (atari > hazure) "win\n"
      else if (hazure > atari) "lose\n"
      else "draw\n"
    sb.append(result)
  }
  println(sb.toString())
}
