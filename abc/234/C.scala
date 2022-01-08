package abc234C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val k = BigInt(sc.nextLong)
  // 2 20 22 200 202 220 222 2000 2002 2020 2022 2200 2202 2220 2222
  // 1  2  3   4   5  6   7    8    9   10   11   12    13  14    15
  val str = k.toString(2).foldLeft(Vector.empty[String]) {
    case (str, x) =>
      str :+ (x match {
        case '0' => "0"
        case '1' => "2"
      })
  }
  println(str.mkString)
}
