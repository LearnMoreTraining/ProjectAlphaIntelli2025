package pageobjects;

import org.openqa.selenium.*;

public class SalesforceLogin {

    WebDriver driver ; //null

    public SalesforceLogin(WebDriver d){
        this.driver = d;
    }

    public SalesforceLogin enterUserName(String userName){
        try {
            driver.findElement(By.id("username")).sendKeys(userName);
        }
        catch(ElementNotInteractableException e){
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].value='"+userName+"'",driver.findElement(By.id("username")));
        }
        return this;
    }

    public SalesforceLogin enterPassword(String password){

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        return this;
    }

    public SalesforceLogin clickLoginButton(){
        try{
            driver.findElement(By.id("Login")).click();
        }
        catch(ElementClickInterceptedException e){

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click()",driver.findElement(By.id("Login")));

        }

        return this;
    }

    public String getErrorMessage(){
        String val;
        try{
           val= driver.findElement(By.id("error")).getText();
        }
        catch(ElementNotInteractableException e){
            JavascriptExecutor js = (JavascriptExecutor) driver;
           val = (String) js.executeScript("return arguments[0].value",driver.findElement(By.id("error")));
        }
      return val ;

    }
}
