package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    private static final Logger log= LogManager.getLogger(HomePage.class.getName());
    @FindBy(linkText = "Log in")
    WebElement loginLink;
    @FindBy(xpath = "//h1[text()='Welcome, Please Sign In!']")
    WebElement welcomeSignInText;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement enterEmail;
    @FindBy(xpath = "//button[@class='button-1 login-button']")
    WebElement clickOnLoginButton;
    @FindBy(xpath = "//div[@class = 'message-error validation-summary-errors']")
    WebElement errorMessage;
    @FindBy(name = "Password")
    WebElement password;
    @FindBy(xpath = "//h2[text()='Welcome to our store']")
    WebElement homePageText;


    public void clickOnLoginLink(){
        Reporter.log("Clicking on Login Link " + loginLink.toString() + "<br>");
        clickOnElement(loginLink);
        log.info("Clicking on Login Link:" + loginLink.toString());
    }
    public String getWelcomeSignText(){
        Reporter.log("Sign in text:" + welcomeSignInText.toString() + "<br>");
        log.info("Sign in Text:" + welcomeSignInText.toString());
        return getTextFromElement(welcomeSignInText);
    }
    public void getEmailIdLogin(String emailidLogin){
        Reporter.log("Get Email id:" + enterEmail.toString() + "<br>");
        log.info("Get Email id:" + enterEmail.toString());
        sendTextToElement(enterEmail,emailidLogin);
    }
    public void clickOnLoginButton(){
        Reporter.log("Clicking on Login button " + clickOnLoginButton.toString() + "<br>");
        clickOnElement(clickOnLoginButton);
        log.info("Clicking on Login button:" + clickOnLoginButton.toString());
    }
    public String getErrorMessage()  {
        Reporter.log("Login Error " + errorMessage.toString() + " <br>");
        log.info("Login error:" + errorMessage.toString());
        return getTextFromElement(errorMessage);

    }
    public void getPasswordLogin(String passwordLogin){
        Reporter.log("Get password :" + password.toString() + "<br>");
        log.info("Get Email id:" + password.toString());
        sendTextToElement(password,passwordLogin);
    }
    public String getHomePageText(){
        mouseHoverToElement( homePageText );
        Reporter.log( "Get homepage Msg Text" + homePageText.toString() );
        log.info("Get homepage Msg Text" + homePageText.toString());
        return getTextFromElement( homePageText );

    }

}
