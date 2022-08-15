package example

object P11 {
  def encodeModified[A](ls: List[A]): List[Any] = {
    val packed = P09.packTailRecursive(ls)
    packed map( l => if (l.length > 1) (l.length, l.head) else l.head)
  }
}
