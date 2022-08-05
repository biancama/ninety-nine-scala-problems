package example

import munit.FunSuite

class P01Suite extends FunSuite{

  test("Find the last element of a list") {
    val obtained = P01.lastBuiltin(List(1, 1, 2, 3, 5, 8))
    val expected = 8
    assertEquals(obtained, expected)
  }

  test("Find the last element of a list") {
    val obtained = P01.lastRecursive(List(1, 1, 2, 3, 5, 8))
    val expected = 8
    assertEquals(obtained, expected)
  }

}
