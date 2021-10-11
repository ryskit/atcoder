package B075

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val h, w = sc.nextInt
  val ss = Vector.fill(h)(sc.next().toArray)
  val directions =
    Seq((-1, -1), (-1, 0), (-1, 1), (0, -1), (0, 1), (1, -1), (1, 0), (1, 1))

  for {
    row <- 0 until h
    column <- 0 until w
    if ss(row)(column) == '.'
  } {
    val cnt = directions.count {
      case (x, y) =>
        val updatedRow = row + x
        val updatedColumn = column + y
        if (
          0 <= updatedRow && updatedRow < h && 0 <= updatedColumn && updatedColumn < w
        ) {
          val updatedTarget = ss(updatedRow)(updatedColumn)
          updatedTarget == '#'
        } else {
          false
        }
    }
    ss(row)(column) = cnt.toString.head
  }

  for {
    s <- ss
  } {
    println(s.mkString)
  }
}
