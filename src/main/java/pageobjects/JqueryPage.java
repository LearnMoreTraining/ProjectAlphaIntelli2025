package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JqueryPage {

    WebDriver driver;

    public JqueryPage(WebDriver driver){

        this.driver = driver ;
    }

    public void dragAndDrop(){
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        WebElement element1 = driver.findElement(By.id("draggable"));
        WebElement element2 = driver.findElement(By.id("droppable"));
        Actions a = new Actions(driver);
        a.dragAndDrop(element1,element2).build().perform();
        driver.switchTo().defaultContent();
    }

    public void handleAlert(){

        driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();
        driver.switchTo().alert().getText();
        driver.switchTo().alert().sendKeys("");
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("123")).click();

    }

    public boolean checkWait() {
        driver.findElement(By.id("quote")).click();
        boolean flag ;
        try {
            WebElement a = driver.findElement(By.xpath("//h3[text()='Hello, Learn More Aspirants']"));
            flag = a.isDisplayed();
        } catch (NoSuchElementException e) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            wait.pollingEvery(Duration.ofSeconds(10));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[text()='Hello, Learn More Aspirants']")));
            wait.ignoring(NoSuchElementException.class);
            flag = driver.findElement(By.xpath("//h3[text()='Hello, Learn More Aspirants']")).isDisplayed();
        }
    return flag;
    }
}
