package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SalesforceLogin {

    WebDriver driver ; //null

    public SalesforceLogin(WebDriver d){
        this.driver = d;
    }

    public void enterUserName(String userName){

        driver.findElement(By.id("username")).sendKeys(userName);
    }

    public void enterPassword(String password){

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
    }

    public void clickLoginButton(){

        driver.findElement(By.id("Login")).click();
    }

    public String getErrorMessage(){

      return  driver.findElement(By.id("error")).getText();

    }
}
