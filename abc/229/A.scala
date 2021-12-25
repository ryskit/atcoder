package abc229A

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val s1 = sc.next
  val s2 = sc.next
  val ok = "##";
  val ans =
    if (
      s1 == ok || s2 == ok || s1(0).toString + s2(0).toString == ok || s1(
        1
      ).toString + s2(1).toString == ok
    ) "Yes"
    else "No"

  println(ans)
}
