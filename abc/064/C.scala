package C064

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val as = Vector.fill(n)(sc.nextInt)
  val allRankColors = as.map(calcRateColor)
  val colorSize = allRankColors.filter(_ < 8).toSet.size
  val over3200Count = allRankColors.count(_ == 8)
  val min = colorSize.max(1)
  val max = colorSize + over3200Count
  println(s"$min $max")

  def calcRateColor(score: Int): Int = {
    if (3200 <= score) 8
    else score / 400
  }

}
