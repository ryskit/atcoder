package abc045B

import scala.collection.mutable

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val a, b, c = sc.next.toVector.map {
    case 'a' => 0
    case 'b' => 1
    case 'c' => 2
  }
  val queue = mutable.Queue[Int]()
  val mapping = Vector(a, b, c)
  val counts = Array.fill(3)(0)
  queue.enqueue(a.head)
  counts(0) += 1
  var ans = -1

  while (queue.nonEmpty) {
    val x = queue.dequeue()
    val xIdx = counts(x)
    if (mapping(x).isDefinedAt(xIdx)) {
      val next = mapping(x)(xIdx)
      queue.enqueue(next)
      counts(x) += 1
    } else {
      ans = x
    }
  }

  println(ans match {
    case 0 => 'A'
    case 1 => 'B'
    case 2 => 'C'
  })
}
