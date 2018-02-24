import mill._
import mill.scalalib._
import ammonite.ops._
import ammonite.ops.ImplicitWd._

object first extends ScalaModule {
  def scalaVersion = "2.12.4"

  def gitHead = T.input{ %%("git", "rev-parse", "HEAD").out.string }

  object test extends Tests {
    def ivyDeps = Agg(ivy"org.specs2::specs2:2.5")
    def testFramework = "org.specs2.runner.Specs2Framework"
  }
}