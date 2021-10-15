package C096

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val h, w = sc.nextInt
  val canvas = Vector.fill(h)(sc.next)
  val ds = Vector((0, -1), (0, 1), (-1, 0), (1, 0))
  val answer = canvas.zipWithIndex.foldLeft(true) {
    case (ok, (row, i)) =>
      if (ok) {
        (0 until w).foldLeft(true) {
          case (ok2, c) =>
            if (ok2 && row(c) == '#') {
              val a = ds.foldLeft(false) {
                case (ok3, d) =>
                  if (
                    canvas.isDefinedAt(i + d._1) && canvas(i + d._1)
                      .isDefinedAt(c + d._2)
                  ) {
                    if (canvas(i + d._1)(c + d._2) == '#') true
                    else ok3
                  } else ok3
              }
              if (!a) false
              else ok2
            } else {
              ok2
            }
        }
      } else ok
  }
  println(if (answer) "Yes" else "No")
}
