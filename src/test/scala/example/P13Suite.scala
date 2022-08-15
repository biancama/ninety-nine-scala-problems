package example

import munit.FunSuite

class P13Suite extends FunSuite {

  test("Run-length encoding of a list.") {

    val obtained = P13.encodeDirect(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'))
    val expected = List((4,'a'), (1,'b'), (2,'c'), (2,'a'), (1,'d'), (4,'e'))
    assertEquals(obtained, expected)
  }

}
