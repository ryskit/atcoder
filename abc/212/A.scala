package abc212A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val a, b = sc.nextInt
  if (0 < a && b == 0) {
    println("Gold")
  } else if (a == 0 && 0 < b) {
    println("Silver")
  } else {
    println("Alloy")
  }
}
