package example

object P04 {
  def lengthBuiltin[A](l: List[A]): Int = l.length

  def lengthRecursive[A](l: List[A]): Int = {
    def lengthRecursive[A](l: List[A], acc: Int): Int = l match {
      case Nil => acc
      case _ :: xs => lengthRecursive(xs, acc + 1)
    }
    lengthRecursive(l, 0)
  }

}
