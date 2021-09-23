package C136

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val hs = Vector.fill(n)(sc.nextLong)
  val (_, answer) = hs.foldLeft(1L, true) {
    case ((prev, result), h) => {
      if (prev == h) {
        (h, result)
      } else if (prev <= h - 1) {
        (h - 1, result)
      } else {
        (h, false)
      }
    }
  }
  println(if (answer) "Yes" else "No")
}
