package abc228B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, x = sc.nextInt
  val as = Vector.fill(n)(sc.nextInt)
  val done = Array.fill(n + 10)(false)
  done.update(x, true)
  var count = 1
  var next = as(x - 1)
  var hasNext = true
  while (hasNext) {
    val current = next
    next = as(current - 1)
    if (!done(current)) {
      done.update(current, true)
      count += 1
    } else {
      hasNext = false
    }
  }
  println(count)
}

// 7 11 10 1  7  20 14 2  17 3  2  5  19 20 8  14 18 2  10 10
// 1  2  3 4  5   6  7 8   9 10 11 12 13 14 15 16 17 18 19 20
