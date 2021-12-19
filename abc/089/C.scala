package abc089C
// https://atcoder.jp/contests/abc089/tasks/abc089_c

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val names = Vector.fill(n)(sc.next).filter { s =>
    s(0) match {
      case 'M' => true
      case 'A' => true
      case 'R' => true
      case 'C' => true
      case 'H' => true
      case _   => false
    }
  }
  val groups = names.groupBy(_(0)).view.mapValues(_.size.toLong).toList
  val ans = groups.combinations(3).map(_.map(_._2).product).sum
  println(ans)
}
