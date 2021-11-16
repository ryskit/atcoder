package abc215B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextLong
  var k = 0
  var t = 1L
  while (t * 2 <= n) {
    k += 1
    t *= 2
  }
  println(k)
}
