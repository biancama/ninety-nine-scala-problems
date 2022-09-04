package example

object P18 {
  def sliceBuiltin[A](from: Int, until: Int, l: List[A]): List[A] = l.slice(from, until)

  def sliceRecursive[A](from: Int, until: Int, l: List[A]): List[A] = (from, l) match
    case (_, List()) => List()
    case (n, _) if n >= until => List()
    case (0, x::xs) => x::sliceRecursive(0, until - 1, xs)
    case (_, _::xs) => sliceRecursive(from - 1, until -1, xs)

  def sliceTailRecursive[A](from: Int, until: Int, l: List[A]): List[A] = {

    def sliceTailRecursive[A](from: Int, until: Int, l: List[A], acc: List[A]): List[A] = (from, l) match
      case (_, List()) => acc
      case (n, _) if n >= until => acc
      case (0, x :: xs) => sliceTailRecursive(0, until - 1, xs, x :: acc)
      case (n, x :: xs) => sliceTailRecursive(from - 1, until - 1, xs, acc)

    sliceTailRecursive(from, until, l, List()).reverse
  }

  def sliceFunctional[A](from: Int, until: Int, l: List[A]): List[A] = l.drop(from).take(until - from)

}

