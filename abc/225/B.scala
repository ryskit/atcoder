package abc225B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val count = new Array[Int](n + 1)
  (1 until n).foreach { _ =>
    val a, b = sc.nextInt
    count.update(a, count(a) + 1)
    count.update(b, count(b) + 1)
  }
  if (count.tail.takeWhile(c => c != n - 1).length == n) {
    println("No")
  } else {
    println("Yes")
  }
}
