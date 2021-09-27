package C087

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val a = Vector.fill(2)(Vector.fill(n)(sc.nextInt))
  val answer = (1 to n).foldLeft(Int.MinValue) {
    case (max, count) =>
      val rightSum = a(0).take(count).sum
      val underSum = a(1).drop(count - 1).sum
      max.max(rightSum + underSum)
  }
  println(answer)
}
