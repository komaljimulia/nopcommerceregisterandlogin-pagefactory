package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
    RegisterPage registerPage;
    @BeforeMethod(alwaysRun = true)
    public void registerPageSetUp(){
        registerPage=new RegisterPage();

    }
    //Page loaded Successfully Method 1
    @Test(groups = {"Sanity",  "Regression"})
    public void verifyPageSuccessfully() throws InterruptedException {
        registerPage.clickOnRegisterLink();
        String expectedRegistertext = "Register";  //verify Register text
        String actualRegisterText = registerPage.getRegisterText();
        //System.out.println("actualRegisterText:" + actualRegisterText);
        Assert.assertEquals(expectedRegistertext, actualRegisterText);
    }
    //firstname empty =2
    @Test(groups = {"Smoke", "Regression"})
    public void veryFyFirstNameEmptyMessage() throws InterruptedException {
        registerPage.clickOnRegisterLink();
        String expectedRegistertext = "Register";  //verify Register text
        String actualRegisterText = registerPage.getRegisterText();
        //System.out.println("actualRegisterText:" + actualRegisterText);
        Assert.assertEquals( expectedRegistertext, actualRegisterText );
        Thread.sleep(3000);
        registerPage.getClickOnMale();
        registerPage.getFirstName("");
        registerPage.getLastName("Shah");
        registerPage.getDate();
        registerPage.getMonth();
        registerPage.getYear();
        registerPage.getEmailId("thisemail@gmail.com");
        registerPage.getCompanyName("abcLtd");
        registerPage.getPassword("abcdef");
        registerPage.getPasswordConfirm("abcdef");
        registerPage.clickOnRegisterButton();
        String expectedFirstNameEmptyMsg = "First name is required.";  //verify firstname empty message
        String actualFirstNameEmptyMsg = registerPage.getFirstNameEmptyMsg();
        Assert.assertEquals( expectedFirstNameEmptyMsg, actualFirstNameEmptyMsg );

    }
    //RegisterSuccessfully Method 3
    @Test(groups = {"Regression"})
    public void registerPageSuccessfully() throws InterruptedException {
        registerPage.clickOnRegisterLink();
        String expectedRegistertext = "Register";  //verify Register text
        String actualRegisterText = registerPage.getRegisterText();
        //System.out.println("actualRegisterText:" + actualRegisterText);
        Assert.assertEquals( expectedRegistertext, actualRegisterText );
        Thread.sleep(3000);
        registerPage.getClickOnMale();
        registerPage.getFirstName("Rushik");
        registerPage.getLastName("Shah");
        registerPage.getDate();
        registerPage.getMonth();
        registerPage.getYear();
        registerPage.getEmailId("thisemail@gmail.com");
        registerPage.getCompanyName("abcLtd");
        registerPage.getPassword("abcdef");
        registerPage.getPasswordConfirm("abcdef");
        registerPage.clickOnRegisterButton();
        String expectedRegisterMessage = "Your registration completed";  //verify Register message
        String actualRegisterMessage = registerPage.getRegisterMessage();
        Assert.assertEquals( expectedRegisterMessage, actualRegisterMessage );
        registerPage.clickOnLogoutLink();
    }
}
