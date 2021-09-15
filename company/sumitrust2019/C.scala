package sumib2019C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val x = sc.nextInt
  val answer =
    if (x < 100) 0
    else {
      val divide = x / 100
      val rem = x % 100
      if (divide * 5 >= rem) 1 else 0
    }

  println(answer)
}
