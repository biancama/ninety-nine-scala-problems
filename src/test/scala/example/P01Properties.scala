package example

import org.scalacheck.Prop.forAll
import org.scalacheck.{Gen, Properties}
import org.scalacheck.Arbitrary.arbitrary
class P01Properties extends BaseScalaSpec {

  "lastRecursive" should "return last element" in {
    forAll(P01Properties.arbitraryIntList, minSuccessful(100)) { (l: List[Int]) =>
      val expectedValue = l(l.size - 1)
      P01.lastRecursive(l) shouldBe expectedValue
    }
  }

}


object P01Properties {
  val arbitraryInts: Gen[Int] = arbitrary[Int]
  val nonZeroInts: Gen[Int] = arbitrary[Int] suchThat (_ != 0)
  val arbitraryIntList: Gen[List[Int]] = arbitrary[List[Int]] suchThat(l => !l.isEmpty)
}
