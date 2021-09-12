package B058

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val o, e = sc.next
  val oc = o.toCharArray
  val ec = e.toCharArray

  val answer = ec.zipAll(oc, "", "").foldLeft("") {
    case (ret, (ex, ox)) =>
      ret + ox + ex
  }
  println(answer)
}
