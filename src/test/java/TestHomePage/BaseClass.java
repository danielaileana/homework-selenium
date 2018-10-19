package TestHomePage;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    WebDriver webDriver;
    @Before
    public void init(){
        webDriver=new ChromeDriver();

        webDriver.get("http://bhdtest.endava.com/petclinic/");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @After
    public void exit(){
        webDriver.quit();
    }
}
