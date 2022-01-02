package panasonic2020C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val a, b, c = sc.nextLong
  val ans =
    if (c - a - b <= 0) "No"
    // √a + √b < √c
    // 2√ab < c - a - b
    // 4ab < (c - a - b)2
    else if (4 * a * b < (c - a - b) * (c - a - b)) "Yes"
    else "No"
  println(ans)
}
