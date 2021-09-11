package B104

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s = sc.next

  def isC(c: Char): Boolean = c == 'C'
  def isLowerCaseAlphabet(c: Char): Boolean =
    (97 to 122).contains(c)

  val (_, _, _, answer) = s.zipWithIndex.foldLeft(2, s.length - 2, 0, true) {
    case ((startC, endC, countC, result), (c, idx)) =>
      if (idx == 0) {
        (startC, endC, countC, c == 'A')
      } else {
        if (!result) {
          (startC, endC, countC, result)
        } else {
          val currentCharIsC = startC <= idx && idx <= endC && isC(c)
          val cntC = if (currentCharIsC) countC + 1 else countC
          val right =
            if (currentCharIsC) !isLowerCaseAlphabet(c) && cntC == 1
            else isLowerCaseAlphabet(c)
          (
            startC,
            endC,
            cntC,
            if (idx == s.length - 1) cntC == 1 && right else right
          )
        }
      }
  }
  println(if (answer) "AC" else "WA")
}
