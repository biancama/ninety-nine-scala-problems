package example

object P01 {
  def lastBuiltin[A](l: List[A]): A = l.last

  def lastRecursive[A](l: List[A]): A = l match {
    case x::Nil => x
    case x::xs => lastRecursive(xs)
    case _ => throw new NoSuchElementException("List.last")
  }
}
