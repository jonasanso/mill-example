package first

import org.specs2.mutable._

class MainTest extends Specification {

  "text" should {
    "be hi" in {
      Main.text ==== "Hi"
    }
  }
}
