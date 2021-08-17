package B071

object Main extends App {
  def solve(): String = {
    val scanner = new java.util.Scanner(System.in)
    val s = scanner.next
    val set = s.toSet
    def loop(alphaSeq: Seq[Char]): String = {
      if (alphaSeq.isEmpty) "None"
      else {
        val c = alphaSeq.head
        if (!set.contains(c)) c.toString
        else loop(alphaSeq.tail)
      }
    }
    loop("abcdefghijklmnopqrstuvwxyz".toSeq)
  }
  println(solve())
}
