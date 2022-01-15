package abc235A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val x = sc.next
  val split = x.split("")
  val a = split(0)
  val b = split(1)
  val c = split(2)
  val ans = (a + b + c).toInt + (b + c + a).toInt + (c + a + b).toInt
  println(ans)
}
