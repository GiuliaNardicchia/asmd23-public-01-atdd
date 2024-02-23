package googlesearch

import io.cucumber.scala.{EN, ScalaDsl}

class GoogleSearchSteps extends ScalaDsl with EN {

  Given("""a web browser is on the Google page""") { () =>
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.scala.PendingException()
  }
  When("""the search phrase {string} is entered""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.scala.PendingException()
  }
  Then("""results for {string} are shown""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.scala.PendingException()
  }
}