package hooks;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utility.TestContext;

public class Hooks {

    private TestContext context;

    public Hooks(TestContext context){
        this.context = context ;
    }

    @Before()
    public void before(){

        System.out.println("before");
    }


    @After()
    public void after(){
        System.out.println("After");
     //   context.driver.close();

        context.driver.quit();

    }

    @BeforeStep()
    public void beforeStep(){
        System.out.println("before step");
    }

    @AfterStep()
    public void afterStep(Scenario s){
        System.out.println("after step");
        TakesScreenshot ts = (TakesScreenshot)context.driver;
        byte[] b= ts.getScreenshotAs(OutputType.BYTES);
        s.attach(b,"image/png",s.getName());
    }
}
