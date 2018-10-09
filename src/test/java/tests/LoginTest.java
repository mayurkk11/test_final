package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test (priority = 0)
    public void invalidLoginTest_InvalidUserNameInvalidPassword () throws InterruptedException {
       
        HomePage homePage = new HomePage(driver,wait);

        //N11 anasayfasını Aç
        homePage.goToN11();

        //N11 Login Sayfasına Git
        homePage.goToLoginPage();

        LoginPage loginPage = new LoginPage(driver,wait);

        //Login to N11
        loginPage.loginToN11("goknur@goknur.com", "11223344");

        //Verification
        Thread.sleep(500);
        loginPage.verifyLoginPassword(("E-posta adresiniz veya şifreniz hatalı"));

    }

    @Test (priority = 1)
    public void invalidLoginTest_EmptyUserEmptyPass () throws InterruptedException {
        HomePage homePage = new HomePage(driver,wait);
        homePage.goToN11();
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver,wait);
        loginPage.loginToN11("","");
        Thread.sleep(500);
        loginPage.verifyLoginUserName("Lütfen e-posta adresinizi girin.");
        loginPage.verifyLoginPassword("Bu alanın doldurulması zorunludur.");
    }


}
