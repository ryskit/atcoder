package abc208A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val a, b = sc.nextInt
  println(if (1 * a <= b && b <= 6 * a) "Yes" else "No")
}
