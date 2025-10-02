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
import java.time.Duration;
import java.util.Properties;

public class BrowserBase {

    WebDriver driver ;

    public WebDriver getDriver() {

        File f = new File("src/main/resources/configurations/frameworkconfig.properties");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Properties prob = new Properties();
        try {
            prob.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        if(prob.get("browser").toString().equalsIgnoreCase("chrome")){
//             driver = new ChromeDriver();
//        }
//        else if(prob.get("browser").toString().equalsIgnoreCase("edge")){
//             driver = new EdgeDriver();
//        }
//        else if(prob.get("browser").toString().equalsIgnoreCase("safari")){
//            driver = new SafariDriver();
//        }
//        else{
//            throw new InvalidArgumentException("verify the browser name");
//        }

        switch(prob.get("browser").toString().toLowerCase()){
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            default:
                throw new InvalidArgumentException("verify the browser name");
        }

        driver.get(prob.get("environment").toString());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        return driver;
    }
}
