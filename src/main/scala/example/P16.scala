package example

import example.P16.drop

object P16 {
  def drop[A](n: Int, ls: List[A]): List[A] = {
    def drop[A](i: Int, ls: List[A], acc: List[A]): List[A] = (i, ls) match {
      case (_, Nil) => acc
      case (i, x :: xs) if (i > 1) => drop(i - 1, xs, x :: acc)
      case (_, _ :: xs) => drop(n, xs, acc)

    }
    drop(n, ls, Nil).reverse
  }

  def dropFunctional[A](n: Int, ls: List[A]): List[A] =
    ls.zipWithIndex filter { v => (v._2 + 1) % n != 0 } map { _._1 }
}
