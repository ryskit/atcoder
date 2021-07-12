import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)

  val a = sc.nextInt
  val b = sc.nextInt
  if (a * b % 2 == 0) println("Even")
  else println("Odd")
}
