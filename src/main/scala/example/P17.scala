package example



object P17 {
  def splitBuiltin[A](n: Int, l: List[A] ): (List[A], List[A]) = l.splitAt(n)

  def splitRecursiveTail[A](n: Int, l: List[A] ): (List[A], List[A]) = {
    def splitRecursiveTail[A](n: Int, l: List[A], acc: (List[A], List[A])): (List[A], List[A]) = (n, l) match {
      case (_, Nil) => acc
      case (0, ll) =>
        val (l, r) = acc
        splitRecursiveTail(0, Nil, (l, r:::ll))
      case (_, h:: tail) =>
        val (l, r) = acc
        splitRecursiveTail(n - 1, tail, (l :+ h, r))

    }
    splitRecursiveTail[A](n, l, (Nil, Nil))
  }

  def splitRecursive[A](n: Int, l: List[A]): (List[A], List[A]) = (n , l) match {
    case (_, Nil) => (Nil, Nil)
    case (0, ll) => (Nil, ll)
    case (n, h:: tail) =>
      val (l, r) = splitRecursive(n -1, tail)
      (h::l, r)
  }

  def splitFunctional[A](n: Int, l: List[A] ): (List[A], List[A]) = {
    val it = l.foldRight((List[A](), List[A](), l.size - n)) {
     (elem, z) => {
       val (ll, rl, c) = z
       if (c == 0) {
         (elem :: ll, rl, 0)
       } else {
         (ll, elem :: rl, c - 1)
       }
     }
   }
    (it._1, it._2)
  }

}
