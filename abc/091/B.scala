package B091

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val ss = (1 to n).foldLeft(Map.empty[String, Int]) {
    case (map, _) =>
      val s = sc.next
      map + (s -> (map.getOrElse(s, 0) + 1))
  }
  val m = sc.nextInt
  val ts = (1 to m).foldLeft(Map.empty[String, Int]) {
    case (map, _) =>
      val t = sc.next
      map + (t -> (map.getOrElse(t, 0) + 1))
  }
  val answer = ss.foldLeft(0) {
    case (max, (key, count)) =>
      val diff = count - ts.getOrElse(key, 0)
      max.max(diff)
  }
  println(answer)
}
