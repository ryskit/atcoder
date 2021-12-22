package abc228A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s, t, x = sc.nextInt
  if (s < t) {
    val range = s until t
    println(if (range.contains(x)) "Yes" else "No")
  } else {
    val range = (s until 24) ++ (0 until t)
    println(range)
    println(if (range.contains(x)) "Yes" else "No")
  }
}
