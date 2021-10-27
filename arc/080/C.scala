package arc080C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  var as = Vector.fill(n)(sc.nextLong)
  val (m4, m2, mo) = as.foldLeft(0, 0, 0) {
    case ((m4, m2, mo), a) =>
      if (a % 4 == 0) (m4 + 1, m2, mo)
      else if (a % 2 == 0) (m4, m2 + 1, mo)
      else (m4, m2, mo + 1)
  }

  val answer =
    if (m4 + 1 == mo && n == (m4 + mo)) "Yes"
    else if (m4 < mo) "No"
    else "Yes"

  println(answer)
}
