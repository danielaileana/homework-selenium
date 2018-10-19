package petclinic.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class AddOwnerClass {
    private WebElement firstName;
    private WebElement lastName;
    private WebElement address;
    private WebElement city;
    private WebElement telephone;
    private  WebElement messageEr;
    private WebElement ownersSubmitButton;
    private List<WebElement> owners;

    WebDriverWait wait;


    public AddOwnerClass(WebDriver webDriver){

        firstName=webDriver.findElement(By.id("firstName"));
        lastName=webDriver.findElement(By.id("lastName"));
        address=webDriver.findElement(By.id("address"));
        city=webDriver.findElement(By.id("city"));
        telephone=webDriver.findElement(By.id("telephone"));
        //messageEr=webDriver.findElement(By.xpath("//span[contains(text(),'Phone number only accept digits')]"));
        ownersSubmitButton=webDriver.findElement(By.xpath("//button[contains(text(),'Add Owner')]"));
        owners=  webDriver.findElements(By.className("ownerFullName"));
    }


    public void addNewOwner(){
        firstName.sendKeys("Daniela");
        lastName.sendKeys("Ileana");
        address.sendKeys("Bd Iuliu Maniu");
        city.sendKeys("Bucuresti");
        telephone.sendKeys("0733177712");


    }


   public boolean error(WebDriver webDriver){
        telephone.sendKeys("ee");
       messageEr =webDriver.findElement(By.xpath("//span[contains(text(),'Phone number only accept digits')]"));
        return messageEr.isDisplayed();
   }
    public void clickSubmitOwner(){
        ownersSubmitButton.click();
    }

    public void deleteTelephone(){
        telephone.clear();
        telephone.sendKeys("0999876");

    }
//    public List<WebElement> ownerExists(){
//        return owners;
//    }

    public boolean checkIfTheOwnerExists(String ownerExist){
        List<String> textList = new ArrayList<String>();
        for(WebElement we : owners ) {
            textList.add(we.getText());
        }
        for(String l : textList) {
            if (l.equals(ownerExist)) {
                return true;
            }
        }

        return true;
    }
    }




