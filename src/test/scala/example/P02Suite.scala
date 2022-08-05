package example

import munit.FunSuite

class P02Suite extends FunSuite{

  test(" Find the last but one element of a list. (Builtin)") {
    val obtained = P02.penultimateBuiltin(List(1, 1, 2, 3, 5, 8))
    val expected = 5
    assertEquals(obtained, expected)
  }

  test(" Find the last but one element of a list. (Recursive)") {
    val obtained = P02.penultimateRecursive(List(1, 1, 2, 3, 5, 8))
    val expected = 5
    assertEquals(obtained, expected)
  }

}
