package example

import munit.FunSuite
import P18._
class P18Suite extends FunSuite {

  test("Extract a slice from a list.") {

    val obtained = sliceBuiltin(3, 7, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
    val expected = List('d', 'e', 'f', 'g')
    assertEquals(obtained, expected)
  }

  test("Extract a slice from a list.(Recursive)") {

    val obtained = sliceRecursive(3, 7, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
    val expected = List('d', 'e', 'f', 'g')
    assertEquals(obtained, expected)
  }
  test("Extract a slice from a list.(TailRecursive)") {

    val obtained = sliceTailRecursive(3, 7, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
    val expected = List('d', 'e', 'f', 'g')
    assertEquals(obtained, expected)
  }

  test("Extract a slice from a list.(functional)") {

    val obtained = sliceFunctional(3, 7, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
    val expected = List('d', 'e', 'f', 'g')
    assertEquals(obtained, expected)
  }

}
