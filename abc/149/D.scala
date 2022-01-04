package abc149D

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, k = sc.nextInt
  val r, s, p = sc.nextLong
  val t = sc.next.toVector
  val past: Array[Char] = Array.fill(n + 1)('x')
  val ans = t.zipWithIndex.foldLeft(0L) {
    case (score, (c, cIdx)) =>
      if (cIdx <= k - 1) {
        past.update(cIdx, getWinHand(c))
        val addScore = calcScore(c)
        score + addScore
      } else {
        val kPast = past(cIdx - k)
        val win = getWinHand(c)
        if (kPast != win) {
          val addScore = calcScore(c)
          past.update(cIdx, win)
          score + addScore
        } else {
          score
        }
      }
  }
  println(ans)

  def getWinHand(c: Char): Char = {
    c match {
      case 'r' => 'p'
      case 's' => 'r'
      case 'p' => 's'
    }
  }

  def calcScore(hand: Char): Long = {
    hand match {
      case 'r' => p
      case 's' => r
      case 'p' => s
    }
  }
}
