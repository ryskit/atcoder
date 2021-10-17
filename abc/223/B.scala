package abc223B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s = sc.next
  val list = (1 to s.length).foldLeft(Set(s)) {
    case (acc, i) =>
      val (f, b) = s.splitAt(i)
      acc + (b ++ f)
  }
  val sortedV = list.toVector.sorted
  println(sortedV(0))
  println(sortedV(s.length - 1))
}
