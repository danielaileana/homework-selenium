package TestHomePage;

import org.junit.Assert;
import org.junit.Test;
import petclinic.com.AddNewVeterinarian;
import petclinic.com.AllVeterinarians;
import petclinic.com.EditVeterinarian;
import petclinic.com.MenuPages;

public class TestAddNewVeterinarians extends BaseClass{
    public MenuPages menuPage;
    public AddNewVeterinarian addNewVeterinarian;
    public EditVeterinarian editVeterinarian;

    @Test
    public void testAddNewVeterinarian(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        menuPage=new MenuPages(webDriver);
        menuPage.clickVeterinarians();
        menuPage.clickAddNewVeteranians();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        addNewVeterinarian=new AddNewVeterinarian(webDriver);
        addNewVeterinarian.addNewVeterinarian("Daniela","Ileana","surgery");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        addNewVeterinarian.clickSaveVetButton();

        AllVeterinarians allVet=new AllVeterinarians(webDriver);
        Assert.assertTrue(allVet.checkIfTheVetExists("Daniela Ileana"));

        allVet.editNewVeterinarians("Daniela Ileana");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();

        editVeterinarian=new EditVeterinarian(webDriver);
        editVeterinarian.addNewSpecialties();
        Assert.assertTrue(allVet.checkIfTheVetExists("Daniela Ileana"));

    }

    @Test
    public void testDeleteNewVet(){
        menuPage=new MenuPages(webDriver);
        menuPage.clickVeterinarians();

        menuPage.clickAllVeterinarians();
        AllVeterinarians allVet=new AllVeterinarians(webDriver);

        allVet.deleteNewVeterinarians("Daniela Ileana");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        allVet=new AllVeterinarians(webDriver);
        Assert.assertFalse(allVet.checkIfTheVetExists("Daniela Ileana"));
    }









}

