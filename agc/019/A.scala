package A019

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val q, h, s, d, n = sc.nextLong()
  val oneLiterPrice = Vector(q * 4, h * 2, s).min
  val twoLiterPrice = (oneLiterPrice * 2).min(d)
  println((n / 2) * twoLiterPrice + (n % 2) * oneLiterPrice)
}
