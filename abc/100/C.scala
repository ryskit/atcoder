package C100

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val as = Vector.fill(n)(sc.nextLong)
  val answer = as.filter(_ % 2 == 0).foldLeft(0L) {
    case (sum, a) => sum + count(a)
  }
  println(answer)

  @scala.annotation.tailrec
  def count(x: Long, sum: Long = 0): Long = {
    if (x % 2 == 0) count(x / 2, sum + 1)
    else sum
  }
}
