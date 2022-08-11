package example

object P10 {
  def encode[A](ls: List[A]): List[(Int, A)] = {
    val packed = P09.packTailRecursive(ls)
    packed map( l=> (l.length, l.head))
  }
}
