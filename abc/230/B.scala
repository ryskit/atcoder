package abc230B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s = sc.next
  val ss = s.toSeq
  val oIdx = ss.indexWhere(c => c == 'o')
  val heads = ss.slice(0, if (oIdx == -1) ss.length else oIdx)
  val (_, _, result) = ss
    .slice(if (oIdx == -1) ss.length else oIdx, ss.length)
    .foldLeft('x', 2, true) {
      case ((prev, xCount, result), c) =>
        if (result) {
          if (c == 'o') {
            if (xCount == 2 && prev == 'x') (c, 0, result)
            else (c, 0, false)
          } else {
            if (xCount >= 2) (c, xCount + 1, false)
            else (c, xCount + 1, result)
          }
        } else {
          if (xCount >= 2) (prev, xCount + 1, false)
          else (prev, xCount + 1, result)
        }
    }
  val ans =
    if (result && heads.size <= 2) "Yes"
    else "No"
  println(ans)
}
