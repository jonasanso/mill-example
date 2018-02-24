package first

object Hello {
  def main(args: Array[String]): Unit = {
    println(s"Hi ${greetingTarget(args.headOption)}!")
  }

  def greetingTarget(target: Option[String]) = {
    target.getOrElse("world").capitalize
  }
}