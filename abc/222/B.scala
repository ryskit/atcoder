package B222

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val p = sc.nextInt
  val as = Vector.fill(n)(sc.nextInt)
  println(as.count(_ < p))
}
