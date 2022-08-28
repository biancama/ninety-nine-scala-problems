package example

import munit.FunSuite

class P16Suite extends FunSuite {

  test("Drop every Nth element from a list.") {

    val obtained = P16.drop(3, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
    val expected = List('a', 'b', 'd', 'e', 'g', 'h', 'j', 'k')
    assertEquals(obtained, expected)
  }

}
