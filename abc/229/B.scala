package abc229B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val a, b = sc.next.reverse.toVector
  val result = a.zipAll(b, '0', '0').foldLeft(true) {
    case (result, (x, y)) =>
      if (result) {
        val sum = x.toString.toInt + y.toString.toInt
        if (sum % 10 == sum) true
        else false
      } else {
        result
      }
  }

  val ans = if (result) "Easy" else "Hard"
  println(ans)
}
