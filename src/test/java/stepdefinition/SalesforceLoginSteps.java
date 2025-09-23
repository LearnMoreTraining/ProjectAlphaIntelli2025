package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.SalesforceLogin;
import utility.BrowserBase;

import java.io.IOException;

public class SalesforceLoginSteps {

    WebDriver driver ;
    SalesforceLogin s;//global variable
    @Given("user navigates to salesforce login page")
    public void loginSalesforce() throws IOException {

        BrowserBase base = new BrowserBase();
        driver =base.getDriver();
    }

    @When("user enter the username {string} and password {string}")
    public void enterUserName(String userName , String password){

         s = new SalesforceLogin(driver);
        s.enterUserName(userName);
        s.enterPassword(password);
    }

    @And("user clicks on login button")
    public void clickLoginButton(){

        s.clickLoginButton();
    }

    @Then("user should navigate to home page")
    public void navigateHomePage() {

    }

    @And("lmti")
    public void lmti() {
    }

    @Then("user validate the error message")
    public void validateErrorMessage() {

        String expected ="Error: Please check your username and password. If you still can't log in, contact your Salesforce administrator";
        Assert.assertEquals(expected, s.getErrorMessage());
    }
}
