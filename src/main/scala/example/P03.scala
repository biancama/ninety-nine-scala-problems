package example

object P03 {
  def nthBuiltin[A](n: Int, l: List[A]): A = l(n)

  def nthRecursive[A](n: Int, l: List[A]): A = (n, l) match {
    case (0, x::_) => x
    case (_, x::xs) => nthRecursive(n -1, xs)
    case _ => throw new NoSuchElementException("n element not present")
  }
}
