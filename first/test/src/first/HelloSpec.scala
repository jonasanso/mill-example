package first

import org.specs2.mutable._

class HelloSpec extends Specification {

  "greeting target" should {
    "be capitalized" in {
      Hello.greetingTarget(Some("joe")) ==== "Joe"
    }
    "default to world" in {
      Hello.greetingTarget(None) ==== "World"
    }
  }
}
