package B044

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val w = sc.next
  val charCount = w.toSeq.foldLeft(Map.empty[Char, Int]) {
    case (charCount, c) =>
      charCount + (c -> (charCount.getOrElse(c, 0) + 1))
  }
  val answer = charCount.foldLeft(true) {
    case (answer, (c, count)) => if (count % 2 != 0) false else answer
  }
  println(if (answer) "Yes" else "No")
}
