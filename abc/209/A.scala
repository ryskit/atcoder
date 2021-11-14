package abc209A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val a, b = sc.nextInt
  if (a <= b) {
    println(b - a + 1)
  } else {
    println(0)
  }
}
