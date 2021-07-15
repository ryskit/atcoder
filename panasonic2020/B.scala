package panasonic2020B

import java.util.Scanner

object Main extends App {
  val scanner = new Scanner(System.in)
  val H = scanner.nextLong
  val W = scanner.nextLong
  val wa = (W / 2) * (H / 2)
  val ha = (W % 2 + W / 2) * (H / 2 + H % 2)
  println {
    if (H == 1 || W == 1) 1
    else wa + ha
  }
}
