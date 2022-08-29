package example

import org.scalacheck.Arbitrary.arbitrary
import org.scalacheck.Prop.forAll
import org.scalacheck.rng.Seed
import org.scalacheck.{Gen, Properties}
class P17Properties extends BaseScalaSpec {

  "splitRecursiveTail" should "return pair of split list" in {
    forAll(P17Properties.arbitraryIntList, P17Properties.greaterOrEqToZeroInts, minSuccessful(100)) { (l: List[Int], n: Int) =>
      val min = Math.min(n, l.length - 1)
      val expectedValue = l.splitAt(min)
      P17.splitRecursiveTail(min, l) shouldBe expectedValue
    }
  }

  "splitFunctional" should "return pair of split list" in {
    forAll(P17Properties.arbitraryIntList, P17Properties.greaterOrEqToZeroInts, minSuccessful(100)) { (l: List[Int], n: Int) =>
      val min = Math.min(n, l.length - 1)
      val expectedValue = l.splitAt(min)
      P17.splitFunctional(min, l) shouldBe expectedValue
    }
  }

}


object P17Properties {
  val greaterOrEqToZeroInts: Gen[Int] = arbitrary[Int] suchThat (_ >= 0)
  val arbitraryIntList: Gen[List[Int]] = arbitrary[List[Int]]
}
