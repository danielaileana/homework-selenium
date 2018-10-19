package petclinic.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditSpecialty {
    private WebElement nameField;
    private WebElement updateButton;

    public EditSpecialty(WebDriver webDriver){
        nameField=webDriver.findElement(By.id("name"));
        updateButton=webDriver.findElement((By.xpath("//button[@type='submit']")));
    }

    public void editSpecialty(){
        nameField.clear();
        nameField.sendKeys("1");
        updateButton.click();
    }
}
