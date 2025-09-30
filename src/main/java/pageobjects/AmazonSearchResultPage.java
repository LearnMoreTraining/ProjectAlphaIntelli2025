package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonSearchResultPage {

    WebDriver driver;

    public AmazonSearchResultPage(WebDriver driver){
        this.driver = driver;
    }

    public void sortBy(){

    }

    public void selectProduct(int index){

        driver.findElement(By.xpath("//div[@data-cel-widget='search_result_"+index+"']")).click();
    }
}
