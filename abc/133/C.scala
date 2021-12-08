package abc133C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val l, r = sc.nextLong
  println((for {
    i <- l to Math.min(r - 1, l + 2019)
    j <- l + 1 to Math.min(r, l + 2020)
  } yield i * j % 2019).min)
}
