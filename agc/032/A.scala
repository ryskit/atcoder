package agc032A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val bs = Vector.fill(n)(sc.nextInt)
  val (_, orders, result) = (1 to n).foldLeft(bs, Vector.empty[Int], true) {
    case ((current, orders, result), i) =>
      if (result) {
        val (removeIdx, ok) = current.zipWithIndex.foldLeft(0, false) {
          case ((matchIdx, ok), x) =>
            if (x._2 + 1 == x._1) (x._2, true)
            else (matchIdx, ok)
        }
        if (ok) {
          val next = current.zipWithIndex.foldLeft(Vector.empty[Int]) {
            case (acc, x) =>
              if (x._2 == removeIdx) acc
              else acc :+ x._1
          }
          (next, orders :+ current(removeIdx), result)
        } else {
          (current, orders, false)
        }
      } else (current, orders, false)
  }

  if (result) orders.reverse.mkString("\n").foreach(print) else println(-1)
}

// 9
// 1 1 1 2 2 1 2 3 2
// 1 2 3 4 5 6 7 8 9

// 1 1 2 2 1 2 3 2
// 1 2 3 4 5 6 7 8

// 1 2 2 1 2 3 2
// 1 2 3 4 5 6 7

// 1 2 1 2 3 2
// 1 2 3 4 5 6

// 1 1 2 3 2
// 1 2 3 4 5

// 1 2 3 2
// 1 2 3 4

// 1 2 2
// 1 2 3

// 1 2
// 1 2

// 1
// 1

// 1 2 2 3 1 2 2 1 1
