package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Calculator_StepDef {

    int actualResult;
    @Given("calculator is open")
    public void calculator_is_open() {
        System.out.println("This is from Given");
    }
    @When("I add {int} with {int}")
    public void ı_add_with(int int1, int int2) {
        System.out.println("When I add " + int1 + " with " + int2);
        actualResult = int1 + int2;
    }
    @Then("I should get {int}")
    public void ı_should_get(int expectedResult) {
        System.out.println("Then I should get " + expectedResult);
        Assert.assertEquals(actualResult,expectedResult);
    }

}
