package abc203B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, k = sc.nextInt
  val all = for {
    i <- 1 to n
    j <- 1 to k
  } yield i * 100 + j
  val ans = all.sum
  println(ans)
}
