package stepdefinition;

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

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class AmazonSteps {

    private WebDriver driver ;

    @Given("user navigates to the webpage")
    public void navigateTo() throws IOException {
        BrowserBase b = new BrowserBase();
        this.driver = b.getDriver();
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
        AmazonHomePage homePage = new AmazonHomePage(driver);
        homePage.clickBabyWishList();
    }

    @Then("validate the navigation")
    public void validateTheNavigation() {

        Assert.assertEquals("Baby Wishlist", driver.findElement(By.xpath("//h2[text()='Baby Wishlist']")).getText());

    }

    @When("user search for product and select one product from the search result")
    public void userSearchForProductAndSelectOneProductFromTheSearchResult() {

        AmazonHomePage a = new AmazonHomePage(driver);
         a.enterProductName("amazoninputs",1,0);
         a.clickSearchIcon();
        AmazonSearchResultPage resultPage = new AmazonSearchResultPage(driver);
        resultPage.selectProduct();

    }

    @When("user do the drag and drop")
    public void userDoTheDragAndDrop() {

        JqueryPage jqueryPage = new JqueryPage(driver);
        jqueryPage.dragAndDrop();
    }

    @Then("verify the status")
    public void verifyTheStatus() {

    }

    @When("user clicks on button")
    public void userClicksOnButton() {
        JqueryPage j = new JqueryPage(driver);
        Assert.assertTrue( j.checkWait());

    }
}
