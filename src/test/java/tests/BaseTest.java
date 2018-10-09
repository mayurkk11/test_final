package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeClass
    public void setup () 
    {
      	
//      System.setProperty("webdriver.gecko.driver","D:\\Firfox Geko driver\\geckodriver.exe");
//	    driver =  new FirefoxDriver();
//	    driver.manage().window().maximize();
//	    wait = new WebDriverWait(driver,15);
	   
	    
	    System.setProperty("webdriver.chrome.driver","D:\\Firfox Geko driver\\chromedriver.exe");
	    driver =  new ChromeDriver();
	    driver.manage().window().maximize();
	    wait = new WebDriverWait(driver,15);
	    
        
    }

    @AfterClass
    public void teardown () 
    {
        driver.quit();
    }
}
