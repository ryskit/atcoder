package abc072D

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val ps1: Array[Int] = Array.fill(n)(sc.nextInt)
  val ans = (0 until n).foldLeft(0) {
    case (count, i) =>
      if (ps1(i) == i + 1) {
        if (i == n - 1) {
          val tmpCurrent = ps1(i)
          val tmpNext = ps1(i - 1)
          ps1(i) = tmpNext
          ps1(i - 1) = tmpCurrent
        } else {
          val tmpCurrent = ps1(i)
          val tmpNext = ps1(i + 1)
          ps1(i) = tmpNext
          ps1(i + 1) = tmpCurrent
        }
        count + 1
      } else count
  }

  println(ans)
}
