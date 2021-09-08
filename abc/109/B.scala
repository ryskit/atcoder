package B109

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val firstWord = sc.next
  val (_, _, _, answer) =
    (1 until n).foldLeft(Set(firstWord), firstWord, false, true) {
      case ((saidWords, prev, duplicated, ok), _) =>
        val word = sc.next
        if (!ok) {
          (saidWords, word, duplicated, ok)
        } else {
          if (saidWords.contains(word)) {
            (saidWords, word, true, false)
          } else {
            (saidWords + word, word, false, prev.last == word.head)
          }
        }
    }
  println(if (answer) "Yes" else "No")
}
