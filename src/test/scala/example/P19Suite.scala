package example

import example.P19.*
import munit.FunSuite

class P19Suite extends FunSuite {

  test("Rotate a list N places to the left. Positive") {

    val obtained = rotateBuiltin(3, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
    val expected = List('d', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'a', 'b', 'c')
    assertEquals(obtained, expected)
  }

  test("Rotate a list N places to the left. Negative") {

    val obtained = rotateBuiltin(-2, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
    val expected = List('j', 'k', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i')
    assertEquals(obtained, expected)
  }


}
