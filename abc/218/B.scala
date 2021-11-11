package abc218B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val ps = Vector.fill(26)(sc.nextInt)
  val az = "abcdefghijklmnopqrstuvwxyz".toVector
  val ans = ps.foldLeft("") {
    case (con, i) =>
      con + az(i - 1)
  }
  println(ans)
}
