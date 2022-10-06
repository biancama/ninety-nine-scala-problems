package example

object P19 {
  def rotateBuiltin[A](n: Int, l: List[A]) = {
    val k = if (n > 0) n % l.size else (l.size + n) % l.size
    val (left, right) = l.splitAt(k)
    right ::: left
  }

}

