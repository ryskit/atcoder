package abc219B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s1, s2, s3, t = sc.next
  val ans = t.foldLeft("") {
    case (con, ti) =>
      val i = ti.toString.toInt
      i match {
        case 1 => con + s1
        case 2 => con + s2
        case 3 => con + s3
      }
  }
  println(ans)
}
