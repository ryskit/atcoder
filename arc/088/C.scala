package C088

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val x, y = sc.nextLong
  var a = x
  var answer = 0
  while (a <= y) {
    answer += 1
    a = a * 2
  }
  println(answer)
}
