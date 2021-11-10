package abc220B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val k = sc.nextInt
  val a, b = sc.next
  val a10: Long = java.lang.Long.parseLong(a, k)
  val b10 = java.lang.Long.parseLong(b, k)
  val ans = a10 * b10
  println(ans)
}
