package D148

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val a = Seq.fill(n)(sc.nextInt)
  val (target, delCount) = a.foldLeft(1, 0) {
    case ((target, delCount), ai) =>
      if (ai == target)
        (target + 1, delCount)
      else
        (target, delCount + 1)
  }
  if (target != 1) {
    println(delCount)
  } else {
    println(-1)
  }
}
