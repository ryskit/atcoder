package B053

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s = sc.next
  val (aIdx, zIdx) = s.zipWithIndex.foldLeft(Int.MaxValue, Int.MinValue) {
    case ((aIdx, zIdx), (c, idx)) => {
      val tmpAIdx = if (c == 'A') math.min(idx, aIdx) else aIdx
      val tmpZIdx = if (c == 'Z') math.max(idx, zIdx) else zIdx
      (tmpAIdx, tmpZIdx)
    }
  }
  println(zIdx - aIdx + 1)

}
