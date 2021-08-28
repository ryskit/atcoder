package C134

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val as = Seq.fill(n)(sc.nextInt)

  val max :: second :: _ = as.sorted.reverse
  as.foreach(a => println(if (a == max) second else max))
}
