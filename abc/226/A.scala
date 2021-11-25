package abc226A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val x = sc.next
  val split = x.split("\\.")
  if (split(1).head.toString.toInt < 5) {
    println(split(0))
  } else {
    println(split(0).toInt + 1)
  }
}
