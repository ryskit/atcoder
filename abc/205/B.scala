package abc205B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val as = Vector.fill(n)(sc.nextInt)
  val res = as.sorted.zipWithIndex.forall(x => x._1 == x._2 + 1)
  println(if (res) "Yes" else "No")
}
