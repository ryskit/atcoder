package C140

object Main extends App {
  // B1 >= max(A1, A2) A1 <= B1 A2 <= B1
  // B2 >= max(A2, A3) A2 <= B2, A3 <= B2
  // 2, 2, 5
  //
  // A(1) <= B(1)
  // A(i) <= min(B(i-1), B(i))
  // A(N) <= B(N-1)
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val b = Seq.fill(n - 1)(sc.nextInt)
  val answer = (1 until n - 1).foldLeft(0) {
    case (sum, idx) =>
      sum + math.min(b(idx - 1), b(idx))
  } + b.head + b.last
  println(answer)
}
