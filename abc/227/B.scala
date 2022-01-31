package abc227B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val ss = Vector.fill(n)(sc.nextInt).sorted
  val guesses = for {
    a <- 1 to 1000
    b <- 1 to 1000
    if 4 * a * b + 3 * a + 3 * b <= 1000
  } yield 4 * a * b + 3 * a + 3 * b
  val ans = ss.foldLeft(0) {
    case (total, s) =>
      guesses.iterator.find(g => g == s) match {
        case Some(_) => total
        case None    => total + 1
      }
  }
  println(ans)
}
