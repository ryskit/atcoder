package abc047B

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val w, h, n = sc.nextInt
  val area: Array[Array[Boolean]] = Array.ofDim(h, w)
  (1 to n).foreach { i =>
    val x, y, a = sc.nextInt
    a match {
      case 1 =>
        (0 until h).foreach { yi =>
          (0 until x).foreach { xi =>
            area(yi)(xi) = true
          }
        }
      case 2 =>
        (0 until h).foreach { yi =>
          (x until w).foreach { xi =>
            area(yi)(xi) = true
          }
        }
      case 3 =>
        (h - y until h).foreach { yi =>
          (0 until w).foreach { xi =>
            area(yi)(xi) = true
          }
        }
      case 4 =>
        (0 until h - y).foreach { yi =>
          (0 until w).foreach { xi =>
            area(yi)(xi) = true
          }
        }
    }
  }
  val ans = area.map(_.count(!_)).sum
  println(ans)
}
