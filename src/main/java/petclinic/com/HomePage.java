package petclinic.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebElement titleH;
    private WebElement headerText;
    private WebElement imagine;


    public HomePage(WebDriver webDriver){
        titleH=webDriver.findElement(By.xpath("//h1[contains(text(),\"Welcome to Petclinic\")]") );
        headerText=webDriver.findElement(By.xpath("//h2[contains(text(),\"Welcome\")]"));
        imagine=webDriver.findElement(By.className("img-responsive"));

    }

    public String checkHomepage(){
        String actualResult = titleH.getText();
        return actualResult;

    }
    public String checkTitile(){
        String actualResult=headerText.getText();
        return actualResult;
    }

    public boolean checkImagine(){

        return imagine.isDisplayed();
    }

}
