package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SalesforceLogin {

    WebDriver driver ; //null

    public SalesforceLogin(WebDriver d){
        this.driver = d;
    }

    public SalesforceLogin enterUserName(String userName){

        driver.findElement(By.id("username")).sendKeys(userName);
        return this;
    }

    public SalesforceLogin enterPassword(String password){

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        return this;
    }

    public SalesforceLogin clickLoginButton(){

        driver.findElement(By.id("Login")).click();
        return this;
    }

    public String getErrorMessage(){

      return  driver.findElement(By.id("error")).getText();

    }
}
