package petclinic.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AllVeterinarians {
    private List<WebElement> veterinarians;
    private List<WebElement> editVetButtons;
    private List<WebElement> deleteVetButtons;
    private WebDriver webDriver;



    public AllVeterinarians(WebDriver webDriver){
        this.webDriver=webDriver;
        veterinarians=webDriver.findElements(By.xpath("//table/tbody/tr/td[1]"));
        editVetButtons=webDriver.findElements(By.xpath("//table/tbody/tr/td[3]/button[1]"));
        deleteVetButtons=webDriver.findElements(By.xpath("//table/tbody/tr/td[3]/button[2]"));

    }

    public boolean checkIfTheVetExists(String vetExist){
        for(WebElement we:veterinarians){
            if(we.getText().equals(vetExist)){
                return true;
            }
        }
        return false;

    }

    public void editNewVeterinarians(String vetExist){
    for(int i=0;i<veterinarians.size();i++){
        if(veterinarians.get(i).getText().equals(vetExist)){
            editVetButtons.get(i).click();
            break;

        }

    }
    }
    public void deleteNewVeterinarians(String vetExist){
        for(int i=0;i<veterinarians.size();i++){
            if(veterinarians.get(i).getText().equals(vetExist)){
                deleteVetButtons.get(i).click();
                break;

            }

        }
    }
}