package abc043B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s = sc.next
  val answer = s
    .foldLeft("") {
      case (inputs, c) =>
        if (c == 'B') {
          if (inputs == "") inputs
          else inputs.dropRight(1)
        } else {
          inputs :+ c
        }
    }
  println(answer)
}
