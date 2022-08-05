package example

object P05 {
  def reverseBuiltin[A](l: List[A]): List[A] = l.reverse

  def reverseRecursive[A](l: List[A]): List[A] = l match {
    case Nil => Nil
    case x::xs => reverseRecursive(xs):::List(x)
  }

  def reverseTailRecursive[A](l: List[A]): List[A] = {
    def reverseTailRecursive[A](l: List[A], acc: List[A]) : List[A] = l match {
      case Nil => acc
      case x::xs => reverseTailRecursive(xs, x::acc)
    }
    reverseTailRecursive(l, Nil)
  }

  def reverseFunctional[A](l: List[A]): List[A] = l.foldLeft(List[A]()){ (l, a) => a :: l}
}
