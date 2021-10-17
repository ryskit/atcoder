package abc220A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val a, b, c = sc.nextInt

  val divA = a / c
  val remaining = a % c
  val multiple = if (0 < remaining) c * (divA + 1) else c * divA
  val answer =
    if (a <= multiple && multiple <= b) multiple
    else -1

  println(answer)
}
