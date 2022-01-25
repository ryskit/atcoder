package abc200A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  println(n / 100 + (if (n % 100 == 0) 0 else 1))
}
