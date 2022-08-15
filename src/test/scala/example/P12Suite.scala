package example

import munit.FunSuite

class P12Suite extends FunSuite {

  test("Decode a run-length encoded list.") {

    val obtained = P12.decode(List((4,'a'), (1, 'b'), (2,'c'), (2,'a'), (1, 'd'), (4,'e')))
    val expected = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    assertEquals(obtained, expected)
  }

}
