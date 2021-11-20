package codefestival2017qualbB

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val ds = (1 to n).foldLeft(Map.empty[Long, Int]) {
    case (acc, i) =>
      val d = sc.nextLong
      acc + (d -> (acc.getOrElse(d, 0) + 1))
  }
  val m = sc.nextInt
  val ts = Vector.fill(m)(sc.nextLong)
  val (_, answer) = ts.foldLeft(ds, true) {
    case ((dsx, res), t) =>
      if (res) {
        val count = dsx.getOrElse(t, 0)
        if (dsx.getOrElse(t, 0) < 1) {
          (dsx, false)
        } else {
          (dsx + (t -> (count - 1)), res)
        }
      } else {
        (dsx, res)
      }
  }
  println(if (answer) "YES" else "NO")
}
