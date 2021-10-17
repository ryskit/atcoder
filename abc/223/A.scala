package abc223A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val x = sc.nextInt
  println(if (x % 100 == 0 && x != 0) "Yes" else "No")
}
