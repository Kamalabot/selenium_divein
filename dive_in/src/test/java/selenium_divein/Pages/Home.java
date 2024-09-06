package selenium_divein.Pages;

import selenium_divein.Tests.*;
import org.openqa.selenium.By;

// import test.java.selenium_divein.Tests.SauceTest;
//import SauceTest;
public class Home 
{
    public static void options()
    {
        SauceTest.driver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input").click());
    }
    public static void onlineProduct()
    {
        SauceTest.driver.findElement(By.xpath("//*[@id=\\\"menu\\\"]/a[3]/li").click());
    }
}
