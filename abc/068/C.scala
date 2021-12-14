package abc068C

import scala.collection.mutable.ListBuffer

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, m = sc.nextInt

  val graph = Array.fill(n + 1)(ListBuffer.empty[Int])
  (1 to m).foreach { i =>
    val a, b = sc.nextInt
    graph(a) += b
  }

  def depthFirstSearch(): Boolean = {
    var visited = false
    def dfs(start: Int, count: Int): Unit = {
      if (count < 0) return
      if (start == n) visited = true
      else {
        for (i <- graph(start)) {
          if (!visited) dfs(i, count - 1)
          else return
        }
      }
    }
    dfs(1, 2)
    visited
  }
  println(if (depthFirstSearch()) "POSSIBLE" else "IMPOSSIBLE")
}
