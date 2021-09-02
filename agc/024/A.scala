package A024

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val a, b, c, k = BigInt(sc.nextLong)
  val result = a - b
  val answer = if (result >= BigInt(100000000000000000L)) {
    "Unfair"
  } else if (k % 2 == 0) {
    result
  } else {
    -1 * result
  }
  println(answer)
}
