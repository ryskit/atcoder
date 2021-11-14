package abc216B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val (_, ans) = (1 to n).foldLeft(Set.empty[String], false) {
    case ((acc, ans), i) =>
      val s, t = sc.next
      val x = s + " " + t
      if (!ans) {
        if (acc.contains(x)) {
          (acc, true)
        } else {
          (acc + x, ans)
        }
      } else {
        (acc + x, ans)
      }
  }
  println(if (ans) "Yes" else "No")
}
