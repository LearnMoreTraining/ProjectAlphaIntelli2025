package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceLoginSteps {

    WebDriver driver ; //global variable
    @Given("user navigates to salesforce login page")
    public void loginSalesforce(){

        driver = new ChromeDriver(); //local variable
        driver.get("https://login.salesforce.com/");
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
        System.out.println(error);
    }
}
