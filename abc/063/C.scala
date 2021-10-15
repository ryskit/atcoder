package C063

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val (nonMultiplesBy10, multiplesBy10) =
    (1 to n).foldLeft(Vector.empty[Int], Vector.empty[Int]) {
      case ((nonMultiplesBy10, multiplesBy10), _) =>
        val s = sc.nextInt
        if (s % 10 == 0) (nonMultiplesBy10, multiplesBy10 :+ s)
        else (nonMultiplesBy10 :+ s, multiplesBy10)
    }
  val answer =
    if (nonMultiplesBy10.isEmpty) 0
    else {
      val sumOfNonMultiplesBy10 = nonMultiplesBy10.sum
      val sumOfMultiplesBy10 = multiplesBy10.sum
      val sum = sumOfMultiplesBy10 + sumOfNonMultiplesBy10
      if (sum % 10 == 0) {
        val min = nonMultiplesBy10.min
        sum - min
      } else sum
    }

  println(answer)
}
