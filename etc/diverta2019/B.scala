package diverta2019B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val r, g, b, n = sc.nextInt
  var answer = 0
  for {
    rc <- 0 to (n / r)
    gc <- 0 to ((n - (rc * r)) / g)
    remaining = n - (rc * r + gc * g)
    if remaining % b == 0
    bc = remaining / b
    sum = rc * r + gc * g + bc * b
    if sum == n
  } {
    answer += 1
  }
  println(answer)
}
