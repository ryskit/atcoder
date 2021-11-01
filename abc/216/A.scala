package abc216A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s = sc.next
  val splits = s.split("\\.")
  val x = splits(0).toInt
  val y = splits(1).toInt
  if (y <= 2) println(s"$x-")
  else if (y <= 6) println(x)
  else println(s"$x+")
}
