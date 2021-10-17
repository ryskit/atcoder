package abc219A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val x = sc.nextInt
  val oneRankDiff = diff(x)
  println(if (oneRankDiff == -1) "expert" else oneRankDiff)
  def diff(x: Int): Int = {
    x match {
      case xx if 0 <= xx && xx < 40  => 40 - xx
      case xx if 40 <= xx && xx < 70 => 70 - xx
      case xx if 70 <= xx && xx < 90 => 90 - xx
      case _                         => -1
    }
  }
}
