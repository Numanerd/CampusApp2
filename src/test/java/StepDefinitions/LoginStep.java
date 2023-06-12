package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStep {

    DialogContent dc = new DialogContent();

    @Given("Navigate to Campus Website")
    public void navigateToCampus() {
        GWD.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter username and password")
    public void enterUsernameAndPassword() {

        dc.clickFunction(dc.username);
        dc.sendKeysFunction(dc.username, "teacher_5");
        dc.clickFunction(dc.password);
        dc.sendKeysFunction(dc.password, "T12345");
    }

    @Then("Click login on button")
    public void clickLoginOnButton() {

        dc.clickFunction(dc.loginButton);

    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {

        dc.verifyContainsTextFunction(dc.AssertionText, "Techno Study Intern School");

    }
}


