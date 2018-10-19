package TestHomePage;

import org.junit.Assert;
import org.junit.Test;
import petclinic.com.AddOwnerClass;
import petclinic.com.HomePage;
import petclinic.com.MenuPages;
import petclinic.com.Owners;

public class TestHome extends BaseClass {
    public HomePage homePage;
    public Owners owners;
    public MenuPages menuPage;
    public AddOwnerClass addOwner;


    @Test
    public void testTitleExists(){

        homePage=new HomePage(webDriver);
        String result=homePage.checkHomepage();
        Assert.assertEquals("Welcome to Petclinic", result);
    }


    @Test
    public void testWelcomeExists(){
        homePage=new HomePage(webDriver);
        String result=homePage.checkTitile();
        Assert.assertEquals("Welcome", result);
    }

    @Test
    public void testImagineExists(){
        homePage=new HomePage(webDriver);
        owners=new Owners(webDriver);
        //owners.goToOwners();
       // Assert.assertTrue(homePage.checkImagine());

      //  Assert.assertTrue(owners.getOwners());
    }

    @Test
    public void testAddNewOwner(){

        menuPage=new MenuPages(webDriver);
        menuPage.clickOwners();
        menuPage.clickAddNewOwner();
        addOwner = new AddOwnerClass(webDriver);
        addOwner.addNewOwner();
        addOwner.clickSubmitOwner();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
   @Test
    public void testError(){
        menuPage=new MenuPages(webDriver);
       menuPage.clickOwners();
        menuPage.clickAddNewOwner();
       addOwner=new AddOwnerClass(webDriver);
        Assert.assertTrue(addOwner.error(webDriver));
       try {
           Thread.sleep(1000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
   }

   @Test
    public void testDeleteTelephone(){
       menuPage=new MenuPages(webDriver);
       menuPage.clickOwners();
       menuPage.clickAddNewOwner();
       addOwner=new AddOwnerClass(webDriver);
       addOwner.error(webDriver);
       try {
           Thread.sleep(3000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       addOwner.deleteTelephone();
       try {
           Thread.sleep(6000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }

       addOwner.addNewOwner();
       addOwner.clickSubmitOwner();
       try {
           Thread.sleep(5000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }



   }
    @Test
    public void checkIfTheOwnerExists(){
        menuPage=new MenuPages(webDriver);
        menuPage.clickOwners();
        menuPage.clickAddNewOwner();
        addOwner=new AddOwnerClass(webDriver);
        addOwner.error(webDriver);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        addOwner.deleteTelephone();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        addOwner.addNewOwner();
        addOwner.clickSubmitOwner();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue( addOwner.checkIfTheOwnerExists("Betty Davis"));


    }









}
