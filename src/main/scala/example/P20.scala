package example

object P20 {
  def removeAt[A](n: Int, l: List[A]): (List[A], A) = l.splitAt(n) match {
    case (Nil, _) if n < 0 => throw new NoSuchElementException
    case (pre, h::post) => (pre:::post, h)
    case (_, Nil) => throw new NoSuchElementException
  }


}

