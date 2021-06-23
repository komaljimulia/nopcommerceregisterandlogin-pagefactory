package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage;
    @BeforeMethod(alwaysRun = true)
    public void registerPageSetUp(){
        loginPage=new LoginPage();

    }
    //Login test 1- navigate to login page successfully
    @Test(groups = {"Sanity",  "Regression"})
    public void navigateToLoginPageSuccessFully() throws InterruptedException {
        loginPage.clickOnLoginLink();
        Thread.sleep(3000);
        String expectedSignInMsg = "Welcome, Please Sign In!";  //verify Welcome sign in text
        String actualSignInMsg = loginPage.getWelcomeSignText();
        Assert.assertEquals( expectedSignInMsg, actualSignInMsg );
    }
    //Login test 2-Invalid credentials
    @Test(groups = {"Smoke", "Regression"})
    public void veryFyErrorMessageWithInvalidCredentials() throws InterruptedException {
        loginPage.clickOnLoginLink();
        Thread.sleep(3000);
        loginPage.getEmailIdLogin("thisemail@gmail.com");
        loginPage.clickOnLoginButton();
        String realErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "The credentials provided are incorrect";  //verify error message
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals( realErrorMessage,actualErrorMessage );
    }
    //Login test 3-login successfully
    @Test(groups = {"Regression"})
    public void veryFyLoginPageSuccessfully() throws InterruptedException {
        loginPage.clickOnLoginLink();
        Thread.sleep(3000);
        loginPage.getEmailIdLogin("thisemail@gmail.com");
        loginPage.getPasswordLogin("abcdef");
        loginPage.clickOnLoginButton();
        String expectedHomePageText="Welcome to our store";
        String actualHomePageText = loginPage.getHomePageText();
        Assert.assertEquals(actualHomePageText,expectedHomePageText);

    }
}
