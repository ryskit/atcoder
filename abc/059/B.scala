package C059

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val a = sc.next
  val b = sc.next
  val answer = (a, b) match {
    case (a, b) if a.length > b.length => "GREATER"
    case (a, b) if a.length < b.length => "LESS"
    case (a, b) if a.length == b.length =>
      val len = a.length
      val splitCount = (len / 10) + (if (len % 10 > 0) 1 else 0)
      val (_, _, chunks) =
        Seq.fill(splitCount)(10).foldLeft(a, b, List.empty[(String, String)]) {
          case ((aRem, bRem, acc), chunkCount) =>
            (
              aRem.drop(chunkCount),
              bRem.drop(chunkCount),
              (a.take(chunkCount), b.take(chunkCount)) +: acc
            )
        }
      val (_, result) = chunks.foldLeft(true, "EQUAL") {
        case ((next, result), chunk) =>
          if (next) {
            if (chunk._1.toLong != chunk._2.toLong)
              (
                false,
                if (chunk._1.toLong > chunk._2.toLong) "GREATER" else "LESS"
              )
            else
              (true, result)
          } else {
            (false, result)
          }
      }
      result
  }
  println(answer)
}
