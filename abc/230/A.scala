package abc230A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt()
  val num = if (n >= 42) n + 1 else n
  if (num < 10) println(s"AGC00${num}")
  else println(s"AGC0${num}")
}
