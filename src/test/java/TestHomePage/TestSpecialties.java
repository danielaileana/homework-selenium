package TestHomePage;

import org.junit.Assert;
import org.junit.Test;
import petclinic.com.EditSpecialty;
import petclinic.com.MenuPages;
import petclinic.com.Specialties;

public class TestSpecialties extends BaseClass{
    public MenuPages menuPage;
    public Specialties specialties;
    public EditSpecialty editSpecialty;

    @Test

    public void testAddNewSpecialties(){
        menuPage=new MenuPages(webDriver);
        menuPage.clickSpecial();
        specialties=new Specialties(webDriver);
        specialties.addNewSpecialties();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
        Assert.assertFalse(specialties.checkIfThePeExists("generalist"));

    }

    @Test

    public void testEditSpecialty(){
        menuPage=new MenuPages(webDriver);
        menuPage.clickSpecial();
        specialties=new Specialties(webDriver);
        specialties.clickSpecialties();
        specialties.editNewSpecialty("generalist");
        editSpecialty=new EditSpecialty(webDriver);
        editSpecialty.editSpecialty();
        Assert.assertFalse(specialties.checkIfThePeExists("generalist"));


    }
    @Test

    public void testDeleteSpecialty(){
        menuPage=new MenuPages(webDriver);
        menuPage.clickSpecial();
        specialties=new Specialties(webDriver);
        specialties.clickSpecialties();
        specialties.deleteNewSpecialty("generalist");

        specialties=new Specialties(webDriver);
        Assert.assertTrue(specialties.checkIfThePeExists("generalist"));

    }

}
