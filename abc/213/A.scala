package abc213A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val a, b = sc.nextInt
  val answer = (1 to 255).foldLeft(0) {
    case (ans, i) =>
      val x = a ^ i
      if (x == b) i
      else ans
  }
  println(answer)
}
