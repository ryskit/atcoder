trait Util {
  def lcm(x: Long, y: Long): Long = {
    (x * y) / gcm(x, y)
  }

  def gcm(x: Long, y: Long): Long = {
    if (y == 0) x
    else gcm(y, x % y)
  }

  def fac(n: Long): Long = {
    def loop(n: Long, acc: Long): Long = {
      if (n == 1) acc
      else loop(n - 1, acc * n)
    }
    loop(n, 1)
  }
}
