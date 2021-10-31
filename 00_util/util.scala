object Main extends App {
  def lcm(x: Long, y: Long): Long = {
    (x * y) / gcm(x, y)
  }

  def gcm(x: Long, y: Long): Long = {
    if (y == 0) x
    else gcm(y, x % y)
  }
}
