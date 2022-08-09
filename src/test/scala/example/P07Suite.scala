package example

import munit.FunSuite

class P07Suite extends FunSuite {

  test("Flatten a nested list structure.") {

    val obtained:List[Int] = P07.flatten(List(List(1, 1), 2, List(3, List(5, 8))))

    val expected = List(1, 1, 2, 3, 5, 8)

    assertEquals(obtained, expected)


  }


}
