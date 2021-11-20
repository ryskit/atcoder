package abc224B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val h, w = sc.nextInt
  val as = Vector.fill(h)(Vector.fill(w)(sc.nextLong))
  val targets = for {
    i1 <- 0 until h
    i2s = i1 + 1
    i2 <- i2s until h if i2s < h
    j1 <- 0 until w
    j2s = j1 + 1
    j2 <- j2s until w if j2s < w
  } yield (i1, i2, j1, j2)
  val answer = targets.foldLeft(true) {
    case (res, (i1, i2, j1, j2)) => {
      if (res) {
        val cond1 = as(i1)(j1) + as(i2)(j2)
        val cond2 = as(i2)(j1) + as(i1)(j2)
        cond1 <= cond2
      } else {
        res
      }
    }
  }
  println(if (answer) "Yes" else "No")
}
