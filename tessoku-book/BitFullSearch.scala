package tessoku_book_BitFullSearch

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val k = sc.nextInt
  var answer = false
  val a = (0 to n).foldLeft(IndexedSeq.empty[Int])((acc, i) =>
    if (i == 0) acc :+ 0 else acc :+ sc.nextInt
  )
  for (target <- 0 until (1 << n)) {
    var sum = 0
    for (j <- 1 to n) {
      val wari = 1 << (j - 1)
      if ((target / wari) % 2 == 1) sum += a(j)
    }
    if (sum == k) answer = true
  }
  println(if (answer) "Yes" else "No")
}
