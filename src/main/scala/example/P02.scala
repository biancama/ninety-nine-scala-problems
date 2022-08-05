package example

object P02 {
  def penultimateBuiltin[A](l: List[A]): A = l.init.last

  def penultimateRecursive[A](l: List[A]): A = l match {
    case x::_::Nil => x
    case x::xs => penultimateRecursive(xs)
    case _ => throw new NoSuchElementException("List.last")
  }
}
