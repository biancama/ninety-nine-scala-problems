package example

object P14 {
  def duplicate[A](ls: List[A]): List[A] = ls flatMap { ch => List(ch, ch)}
}
