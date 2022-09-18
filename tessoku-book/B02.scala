package teppan_bookB02

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val a = sc.nextInt
  val b = sc.nextInt
  var result = "No"
  for (i <- a to b) if (100 % i == 0) result = "Yes"
  println(result)
}
