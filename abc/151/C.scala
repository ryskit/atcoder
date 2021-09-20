package C151

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, m = sc.nextInt
  val ps = IndexedSeq.fill[(Int, String)](m)((sc.nextInt, sc.next))
  val g = ps.groupMap(_._1)(_._2).values
  val ac = g.count(_.contains("AC"))
  val p = g.filter(_.contains("AC")).map(_.indexOf("AC")).sum
  println(s"$ac $p")
}
