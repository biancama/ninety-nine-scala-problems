package example

import munit.FunSuite

class P05Suite extends FunSuite{

  test("Reverse a list. (Builtin)") {
    val obtained = P05.reverseBuiltin(List(1, 1, 2, 3, 5, 8))
    val expected = List(8, 5, 3, 2, 1, 1)
    assertEquals(obtained, expected)
  }

  test("Reverse a list. (Recursive)") {
    val obtained = P05.reverseRecursive(List(1, 1, 2, 3, 5, 8))
    val expected = List(8, 5, 3, 2, 1, 1)
    assertEquals(obtained, expected)
  }
  test("Reverse a list. (TailRecursive)") {
    val obtained = P05.reverseTailRecursive(List(1, 1, 2, 3, 5, 8))
    val expected = List(8, 5, 3, 2, 1, 1)
    assertEquals(obtained, expected)
  }

  test("Reverse a list. (Functional)") {
    val obtained = P05.reverseFunctional(List(1, 1, 2, 3, 5, 8))
    val expected = List(8, 5, 3, 2, 1, 1)
    assertEquals(obtained, expected)
  }


}
