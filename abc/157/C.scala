package abc157C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, m = sc.nextInt
  val (conditions, isExists) = (1 to m).foldLeft(Map.empty[Int, Int], true) {
    case ((acc, isExists), _) =>
      val s, c = sc.nextInt
      if (isExists) {
        if (acc.isDefinedAt(s)) (acc, acc(s) == c)
        else
          (acc + (s -> c), isExists)
      } else {
        (acc, isExists)
      }
  }

  val ranges = Seq(0 to 9, 10 to 99, 100 to 999)
  val answer = if (isExists) {
    val result = ranges(n - 1).foldLeft(false, 0) {
      case ((result, out), num) =>
        val numStr = num.toString
        if (!result) {
          val exists = conditions.foldLeft(true) {
            case (exists, (s, c)) =>
              if (exists) {
                s <= n && numStr(s - 1).toString == c.toString
              } else exists
          }
          if (exists) (true, num)
          else (result, out)
        } else (result, out)
    }
    if (result._1) result._2 else -1
  } else -1
  println(answer)
}
