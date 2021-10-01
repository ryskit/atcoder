package C120

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s = sc.next
  val (r, b) = s.toSeq.foldLeft(0, 0) {
    case ((rCnt, bCnt), c) =>
      if (c == '0') (rCnt + 1, bCnt) else (rCnt, bCnt + 1)
  }
  val diff = math.abs(r - b)
  println(r + b - diff)
}
