package selenium_divein.Tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium_divein.Pages.Resources;
public class jsonTypicodeTest 
{
    public static WebDriver driver;
    
    //@BeforeTest
    public static void LaunchApp()
    {
        //System.setProperty("WebDriver.chrome.driver", "loc.");
        driver = new ChromeDriver();
        driver.get("https://jsonplaceholder.typicode.com/");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlywait(50,TimeUnit.SECONDS);
    } 
    
    //@Test
    public static void validateLinks()
    {
       Resources.countLinks();
    }

    //@AfterTest
    public static void close()
    {
        driver.close();
        driver.quit();
    }
}
