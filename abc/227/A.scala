package abc227A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, k, a = sc.nextInt
  val r = (a + k - 1) % n
  println(if (r == 0) n else r)
}
