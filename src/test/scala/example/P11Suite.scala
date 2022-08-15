package example

import munit.FunSuite

class P11Suite extends FunSuite {

  test("Run-length encoding of a list.") {

    val obtained = P11.encodeModified(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'))
    val expected = List((4,'a'), 'b', (2,'c'), (2,'a'), 'd', (4,'e'))
    assertEquals(obtained, expected)
  }

}
