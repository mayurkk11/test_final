package Com.solnet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Com.solnet.base.classes.Browser_setup;

public class Solnet_Backend_Login extends Browser_setup 
{
	
	
	public Solnet_Backend_Login(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //*********Web Elements*********
    String usenameId = "email";
    String passwordId = "password";
    String loginButtonId = "loginButton";
    String errorMessageUsernameXpath = "//*[@id=\"loginForm\"]/div[1]/div/div";
    String errorMessagePasswordXpath = "//*[@id=\"loginForm\"]/div[2]/div/div ";

    //*********Page Methods*********

    public void loginToN11 (String username, String password)
    {
        //Enter Username(Email)
        writeText(By.id(usenameId),username);
        //Enter Password
        
        
        
        writeText(By.id(passwordId), password);
        //Click Login Button
        click(By.id(loginButtonId));
    }

    //Verify Username Condition
    public void verifyLoginUserName (String expectedText) {
        Assert.assertEquals(readText(By.xpath(errorMessageUsernameXpath)), expectedText);
    }

    //Verify Password Condition
    public void verifyLoginPassword (String expectedText) {
        Assert.assertEquals(readText(By.xpath(errorMessagePasswordXpath)), expectedText);
    }
}
