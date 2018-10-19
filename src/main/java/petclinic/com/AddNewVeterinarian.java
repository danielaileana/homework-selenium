package petclinic.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class AddNewVeterinarian {

        private WebElement firstName;
        private  WebElement lastName;
        private Select type;
        private  WebElement saveVetButton;




        public AddNewVeterinarian(WebDriver webDriver){
            firstName=webDriver.findElement(By.id("firstName"));
            lastName=webDriver.findElement(By.id("lastName"));
            type= new Select(webDriver.findElement(By.id("specialties")));
            saveVetButton=webDriver.findElement(By.xpath("//button[@type='submit']"));

        }
        public void clickSaveVetButton(){
            saveVetButton.click();
        }

        public void addNewVeterinarian(String firstNameF,String lastNameF,String typeF){
            firstName.sendKeys(firstNameF);
            lastName.sendKeys(lastNameF);
            type.selectByVisibleText(typeF);

        }




}




