package keyence2019B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val sa = sc.next.toArray
  val sLen = sa.size
  val removeLen = sLen - 7
  val answer = sa.indices.foldLeft(false) {
    case (result, i) =>
      val f = sa.slice(0, i).mkString("")
      val b = sa.slice(removeLen + i, sLen).mkString("")
      if (f + b == "keyence") true
      else result
  }
  println(if (answer) "YES" else "NO")
}
