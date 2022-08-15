package example

object P15 {
  def duplicateN[A](n: Int, ls: List[A]): List[A] = ls flatMap {
    ch => List.unfold(n)(i => if (i > 0) Some((ch, i - 1)) else None)
//    ch => List.unfold(n) {
//      case i if (i > 0) => Some ((ch, i - 1))
//      case _ =>  None
//    }
  }

}
