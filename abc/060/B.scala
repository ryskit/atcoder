package B060

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val a, b, c = sc.nextInt
  val answer = (1 to 100).foldLeft("") {
    case (acc, x) =>
      if (a * x % b == c) {
        "YES"
      } else {
        acc
      }
  }
  println(if (answer == "") "NO" else answer)
}
