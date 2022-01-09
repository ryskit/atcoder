package abc234D

import scala.collection.mutable

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, k = sc.nextInt
  val ps = Vector.fill(n)(sc.nextInt)
  val queue = new mutable.PriorityQueue[Int]()(Ordering.Int.reverse)
  ps.take(k).foreach { p =>
    queue.enqueue(p)
  }
  val ans = (k until n).foldLeft(Vector(queue.head)) {
    case (acc, i) =>
      val pick = ps(i)
      if (pick > queue.head) {
        queue.dequeue()
        queue.enqueue(pick)
      }
      acc :+ queue.head
  }
  println(ans.mkString("\n"))
}

// 11 5
// 3 7 2 5 11 6 1 9 8 10 4

// 2 3 5 7 11

//object Main extends App {
//  val sc = new java.util.Scanner(System.in)
//  val n, k = sc.nextInt
//  val ps = (1 to n).foldLeft(Vector.empty[Long]) {
//    case (acc, i) =>
//      val p = sc.nextLong
//      acc :+ p
//  }
//  val psForTakeK = ps.take(k).sorted.reverse
//  val firstPick = psForTakeK(k - 1)
//  val (_, ans, _) = (k until n)
//    .foldLeft(psForTakeK, Vector(firstPick), firstPick) {
//      case ((candidates, acc, prev), i) =>
//        val pick = ps(i)
//        if (prev >= pick) (candidates, acc :+ prev, prev)
//        else {
//          val newCandidates = (candidates :+ pick).sorted.reverse
//          val kth = newCandidates(k - 1)
//          (newCandidates, acc :+ kth, kth)
//        }
//    }
//  println(ans.mkString("\n"))
//}
