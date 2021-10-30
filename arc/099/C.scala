package arc099C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, k = sc.nextInt
  val as = Vector.fill(n)(sc.nextInt)
  val answer =
    if (n == k) 1
    else {
      val divider = (n - k) / (k - 1)
      val remaining = (n - k) % (k - 1)
      if (remaining != 0) divider + 2 else divider + 1
    }

  println(answer)
}
