package example

import munit.FunSuite

class P04Suite extends FunSuite{

  test("Find the number of elements of a list. (Builtin)") {
    val obtained = P04.lengthBuiltin(List(1, 1, 2, 3, 5, 8))
    val expected = 6
    assertEquals(obtained, expected)
  }

  test("Find the number of elements of a list. (Recursive)") {
    val obtained = P04.lengthRecursive(List(1, 1, 2, 3, 5, 8))
    val expected = 6
    assertEquals(obtained, expected)
  }

}
