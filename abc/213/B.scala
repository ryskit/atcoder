package abc213B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val as = Vector.fill(n)(sc.nextInt)
  println(as.zipWithIndex.sortBy(_._1).reverse.tail.head._2 + 1)
}
