package example

import munit.FunSuite

class P08Suite extends FunSuite {

  test("Flatten a nested list structure (recursive).") {

    val obtained = P08.compressRecursive(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'))
    val expected = List('a', 'b', 'c', 'a', 'd', 'e')
    assertEquals(obtained, expected)
  }
  test("Flatten a nested list structure (tail recursive).") {

    val obtained = P08.compressTailRecursive(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'))
    val expected = List('a', 'b', 'c', 'a', 'd', 'e')
    assertEquals(obtained, expected)
  }

  test("Flatten a nested list structure (tail recursive).") {

    val obtained = P08.compressFunctional(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'))
    val expected = List('a', 'b', 'c', 'a', 'd', 'e')
    assertEquals(obtained, expected)
  }

}
