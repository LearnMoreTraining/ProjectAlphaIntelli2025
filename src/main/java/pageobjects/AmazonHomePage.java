package pageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utility.ExcelHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AmazonHomePage {

   private WebDriver driver ; //null

    public AmazonHomePage(WebDriver driver){

        this.driver = driver;
    }


    public void enterProductName(String productName){

    //    driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);

        driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys(productName);
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(productName);
        driver.findElement(By.className("nav-input nav-progressive-attribute"));
        driver.findElement(By.cssSelector(".nav-input.nav-progressive-attribute")).sendKeys(productName);
    }

    public AmazonHomePage enterProductName(String sheetname, int row , int col){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(ExcelHandler.getExcelData(sheetname,row,col));
        return this;
    }

    public void clickSearchIcon(){
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    public List<String> extractDropdownValues(){
        List<String> categoryValues;
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
        return categoryValues;
    }

    public void clickBabyWishList(){
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

    public void handleCategoryDropdownWithIndex(int a){


        Select s = new Select(driver.findElement(By.id("searchDropdownBox")));
         s.selectByIndex(a);
        //  s.selectByVisibleText("Amazon Fresh");
       // s.selectByValue("search-alias=baby");
    }

    public void handleWithVisibleText(String text){
        Select s = new Select(driver.findElement(By.id("searchDropdownBox")));
        s.selectByVisibleText(text);
        // s.selectByValue("search-alias=baby");
    }

    public void scroll(){

        try {

            Actions a = new Actions(driver);
            a.scrollToElement(driver.findElement(By.xpath("//*[text()='About Amazon']"))).build().perform();

        } catch (ElementNotInteractableException e) {

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].ScrollIntoView",driver.findElement(By.xpath("//*[text()='About Amazon']")));
            js.executeScript("window.scrollBy(0,700)","");
        }
    }
}
