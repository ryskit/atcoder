package keyence2019C
// https://atcoder.jp/contests/keyence2019/tasks/keyence2019_c

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val (as, aSum) = (1 to n).foldLeft(Vector.empty[Long], 0L) {
    case ((acc, sum), i) =>
      val a = sc.nextLong
      (acc :+ a, sum + 1)
  }
  val (bs, bSum) = (1 to n).foldLeft(Vector.empty[Long], 0L) {
    case ((acc, sum), i) =>
      val b = sc.nextLong
      (acc :+ b, sum + 1)
  }
  val (surplusList, surplusSum, insufList, insufSum) =
    (0 until n).foldLeft(Vector.empty[Long], 0L, Vector.empty[Long], 0L) {
      case ((surplusList, surplusSum, insufList, insufSum), i) =>
        val a = as(i)
        val b = bs(i)
        if (a >= b) {
          val diff = a - b
          if (diff == 0) (surplusList, surplusSum, insufList, insufSum)
          else (surplusList :+ diff, surplusSum + diff, insufList, insufSum)
        } else {
          val diff = b - a
          (surplusList, surplusSum, insufList :+ diff, insufSum + diff)
        }
    }

  val ans =
    if (insufSum > surplusSum) -1
    else if (insufList.isEmpty) 0
    else {
      val sortedSurplusList = surplusList.sorted.reverse

      val (rem, count, _) = sortedSurplusList.foldLeft(insufSum, 0, true) {
        case ((sum, count, next), surplusX) =>
          if (!next) (sum, count, next)
          else {
            if (sum - surplusX > 0) (sum - surplusX, count + 1, next)
            else (sum - surplusX, count + 1, false)
          }
      }
      if (rem > 0) -1
      else {
        insufList.size + count
      }
    }
  println(ans)
}
