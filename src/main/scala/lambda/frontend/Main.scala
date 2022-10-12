package lambda.frontend

import xyz.frontend.Site.initSite
import lambda.syntax.{Parser, Program}
import lambda.frontend.XyzConfig
import lambda.syntax.Program.Term

/** Main function called by ScalaJS' compiled javascript when loading. */
object Main {
  def main(args: Array[String]):Unit =
    initSite[Term](XyzConfig)
}