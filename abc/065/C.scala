package abc065C
// https://atcoder.jp/contests/abc065/tasks/arc076_a

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, m = sc.nextLong
  val MOD = 1000000007L
  val ans = if (math.abs(n - m) > 1) {
    0
  } else {
    if (n == m) {
      val fac1 = fac(n)
      (fac1 * fac1 * 2) % MOD
    } else {
      val min = n.min(m)
      val max = n.max(m)
      val fac1 = fac(min)
      (fac1 * fac1 * max) % MOD
    }
  }
  println(ans)

  def fac(n: Long): Long = {
    def loop(n: Long, acc: Long): Long = {
      if (n == 1) acc
      else loop(n - 1, acc * n % MOD)
    }
    loop(n, 1)
  }
}

// 2 2
// A, B | C, D
// A, C, B, D
// A, D, B, C

// 2 1
// A, B | C

// A, C, B
// B, C, A

// C, A, B
// C, B, A

// 3 2 => 16
// A, B, C | D, E
// 2 * 2 * 1

// A, D, B, E, C
// A, D, C, E, B
// A, E, B, D, C
// A, E, C, D, B

// 4 3 =>
// A, B, C, D | E, F, G

// 3 * 3 * 2 * 2 * 1 * 1
// 36
// A, E, B, F, C, G, D
// A, E, B, F, D,
// A, E, B, G, C,
// A, E, B, G, D,
// A, E, C, F, B,
// A, E, C, F, D,
// A, E, C, G, B,
// A, E, C, G, D,
// A, E, D, F, B,
// A, E, D, F, C,
// A, E, D, G, B,
// A, E, D, G, C,
// A, F, B, E, C,
// A, F, B, E, D,
// A, F, B, G, C,
// A, F, B, G, D,
// A, F, C, E, B,
// A, F, C, E, D,
// A, F, C, G, B,
// A, F, C, G, D,
// A, F, D, E, B,
// A, F, D, E, C,
// A, F, D, G, B,
// A, F, D, G, C,
// A, G, B, E, C,
// A, G, B, E, D,
// A, G, B, F, C,
// A, G, B, F, D,
// A, G, C, E, B,
// A, G, C, E, D,
// A, G, C, F, B,
// A, G, C, F, D,
// A, G, D, E, B,
// A, G, D, E, C,
// A, G, D, F, B,
// A, G, D, F, C,

// (3 * 3 * 2 * 2 * 1 * 1) * 2 =>
// 3 3
// A, B , C | D, E, F => 12 * 6

// A, D, B, E, C, F
// A, D, B, F, C, E
// A, D, C, E, B, F
// A, D, C, F, B, E
// A, E, B, D, C, F
// A, E, B, F, C, D
// A, E, C, D, B, F
// A, E, C, F, B, D
// A, F, C, D, B, E
// A, F, C, E, B, D
// A, F, B, D, C, E
// A, F, B, E, C, D

// B, D, A, E,
// B, D, A, F,
// B, D, C, E,
// B, D, C, F,
// B, E, A, D,
// B, E, A, F,
// B, E, C, D,
// B, E, C, F,
// B, F, A, D,
// B, F, A, E,
// B, F, C, D,
// B, F, C, E,
