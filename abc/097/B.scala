package B097

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val x = sc.nextInt
  val answer =
    if (x == 1) 1
    else {
      (for {
        i <- 2 to x
        j <- 2 to x
      } yield math.pow(i, j).toInt).filter(_ <= x).max
    }

  println(answer)
}
