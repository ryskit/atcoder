package abc232B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s, t = sc.next
  val si = s.toVector.map(_.toInt)
  val ti = t.toVector.map(_.toInt)
  val diff = if (si(0) > ti(0)) (ti(0) + 26) - si(0) else ti(0) - si(0)
  val ans = si
    .zip(ti)
    .forall(p => {
      val sx = if (p._1 + diff > 122) p._1 + diff - 26 else p._1 + diff
      sx == p._2
    })
  println(if (ans) "Yes" else "No")
}
