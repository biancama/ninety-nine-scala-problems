package example

import org.scalatest.BeforeAndAfterAll
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatestplus.scalacheck.ScalaCheckDrivenPropertyChecks
//
trait BaseScalaSpec extends AnyFlatSpec with Matchers with BeforeAndAfterAll with ScalaCheckDrivenPropertyChecks {

}