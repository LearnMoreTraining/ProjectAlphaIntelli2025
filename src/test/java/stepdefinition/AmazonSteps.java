package stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.AmazonHomePage;
import pageobjects.AmazonSearchResultPage;
import pageobjects.JqueryPage;
import utility.BrowserBase;
import utility.PageObjectManager;
import utility.TestContext;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class AmazonSteps {
    TestContext context ;
      public AmazonSteps(TestContext context){
          this.context = context;
      }

    @When("user extract the dropdown value")
    public void userExtractTheDropdownValue() {



    }

    @And("user select the specific value")
    public void userSelectTheSpecificValue() {


    }

    @Then("validate the dropdown values")
    public void validateTheDropdownValues() {
        boolean flag = false ;
//        for(String value:categoryValues){
//
//            if(value.equals("Books")){
//                //Assert
//                flag = true ;
//                break;
//            }
//        }

        Assert.assertTrue(flag);
    }

    @When("user clicks on baby wish list")
    public void userClicksOnBabyWishList() {
        context.pom.getAmazonHomePage().clickBabyWishList();
    }

    @Then("validate the navigation")
    public void validateTheNavigation() {

        Assert.assertEquals("Baby Wishlist", context.driver.findElement(By.xpath("//h2[text()='Baby Wishlist']")).getText());

    }

    @When("user search for product and select one product from the search result")
    public void userSearchForProductAndSelectOneProductFromTheSearchResult() {

        context.pom.getAmazonHomePage().enterProductName("amazoninputs",1,0);
         context.pom.getAmazonHomePage().clickSearchIcon();
       context.pom.getSearchResultPage().selectProduct();

    }

    @When("user do the drag and drop")
    public void userDoTheDragAndDrop() {
        context.pom.getJqueryPage().dragAndDrop();
    }

    @Then("verify the status")
    public void verifyTheStatus() {

    }

    @When("user clicks on button")
    public void userClicksOnButton() {
        Assert.assertTrue( context.pom.getJqueryPage().checkWait());

    }


    @And("user clicks on login button")
    public void clickLoginButton(){
       context.pom.getSalesforceLogin().clickLoginButton();
      //  s.clickLoginButton();
    }

    @Then("user validate the error message")
    public void validateErrorMessage() {

        String expected ="Error: Please check your username and password. If you still can't log in, contact your Salesforce administrator";
        Assert.assertEquals(expected, context.pom.getSalesforceLogin().getErrorMessage());
    }

    @Given("user extracts the shareholder and shareholding value")
    public void userExtractsTheShareholderAndShareholdingValue() {

          context.pom.getWikiPage().getShareHolder();
          context.pom.getWikiPage().getShareHolding();
    }

    @Then("validate the mapping")
    public void validateTheMapping() {

        System.out.println(context.pom.getWikiPage().getShareHolderHoldingValue());

        Assert.assertEquals("101.00%",context.pom.getWikiPage().getShareHolderHoldingValue().get("Total"));
    }

}
