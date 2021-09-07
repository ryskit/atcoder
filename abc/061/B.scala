package B061

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, m = sc.nextInt
  val answer = (1 to m).foldLeft(scala.collection.mutable.Seq.fill(n)(0)) {
    case (mapping, _) =>
      val a, b = sc.nextInt
      mapping.update(a - 1, mapping(a - 1) + 1)
      mapping.update(b - 1, mapping(b - 1) + 1)
      mapping
  }
  answer.foreach(println)
}
