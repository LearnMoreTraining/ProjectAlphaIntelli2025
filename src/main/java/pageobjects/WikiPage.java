package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WikiPage {

    WebDriver driver;

    public WikiPage(WebDriver driver) {
       this.driver = driver;
    }

    public List<String> getShareHolder(){

       int size = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).size();
        List<String> shareholder = new ArrayList<String>();
       for(int i =0 ; i < size ; i++){
           shareholder.add(
           driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]"))
                   .get(i).getText());

       }
    return shareholder;
    }

    public List<String> getShareHolding(){
        int size = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]")).size();
        List<String> shareHolding = new ArrayList<String>();
        for(int i =0 ; i < size ; i++){
            shareHolding.add(
                    driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]"))
                            .get(i).getText());

        }
        return shareHolding;
    }

    public Map<String, String> getShareHolderHoldingValue(){

        Map <String , String > m = new HashMap<String, String>();
        int size = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]")).size();
        for(int i =0 ; i < size ; i++){
            m.put(driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]"))
                            .get(i).getText(),driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]"))
                    .get(i).getText());

        }
        return m;

    }
}
