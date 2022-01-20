package abc206A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val priceInVat = n * 1.08d
  val ans = priceInVat match {
    case p if p.toInt < 206  => "Yay!"
    case p if p.toInt == 206 => "so-so"
    case _                   => ":("
  }
  println(ans)
}
