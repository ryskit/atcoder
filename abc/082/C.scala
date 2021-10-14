package C082

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val (as, max) = (1 to n).foldLeft(Map.empty[Int, Int], 0) {
    case ((acc, max), _) =>
      val a = sc.nextInt
      var maxCount = max
      (
        acc ++ (a - 1 to a + 1).foldLeft(acc) {
          case (t, x) =>
            if (0 <= x || x < 1000000) {
              val count = t.getOrElse(x, 0) + 1
              maxCount = maxCount.max(count)
              t + (x -> (count))
            } else {
              t
            }
        },
        maxCount
      )
  }
  println(max)
}
