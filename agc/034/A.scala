package agc034A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val a, b, c, d = sc.nextInt - 1
  val s = sc.next

  val aCan = !s.substring(a, c).contains("##")
  val bCan = !s.substring(b, d).contains("##")
  val sequenceDot3 = s.substring(b - 1, d + 1).contains("...")
  val ans = if (c < d) {
    aCan && bCan
  } else {
    aCan && bCan && sequenceDot3
  }
  println(if (ans) "Yes" else "No")
}
