package tessoku_bookA05

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val k = sc.nextInt
  var result = 0
  for {
    x <- 1 to n
    y <- 1 to n
    z = k - x - y
    if (z >= 1 && z <= n)
  } result += 1
  println(result)
}
