package C079

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val input = sc.next.split("")
  val a = input(0).toInt
  val b = input(1).toInt
  val c = input(2).toInt
  val d = input(3).toInt
  val ops = for {
    o1 <- 0 to 1
    o2 <- 0 to 1
    o3 <- 0 to 1
  } yield (o1, o2, o3)
  val opss = Vector("+", "-")
  val answer = ops.foldLeft("") {
    case (s, (op1, op2, op3)) =>
      val r1 = if (op1 == 0) a + b else a - b
      val r2 = if (op2 == 0) r1 + c else r1 - c
      val r3 = if (op3 == 0) r2 + d else r2 - d
      if (r3 == 7) s"$a${opss(op1)}$b${opss(op2)}$c${opss(op3)}$d=7"
      else s
  }
  println(answer)
}
