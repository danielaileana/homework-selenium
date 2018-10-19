package petclinic.com;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PetTypes {
    private WebElement homePageButton;
    private WebElement addPetTypesButton;
    private WebDriver webDriver;
    private WebElement nameField;
    private WebElement savePetTypesButton;
    private List<WebElement> petNameList;
    private List<WebElement>editButtonList;
    private List<WebElement>deleteButtonList;




    public PetTypes(WebDriver webDriver){
        this.webDriver=webDriver;
        homePageButton=webDriver.findElement(By.xpath("//button[contains(text(),'Home')]"));
        addPetTypesButton=webDriver.findElement(By.xpath("//button[contains(text(),'Add')]"));
        editButtonList=webDriver.findElements(By.xpath("//tbody//tr//td[2]//button[1]"));
        deleteButtonList=webDriver.findElements(By.xpath("//tbody//tr//td[2]//button[2]"));
        petNameList=webDriver.findElements(By.xpath("//input[@id]"));
    }

    public void addNewPetType(){
        addPetTypesButton.click();
        nameField=webDriver.findElement(By.id("name"));
        savePetTypesButton =webDriver.findElement(By.xpath("//button[@type='submit']"));
        nameField.sendKeys("pisicuta");
        savePetTypesButton.click();

    }
    public boolean checkIfThePeExists(String petExist){
        for(WebElement we:petNameList){
            if(we.getAttribute("value").equals(petExist)){
                return true;
            }
        }
        return false;
    }

    public void editNew(String namePetType) {

        for(int i = 0; i <petNameList.size(); i++) {

            String variabila = petNameList.get(i).findElement(By.id(String.valueOf(i))).getAttribute("value");

            if(namePetType.equals(variabila)) {

                System.out.println("test");
                editButtonList.get(i).click();
                break;
            }
        }

    }

    public void deleteNewPetType(String namePetType){
        for(int i = 0; i <petNameList.size(); i++) {

            String variabila = petNameList.get(i).findElement(By.id(String.valueOf(i))).getAttribute("value");

            if(namePetType.equals(variabila)) {

                deleteButtonList.get(i).click();
                break;
            }

        }


    }

    public void goToHomePage(){
        homePageButton.click();
    }

}
