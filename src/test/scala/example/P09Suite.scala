package example

import munit.FunSuite

class P09Suite extends FunSuite {

  test("Pack consecutive duplicates of list elements into sublists. (recursive).") {

    val obtained = P09.packRecursive(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'))
    val expected = List(List('a', 'a', 'a', 'a'), List('b'), List('c', 'c'), List('a', 'a'), List('d'), List('e', 'e', 'e', 'e'))
    assertEquals(obtained, expected)
  }

  test("Pack consecutive duplicates of list elements into sublists. (tail recursive).") {

    val obtained = P09.packRecursive(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e'))
    val expected = List(List('a', 'a', 'a', 'a'), List('b'), List('c', 'c'), List('a', 'a'), List('d'), List('e', 'e', 'e', 'e'))
    assertEquals(obtained, expected)
  }

}
