package utility;

import org.openqa.selenium.WebDriver;

public class TestContext {

   public WebDriver driver ;
   public PageObjectManager pom;

   public TestContext(){
       BrowserBase base = new BrowserBase();
       driver = base.getDriver();
       pom = new PageObjectManager(driver);
   }

}
