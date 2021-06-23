package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    private static final Logger log= LogManager.getLogger(HomePage.class.getName());
    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerLink;
    @FindBy(xpath = "//h1[text()='Register']")
    WebElement registerText;
    @FindBy(xpath = "//label[contains(text(),'Male')]")
    WebElement clickOnMale;
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;
    @FindBy(xpath = "//select[@name='DateOfBirthDay']//option[contains(text(),'11')]")
    WebElement date;
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']//option[contains(text(),'November')]")
    WebElement month;
    @FindBy(xpath = "//select[@name='DateOfBirthYear']//option[contains(text(),'2011')]")
    WebElement year;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailId;
    @FindBy(xpath = "//input[@id='Company']")
    WebElement company;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;
    @FindBy(xpath = "//div[text()='Your registration completed']")
    WebElement registerMessage;
    @FindBy(xpath = "//a[@class='ico-logout']")
    WebElement clickOnLogOut;

    //ErrorMessage with First name empty
    @FindBy(xpath = "//span[text()='First name is required.']")
    WebElement firstNameEmpty;


    public void clickOnRegisterLink(){
        Reporter.log("Clicking on register link:" + registerLink.toString() + "<br>");
        clickOnElement(registerLink);
        log.info("Clicking on radio button:" + registerLink.toString());
    }
    public String getRegisterText(){
        Reporter.log("Register text:" + registerText.toString() + "<br>");
        log.info("Register Text:" + registerText.toString());
        return getTextFromElement(registerText);
    }
    public void getClickOnMale(){
        Reporter.log("Clicking on male button:" + clickOnMale.toString() + "<br>");
        clickOnElement(clickOnMale);
        log.info("Clicking on male button:" +clickOnMale.toString());
    }
    public void getFirstName(String name){
        Reporter.log("Get first name:" + firstName.toString() + "<br>");
        log.info("Get first name:" + firstName.toString());
         sendTextToElement(firstName,name);
    }
    public void getLastName(String surname){
        Reporter.log("Get last name:" + lastName.toString() + "<br>");
        log.info("Get last name:" + lastName.toString());
        sendTextToElement(lastName,surname);
    }
    public void getDate(){
        Reporter.log("Date:" + date.toString() +"<br>");
        clickOnElement(date);
        log.info("Date:" +date.toString());
    }
    public void getMonth(){
        Reporter.log("Month:" + month.toString() +"<br>");
        clickOnElement(month);
        log.info("Month:" +month.toString());
    }
    public void getYear(){
        Reporter.log("Year:" + year.toString() +"<br>");
        clickOnElement(year);
        log.info("Year:" +year.toString());
    }
    public void getEmailId(String emailid){
        Reporter.log("Get Email id:" + emailId.toString() + "<br>");
        log.info("Get Email id:" + emailId.toString());
        sendTextToElement(emailId,emailid);
    }
    public void getCompanyName(String companyName){
        Reporter.log("Get company name:" + company.toString() + "<br>");
        log.info("Get company name:" + company.toString());
        sendTextToElement(company,companyName);
    }
    public void getPassword(String passwordCorrect){
        Reporter.log("Get password:" + password.toString() + "<br>");
        log.info("Get password:" + password.toString());
        sendTextToElement(password,passwordCorrect);
    }
    public void getPasswordConfirm(String passwordCorrect1){
        Reporter.log("Get password confirm:" + confirmPassword.toString() + "<br>");
        log.info("Get password confirm:" + confirmPassword.toString());
        sendTextToElement(confirmPassword,passwordCorrect1);
    }
    public void clickOnRegisterButton(){
        Reporter.log("Registration Button Click " + registerButton.toString() + "<br>");
        clickOnElement(registerButton);
    }
    public String getRegisterMessage(){
        Reporter.log("Register message:" + registerMessage.toString() + "<br>");
        log.info("Register message:" + registerMessage.toString());
        return getTextFromElement(registerMessage);
    }
    public String getFirstNameEmptyMsg(){
        Reporter.log("First name empty message:" +firstNameEmpty.toString() + "<br>");
        log.info("First name empty message:" + firstNameEmpty.toString());
        return getTextFromElement(firstNameEmpty);
    }
    public void clickOnLogoutLink(){
        Reporter.log("Clicking on logout link:" + clickOnLogOut.toString() + "<br>");
        clickOnElement(clickOnLogOut);
        log.info("Clicking on radio button:" + clickOnLogOut.toString());
    }


}
