package cf17finalB

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s = sc.next
  val eachCount = ("abc" + s).toSeq.groupBy(identity).map(_._2.length)
  println(if (1 >= eachCount.max - eachCount.min) "YES" else "NO")
}
