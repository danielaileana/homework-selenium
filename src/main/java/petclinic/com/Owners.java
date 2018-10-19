package petclinic.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class Owners {

    private List<WebElement> owners;
    private WebElement buttonAddNew;
    WebDriverWait wait;

public Owners(WebDriver webDriver){
    wait=new WebDriverWait(webDriver,10);
    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ownerFullName")));
    buttonAddNew=webDriver.findElement(By.xpath("//a[@routerlink=\"/owners/add\"]"));
    owners=  webDriver.findElements(By.className("ownerFullName"));

}

    public List<WebElement> getOwnersList(){
        return owners;
    }

    public boolean getOwnerPresent(String OwnerName){
        List<String> textList = new ArrayList<String>();
        for(WebElement we : owners ) {
            textList.add(we.getText());
        }

        for(String l : textList) {
            if (l.equals(OwnerName)) {
                return true;
            }
        }

        return true;
    }

    public void clickAddOwners(){
        buttonAddNew.click();
    }

//    public void goToOwners(){
//    buttonOwner.click();
//    buttonAll.click();
//    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h2[contains(text(),\"Owners\")]")));
//
//}
//    public boolean getOwners() {
//     List<String>name=new ArrayList<String>();
//        for(WebElement i: owners){
//            name.add(i.getText());
//        }
//        for(String i: name){
//            if(i=="Betty Davis"){
//                return true;
//            }
//        }
//        return true;
//    }
//    public void goToAdd(){
//
//        buttonAddNew.click();
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h2[contains(text(),\"New Owner\")]")));
//    }






}
