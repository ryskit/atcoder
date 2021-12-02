package abc056C

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val x = sc.nextInt
  var time = 0
  var position = 0
  while (position < x) {
    time += 1
    position = (time * (time + 1)) / 2
  }
  println(time)
}
