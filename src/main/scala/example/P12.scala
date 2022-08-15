package example

object P12 {
  def decode[A](ls: List[(Int, A)]): List[A] = ls flatMap {
    case(index, ch) => List().padTo(index, ch)
  }
}
