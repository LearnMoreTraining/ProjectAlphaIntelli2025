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
import utility.PageObjectManager;
import utility.TestContext;

import java.io.IOException;

public class SalesforceLoginSteps {

    TestContext context;
    public SalesforceLoginSteps(TestContext context){
        this.context =context;
    }

    @When("user enter the username {string} and password {string}")
    public void enterUserName(String userName , String password){
        //  PageObjectManager pom = new PageObjectManager(driver);
      //   s = new SalesforceLogin(driver);
        //  s.enterUserName(userName);
        // s.enterPassword(password);
      //  pom.getSalesforceLogin().enterUserName(userName);
      //  pom.getSalesforceLogin().enterPassword(password);

//        context.pom.getSalesforceLogin().enterUserName(userName);
//        context.pom.getSalesforceLogin().enterPassword(password);

        context.pom.getSalesforceLogin().enterUserName(userName).enterPassword(password).clickLoginButton();
    }


    @Then("user should navigate to home page")
    public void navigateHomePage() {
            context.pom.getWikiPage().fromDropdown("MAA");
    }

    @And("lmti")
    public void lmti() {
    }


}
