package C124

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s = sc.next
  val s0 = (1 to s.length).map(n => if (n % 2 != 0) '0' else '1').mkString
  val s1 = (1 to s.length).map(n => if (n % 2 != 0) '1' else '0').mkString
  val answer = math.min(
    s0.zip(s).count { case (c0, c) => c0 != c },
    s1.zip(s).count { case (c1, c) => c1 != c }
  )
  println(answer)
}
