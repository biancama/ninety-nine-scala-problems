package example

import munit.FunSuite

class P06Suite extends FunSuite{

  test("Find out whether a list is a palindrome 01.") {
    val obtained = P06.isPalindrome(List(1, 2, 3, 2, 1))
    val expected = true
    assertEquals(obtained, expected)

  }

  test("Find out whether a list is a palindrome 02.") {
    val obtained = P06.isPalindrome(List(1, 2, 3, 3,  2, 1))
    val expected = true
    assertEquals(obtained, expected)

  }

  test("Find out whether a list is a palindrome 03.") {
    val obtained = P06.isPalindrome(List(1, 2, 3, 1, 1))
    val expected = false
    assertEquals(obtained, expected)

  }


  test("Find out whether a list is a palindrome 01. (Builtin)") {
    val obtained = P06.isPalindromeBuiltin(List(1, 2, 3, 2, 1))
    val expected = true
    assertEquals(obtained, expected)

  }

  test("Find out whether a list is a palindrome 02. (Builtin)") {
    val obtained = P06.isPalindromeBuiltin(List(1, 2, 3, 3,  2, 1))
    val expected = true
    assertEquals(obtained, expected)

  }

  test("Find out whether a list is a palindrome 03. (Builtin)") {
    val obtained = P06.isPalindromeBuiltin(List(1, 2, 3, 1, 1))
    val expected = false
    assertEquals(obtained, expected)

  }


}
