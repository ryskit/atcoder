package codefestival2016qualaB

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val as = (1 to n).foldLeft(Map.empty[Int, Int]) {
    case (acc, idx) =>
      val a = sc.nextInt
      acc + (idx -> a)
  }
  val count = as.foldLeft(0) {
    case (count, a) =>
      val pair = as.getOrElse(a._2, 0)
      if (a._1 == pair) {
        count + 1
      } else {
        count
      }
  }
  println(count / 2)
}
