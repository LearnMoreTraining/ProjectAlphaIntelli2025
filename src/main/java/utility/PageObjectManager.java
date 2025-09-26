package utility;

import org.openqa.selenium.WebDriver;
import pageobjects.AmazonHomePage;
import pageobjects.AmazonSearchResultPage;
import pageobjects.JqueryPage;
import pageobjects.SalesforceLogin;

public class PageObjectManager {
    WebDriver driver ;
    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public AmazonHomePage getAmazonHomePage(){
        AmazonHomePage homePage = new AmazonHomePage(driver);
        return homePage;
    }

    public JqueryPage getJqueryPage(){
        JqueryPage jqueryPage = new JqueryPage(driver);
        return jqueryPage;
    }

    public AmazonSearchResultPage getSearchResultPage(){
        AmazonSearchResultPage searchResultPage = new AmazonSearchResultPage(driver);
        return searchResultPage;
    }

    public SalesforceLogin getSalesforceLogin(){
        SalesforceLogin s = new SalesforceLogin(driver);
        return s;
    }
}
