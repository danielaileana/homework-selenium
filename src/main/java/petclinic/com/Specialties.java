package petclinic.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Specialties {
    private WebElement homeButton;
    private WebElement addSpecialtiesButton;
    private WebDriver webDriver;
    private List<WebElement> specialtiesNameList;
    private List<WebElement>editButtonList;
    private List<WebElement>deleteButtonList;


    public Specialties(WebDriver webDriver){
        this.webDriver=webDriver;
        homeButton=webDriver.findElement(By.xpath("//button[contains(text(),'Home')]"));
        addSpecialtiesButton=webDriver.findElement(By.xpath("//button[contains(text(),'Add')]"));
        specialtiesNameList=webDriver.findElements(By.xpath("//input[@id]"));
        editButtonList=webDriver.findElements(By.xpath("//tbody//tr//td[2]//button[1]"));
        deleteButtonList=webDriver.findElements(By.xpath("//tbody//tr//td[2]//button[2]"));

    }
    public void clickSpecialties(){
        addSpecialtiesButton.click();
    }

    public void addNewSpecialties(){
        addSpecialtiesButton.click();
        WebElement nameField=webDriver.findElement(By.xpath("//input[@id='name']"));
        nameField.sendKeys("generalist");
        WebElement saveSpecialtiesButton=webDriver.findElement(By.xpath("//button[@type='submit']"));
        saveSpecialtiesButton.click();
    }
    public boolean checkIfThePeExists(String petExist){
        for(WebElement we:specialtiesNameList){
            if(we.getAttribute("value").equals(petExist)){
                return true;
            }
        }
        return false;
    }

    public void editNewSpecialty(String nameSpecialties) {

        for(int i = 0; i <specialtiesNameList.size(); i++) {

            String variabila = specialtiesNameList.get(i).findElement(By.id(String.valueOf(i))).getAttribute("value");

            if(nameSpecialties.equals(variabila)) {

                System.out.println("test");
                editButtonList.get(i).click();
                break;
            }
        }

    }

    public void deleteNewSpecialty(String nameSpecialties){
        for(int i = 0; i <specialtiesNameList.size(); i++) {

            String variabila = specialtiesNameList.get(i).findElement(By.id(String.valueOf(i))).getAttribute("value");

            if(nameSpecialties.equals(variabila)) {

                deleteButtonList.get(i).click();
                break;
            }

        }


    }
}
