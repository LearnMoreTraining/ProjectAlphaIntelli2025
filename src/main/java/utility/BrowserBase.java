package utility;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BrowserBase {

    WebDriver driver ;

    public WebDriver getDriver() throws IOException {

        File f = new File("src/main/resources/configurations/frameworkconfig.properties");
        FileInputStream fis = new FileInputStream(f);
        Properties prob = new Properties();
        prob.load(fis);

        if(prob.get("browser").toString().equalsIgnoreCase("chrome")){
             driver = new ChromeDriver();
        }
        else if(prob.get("browser").toString().equalsIgnoreCase("edge")){
             driver = new EdgeDriver();
        }
        else if(prob.get("browser").toString().equalsIgnoreCase("safari")){
            driver = new SafariDriver();
        }
        else{
            throw new InvalidArgumentException("verify the browser name");
        }

        driver.get(prob.get("environment").toString());

        return driver;
    }
}
