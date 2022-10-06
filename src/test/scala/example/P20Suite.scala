package example

import example.P20.*
import munit.FunSuite

class P20Suite extends FunSuite {

  test("Remove the Kth element from a list.01") {

    val obtained = removeAt(1, List('a', 'b', 'c', 'd'))
    val expected = (List('a', 'c', 'd'),'b')
    assertEquals(obtained, expected)
  }

  test("Remove the Kth element from a list.02") {

    val obtained = removeAt(3, List('a', 'b', 'c', 'd'))
    val expected = (List('a', 'b', 'c'), 'd')
    assertEquals(obtained, expected)
  }


}
