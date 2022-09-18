package teppan_bookB03

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val as = (1 to n).foldLeft(List.empty[(Int, Int)])((acc, i) =>
    acc :+ (i, sc.nextInt)
  )
  var result = "No"
  for {
    a1 <- as
    a2 <- as
    a3 <- as
  } {
    if (a1._1 != a2._1 && a2._1 != a3._1 && a3._1 != a1._1) {
      if (a1._2 + a2._2 + a3._2 == 1000) result = "Yes"
    }
  }
  println(result)
}
