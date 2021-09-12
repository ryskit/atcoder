package B049

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val h, w = sc.nextInt
  (1 to h).foreach { _ =>
    val line = sc.next
    (1 to 2).foreach(_ => println(line))
  }
}
