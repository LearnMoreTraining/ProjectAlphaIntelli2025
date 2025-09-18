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
import utility.BrowserBase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AmazonSteps {

    WebDriver driver ;
    List<String> categoryValues;
    @Given("user navigates to the webpage")
    public void navigateTo() throws IOException {
        BrowserBase b = new BrowserBase();
        driver = b.getDriver();
    }

    @When("user extract the dropdown value")
    public void userExtractTheDropdownValue() {

//        WebElement dropdownElement = driver.findElement(By.id("searchDropdownBox"));
//       int size = dropdownElement.findElements(By.tagName("option")).size();
//        System.out.println(size);
        categoryValues = new ArrayList<String>();
        int size =driver.findElements(By.xpath("//select[@id='searchDropdownBox']/child::option")).size();
        System.out.println(size);
        for(int i =0 ; i < size  ; i++){

           String val= driver.findElements(By.xpath("//select[@id='searchDropdownBox']/child::option")).get(i).getText();
           categoryValues.add(val);
        }

        System.out.println(categoryValues);

    }

    @And("user select the specific value")
    public void userSelectTheSpecificValue() {

        Select s = new Select(driver.findElement(By.id("searchDropdownBox")));
      //  s.selectByIndex(3);
      //  s.selectByVisibleText("Amazon Fresh");
        s.selectByValue("search-alias=baby");
    }

    @Then("validate the dropdown values")
    public void validateTheDropdownValues() {
        boolean flag = false ;
        for(String value:categoryValues){

            if(value.equals("Books")){
                //Assert
                flag = true ;
                break;
            }
        }

        Assert.assertTrue(flag);
    }

    @When("user clicks on baby wish list")
    public void userClicksOnBabyWishList() {
        WebElement element = driver.findElement(By.id("nav-link-accountList"));
            Actions a = new Actions(driver);
            a.clickAndHold(element).build().perform();
        driver.findElement(By.linkText("Baby Wishlist")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
          //  driver.findElement(By.linkText("Baby Wishlist")).click();
          //  driver.findElement(By.partialLinkText("by Wishl")).click();
       String parentWindow = driver.getWindowHandle();
       Set<String> winProperties = driver.getWindowHandles();
       String childWindow = null ;
       for(String win:winProperties){

           if(!win.equals(parentWindow)){
               childWindow = win ;
           }
       }

       driver.switchTo().window(childWindow);

    }

    @Then("validate the navigation")
    public void validateTheNavigation() {

        Assert.assertEquals("Baby Wishlist", driver.findElement(By.xpath("//h2[text()='Baby Wishlist']")).getText());
    }
}
