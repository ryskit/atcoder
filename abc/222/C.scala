package C222

object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val n, m = sc.nextInt
  val as = Array.fill(2 * n)(sc.next)
  var users = (0 until 2 * n)
    .foldLeft(Vector.empty[(Int, Int)]) {
      case (acc, idx) =>
        acc :+ (idx, 0)
    }
    .toArray

  (0 until m).foreach { round =>
    val sortedUsers = sortUsers(users)
    (1 to n).foreach { k =>
      val aIdx = 2 * k - 2
      val bIdx = 2 * k - 1
      val aUser = sortedUsers(2 * k - 2)
      val bUser = sortedUsers(2 * k - 1)
      val win = judge(aUser, bUser, round)
      if (win._1 != -1) {
        val i = if (win._1 == aUser._1) aIdx else bIdx
        val replaced = sortedUsers(i)
        sortedUsers.update(i, (replaced._1, replaced._2 + 1))
      }
    }
    users = sortedUsers
  }

  // row: (user idx, victory count)
  def sortUsers(users: Array[(Int, Int)]): Array[(Int, Int)] = {
    users.sortWith((a, b) =>
      a._2.compare(b._2) match {
        case 0 => a._1.compare(b._1) < 0
        case c => c > 0
      }
    )
  }

  // (user idx, victory count)
  def judge(aUser: (Int, Int), bUser: (Int, Int), round: Int): (Int, Int) = {
    val aHand = as(aUser._1)(round)
    val bHand = as(bUser._1)(round)
    (aHand, bHand) match {
      case (ah, bh) if ah == bh => (-1, -1)
      case ('G', 'C')           => aUser
      case ('C', 'P')           => aUser
      case ('P', 'G')           => aUser
      case _                    => bUser
    }
  }

  sortUsers(users)
    .foreach(x => println(x._1 + 1))
}
