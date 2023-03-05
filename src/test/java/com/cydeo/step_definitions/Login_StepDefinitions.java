package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {
    @When("user enter librarian username")
    public void user_enter_librarian_username() {
        System.out.println("user enter librarian username");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("user enters librarian password");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("user should see the dashboard");
    }

    @When("user enter student username")
    public void user_enter_student_username() {
        System.out.println("user enter student username");
    }
    @When("user enters student password")
    public void user_enters_student_password() {
        System.out.println("user enters student password");
    }
    @Then("student should see the dashboard")
    public void student_should_see_the_dashboard() {
        System.out.println("student should see the dashboard");
    }


    @When("user enter admin username")
    public void user_enter_admin_username() {
        System.out.println("user enter admin username");
    }
    @When("user enters admin password")
    public void user_enters_admin_password() {
        System.out.println("user enters admin password");
    }
    @Then("admin should see the dashboard")
    public void admin_should_see_the_dashboard() {
        System.out.println("admin should see the dashboard");
    }

    @Given("user is on the library login page")
    public void userIsOnTheLibraryLoginPage() {
    }
}
