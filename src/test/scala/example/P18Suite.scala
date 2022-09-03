package example

import munit.FunSuite

class P17Suite extends FunSuite {

  test("Split a list into two parts.") {

    val obtained = P17.splitBuiltin(3, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
    val expected = (List('a', 'b', 'c'), List('d', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
    assertEquals(obtained, expected)
  }

  test("Split a list into two parts.(recursive)") {

    val obtained = P17.splitRecursive(3, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
    val expected = (List('a', 'b', 'c'), List('d', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
    assertEquals(obtained, expected)
  }

  test("Split a list into two parts.(recursiveTail)") {

    val obtained = P17.splitRecursiveTail(3, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
    val expected = (List('a', 'b', 'c'), List('d', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
    assertEquals(obtained, expected)
  }

  test("Split a list into two parts.(functional)") {

    val obtained = P17.splitFunctional(3, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
    val expected = (List('a', 'b', 'c'), List('d', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
    assertEquals(obtained, expected)
  }

  test("Split a list into two parts.(functional)") {

    val obtained = P17.splitFunctional(3, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
    val expected = (List('a', 'b', 'c'), List('d', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
    assertEquals(obtained, expected)
  }
}
