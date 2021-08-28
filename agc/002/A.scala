package A002

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val a = sc.nextInt
  val b = sc.nextInt

  if (0 < a) {
    println("Positive")
  } else if (a <= 0) {
    if (0 <= b) println("Zero")
    else {
      val negativeCount = math.abs(a) - math.abs(b) + 1
      if (negativeCount % 2 == 0) println("Positive")
      else println("Negative")
    }
  }
}
