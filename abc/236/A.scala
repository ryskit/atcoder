package abc236A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s = sc.next
  val a, b = sc.nextInt
  val sa = s.toArray
  val ai = sa(a - 1)
  val bi = sa(b - 1)
  sa.update(a - 1, bi)
  sa.update(b - 1, ai)
  println(sa.mkString(""))
}
