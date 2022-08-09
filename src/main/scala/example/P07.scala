package example

object P07 {
  def flatten[A](l: List[Any]): List[A] = l flatMap {
    case xs: List[_] => flatten(xs)
    case e: A => List(e)
  }

}
