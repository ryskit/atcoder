package abc237B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val h, w = sc.nextInt
  val map: Array[Array[Int]] = Array.ofDim(h, w)
  (0 until h).foreach { i =>
    (0 until w).foreach { j =>
      val a = sc.nextInt
      map(i).update(j, a)
    }
  }
  val ans = (0 until w).foldLeft(Vector.empty[Vector[Int]]) {
    case (acc, j) =>
      val acc2 = (0 until h).foldLeft(Vector.empty[Int]) {
        case (acc2, i) =>
          acc2 :+ map(i)(j)
      }
      acc :+ acc2
  }
  ans.foreach { r =>
    println(r.mkString(" "))
  }
}
