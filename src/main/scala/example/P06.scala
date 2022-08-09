package example

object P06 {
  def isPalindrome[A](l: List[A]): Boolean = {
    def areExtremeEquals[A](l: List[A]): Boolean = if (l.isEmpty) true else l.head == l.last

    if (l.isEmpty) true
    else if (areExtremeEquals(l)) {
      val innerIsPalindrome = isPalindrome(l.slice(1, l.length - 1) )
      innerIsPalindrome
    } else false
  }
  def isPalindromeBuiltin[A](l: List[A]): Boolean = l == l.reverse


}
