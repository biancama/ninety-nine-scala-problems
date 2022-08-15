package example

import munit.FunSuite

class P14Suite extends FunSuite {

  test("Duplicate the elements of a list.") {

    val obtained = P14.duplicate(List('a', 'b', 'c', 'c', 'd'))
    val expected = List('a', 'a', 'b', 'b', 'c', 'c', 'c', 'c', 'd', 'd')
    assertEquals(obtained, expected)
  }

}
