package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.BrowserBase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AmazonSteps {

    WebDriver driver ;
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
        List<String> categoryValues = new ArrayList<String>();
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

    }

    @Then("validate the dropdown values")
    public void validateTheDropdownValues() {

    }
}
