package abc214A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  println(n match {
    case nx if nx <= 125 => 4
    case nx if nx <= 211 => 6
    case nx if nx <= 214 => 8
  })
}
