package B062

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val h, w = sc.nextInt
  val as = Seq.fill(h)(sc.next)

  println("#" * (w + 2))
  for (i <- 0 until h) {
    println("#" + as(i) + "#")
  }
  println("#" * (w + 2))
}
