package abc214B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s, t = sc.nextInt
  val patterns = for {
    a <- 0 to 100
    bMax = 100 - a
    b <- 0 to bMax
    cMax = 100 - a - b
    c <- 0 to cMax
    if (a + b + c <= s && a * b * c <= t)
  } yield (a, b, c)
  println(patterns.toSet.size)
}
