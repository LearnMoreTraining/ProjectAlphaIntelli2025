package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserBase;

import java.io.IOException;

public class SalesforceLoginSteps {

    WebDriver driver ; //global variable
    @Given("user navigates to salesforce login page")
    public void loginSalesforce() throws IOException {

        BrowserBase base = new BrowserBase();
        driver =base.getDriver();
    }

    @When("user enter the username {string} and password {string}")
    public void enterUserName(String userName , String password){

        driver.findElement(By.id("username")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
    }

    @And("user clicks on login button")
    public void clickLoginButton(){
        driver.findElement(By.id("Login")).click();
    }

    @Then("user should navigate to home page")
    public void navigateHomePage() {

    }

    @And("lmti")
    public void lmti() {
    }

    @Then("user validate the error message")
    public void validateErrorMessage() {
      String error =  driver.findElement(By.id("error")).getText();
        String expectedError = "check your username and password. If you still can't log in, contact your Salesforce administrator.";
        Assert.assertEquals(expectedError,error);
    }
}
