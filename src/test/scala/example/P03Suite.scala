package example

import munit.FunSuite

class P03Suite extends FunSuite{

  test(" Find the Kth element of a list. (Builtin)") {
    val obtained = P03.nthBuiltin(2, List(1, 1, 2, 3, 5, 8))
    val expected = 2
    assertEquals(obtained, expected)
  }

  test(" Find the Kth element of a list.. (Recursive)") {
    val obtained = P03.nthRecursive(2, List(1, 1, 2, 3, 5, 8))
    val expected = 2
    assertEquals(obtained, expected)
  }

}
