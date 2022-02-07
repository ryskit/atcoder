package abc051B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val k, s = sc.nextInt
  var total = 0L
  for {
    x <- 0 to k
    y <- 0 to k
    z = s - x - y
    if z <= k
    if 0 <= x && 0 <= y && 0 <= z && x + y + z == s
  } {
    total += 1L
  }
  println(total)
}
