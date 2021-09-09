package C158

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val a, b = sc.nextDouble

  val answer = (1 to 1251).foldLeft(Int.MaxValue) {
    case (min, tax) =>
      val tax8 = (tax.toDouble * 0.08).floor.toInt
      val tax10 = (tax.toDouble * 0.1).floor.toInt
      if (tax8 == a && tax10 == b) math.min(min, tax)
      else min
  }
  println(if (Int.MaxValue == answer) -1 else answer)
}
