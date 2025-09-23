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
import org.openqa.selenium.support.ui.Select;
import pageobjects.AmazonHomePage;
import utility.BrowserBase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AmazonSteps {

    WebDriver driver ;

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
}
