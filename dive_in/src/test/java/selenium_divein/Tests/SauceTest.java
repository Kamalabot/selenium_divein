package selenium_divein.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import selenium_divein.Pages.Home;
import selenium_divein.Pages.Products;

public class SauceTest 
{
    public static WebDriver driver;
     @BeforeTest
    public static void testLaunchApp()
    {
        //System.setProperty("WebDriver.chrome.driver", "loc.");
        driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS)
    }    
    // implicitlywait(50,TimeUnit.SECONDS);

     @Test
    public static void testvalidate()
    {
        Home.options(); 
        Home.onlineProduct();
        Products.verifyShoeName1();
        Products.verifyShoeName2();
        Products.verifyShoeName3();
    }

     @AfterTest
    public static void testclose()
    {
        driver.close();
        driver.quit();
    }
}
