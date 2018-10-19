package TestHomePage;

import org.junit.Assert;
import org.junit.Test;
import petclinic.com.HomePage;
import petclinic.com.MenuPages;
import petclinic.com.PetTypes;
import petclinic.com.UpdatePetType;

public class TestPetTypes extends BaseClass{
    public MenuPages menuPage;
    public PetTypes petTypes;
    public HomePage homePage;
    public UpdatePetType updatePetType;

    @Test
    public void testAddNewPetTypes(){
        menuPage=new MenuPages(webDriver);
        menuPage.clickPet();
        petTypes=new PetTypes(webDriver);
        petTypes.addNewPetType();
       Assert.assertFalse(petTypes.checkIfThePeExists("pisicuta"));

    }


    @Test

    public void testGoToHomePage(){
        menuPage=new MenuPages(webDriver);
        menuPage.clickPet();
        petTypes=new PetTypes(webDriver);
        petTypes.goToHomePage();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        homePage=new HomePage(webDriver);
        String result=homePage.checkHomepage();
        Assert.assertEquals("Welcome to Petclinic", result);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("");
    }

    @Test
    public void testEditNewPetType(){
        menuPage=new MenuPages(webDriver);
        menuPage.clickPet();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        petTypes=new PetTypes(webDriver);
        petTypes.editNew("pisica");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        updatePetType=new UpdatePetType(webDriver);
        updatePetType.updateNewPet();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("");
        //Assert.assertFalse(petTypes.checkIfTheVetExists("pisicuta"));


    }
    @Test
    public void testDeleteNewPetType(){
        menuPage=new MenuPages(webDriver);
        menuPage.clickPet();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        petTypes=new PetTypes(webDriver);
        petTypes.deleteNewPetType("pisicutaupdate pisicuta");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        petTypes=new PetTypes(webDriver);
        Assert.assertFalse(petTypes.checkIfThePeExists("pisicutaupdate pisicuta"));

    }
}
