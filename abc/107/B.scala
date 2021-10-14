package B107

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val h, w = sc.nextInt
  val areas = Vector.fill(h)(sc.next)
  val skipRows = areas.foldLeft(Vector.empty[Boolean]) {
    case (acc, row) =>
      if (row == "." * w) acc :+ true
      else acc :+ false
  }
  val skipColumns = (0 until w).foldLeft(Vector.empty[Boolean]) {
    case (acc, column) =>
      val out = (0 until h).foldLeft("") {
        case (s, i) => s + areas(i)(column)
      }
      if (out == "." * h) acc :+ true
      else acc :+ false
  }
  for {
    hi <- 0 until h
    wi <- 0 until w
  } {
    if (!skipRows(hi)) {
      if (!skipColumns(wi)) {
        if (wi == w - 1) {
          println(areas(hi)(wi))
        } else {
          print(areas(hi)(wi))
        }
      } else {
        if (wi == w - 1) {
          println("")
        }
      }
    }
  }
}
