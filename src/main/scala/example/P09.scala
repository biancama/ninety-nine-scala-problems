package example

object P09 {
  def packRecursive[A](ls: List[A]): List[List[A]] = ls match {
    case Nil => Nil
    case x::_ =>
      val (take, drop) = ls.span(_ == x)
      take::packRecursive(drop)
  }
  def packTailRecursive[A](ls: List[A]): List[List[A]] = {
    def packTailRecursive[A](ls: List[A], acc: List[List[A]]): List[List[A]] = ls match {
      case Nil => acc
      case x::_ =>
        val (take, drop) = ls.span(_ == x)
        packTailRecursive(drop, take::acc)
    }
    packTailRecursive(ls, Nil).reverse
  }

}
