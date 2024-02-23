package calculator;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.AfterAll;

public class CalculatorSteps {
    private int res = 0;
    private Calculator calculator;

    @Given("I have a Calculator")
    public void iHaveACalculator() {
        this.calculator = new Calculator();
    }

    private void checkResult(int arg0) {
        if (arg0 != this.calculator.getResult()) { // or using Junit's asserts
            throw new IllegalStateException();
        }
    }
    private void enterTwoNumbers(int arg0, int arg1) {
        this.calculator.enter(arg0);
        this.calculator.enter(arg1);
    }

    @When("I add {int} and {int}")
    public void iAddAnd(int arg0, int arg1) {
        enterTwoNumbers(arg0, arg1);
    }

    @Then("the sum should be {int}")
    public void theSumShouldBe(int arg0) {
        this.calculator.add();
        checkResult(arg0);
    }

    @When("I subtract {int} and {int}")
    public void iSubtractAnd(int arg0, int arg1) {
        enterTwoNumbers(arg0, arg1);
    }

    @Then("the difference should be {int}")
    public void theDifferenceShouldBe(int arg0) {
        this.calculator.subtract();
        checkResult(arg0);
    }

    @When("I multiply {int} and {int}")
    public void iMultiplyAnd(int arg0, int arg1) {
        enterTwoNumbers(arg0, arg1);
    }

    @Then("the product should be {int}")
    public void theProductShouldBe(int arg0) {
        this.calculator.multiply();
        checkResult(arg0);
    }

}
