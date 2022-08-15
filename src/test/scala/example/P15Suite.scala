package example

import munit.FunSuite

class P15Suite extends FunSuite {

  test(" Duplicate the elements of a list a given number of times.") {

    val obtained = P15.duplicateN(3, List('a', 'b', 'c', 'c', 'd'))
    val expected = List('a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'c', 'c', 'c', 'c', 'd', 'd', 'd')
    assertEquals(obtained, expected)
  }

}
