package A040

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s = sc.next
  val n = s.length + 1
  val seq = collection.mutable.Seq.fill(n)(0L)
  for (i <- s.indices; if s(i) == '<') {
    seq(i + 1) = seq(i + 1).max(seq(i) + 1)
  }
  for (i <- s.indices.reverse; if s(i) == '>') {
    seq(i) = seq(i).max(seq(i + 1) + 1)
  }
  println(seq.sum)
}
