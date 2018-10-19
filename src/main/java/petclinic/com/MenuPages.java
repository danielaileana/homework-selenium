package petclinic.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPages {

    private WebElement homeButton;
    private WebElement ownersButton;
    private WebElement veterinariansButton;
    private WebElement petTypesButton;
    private WebElement specialitiesButton;
    private WebElement all;
    private WebElement ownersAddButton;
    private WebElement veterinarianAddNewButton;
    private WebElement veterinariansAllButton;
    private WebDriver webDriver;


    public MenuPages(WebDriver webDriver){
        this.webDriver=webDriver;
        homeButton=webDriver.findElement(By.xpath("//span[text()='Home']"));
        ownersButton=webDriver.findElement(By.xpath("//a[text()='Owners']"));
        veterinariansButton=webDriver.findElement(By.xpath("//a[text()='Veterinarians']"));
        petTypesButton=webDriver.findElement(By.linkText("PET TYPES"));
        specialitiesButton=webDriver.findElement(By.xpath("//a[@href='/petclinic/specialties']"));
        all=webDriver.findElement(By.xpath("//a[@href='/petclinic/owners']"));
        ownersAddButton=webDriver.findElement(By.xpath("//a[@href='/petclinic/owners/add']"));



    }

    public void clickHome(){
        homeButton.click();
    }

    public void clickOwners(){
        ownersButton.click();
    }

    public void clickVeterinarians(){
        veterinariansButton.click();
    }
    public void clickPet(){
        petTypesButton.click();
    }
    public void clickSpecial(){
        specialitiesButton.click();
    }


    public void clickAll(){
        all.click();
    }
    public void clickAddNewOwner(){
        ownersAddButton.click();
    }

    public void clickAddNewVeteranians(){
        veterinarianAddNewButton=webDriver.findElement(By.xpath("//a[@routerlink='/vets/add']"));
        veterinarianAddNewButton.click();
    }
    public void clickAllVeterinarians(){
        veterinariansAllButton=webDriver.findElement(By.xpath("//a[@routerlink='/vets']"));
        veterinariansAllButton.click();
    }







}
