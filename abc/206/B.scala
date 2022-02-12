package abc206B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextLong
  var sum = 0L
  var i = 1
  while (sum < n) {
    sum += i
    i += 1
  }
  println(i - 1)
}
