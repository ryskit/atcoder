package C103

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val as = Vector.fill(n)(sc.nextInt)
  val answer = as.foldLeft(0) {
    case (sum, a) => sum + a - 1
  }
  println(answer)
}
