package teppan_bookA04

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  println("%10s".format(n.toBinaryString).replace(" ", "0"))
}
