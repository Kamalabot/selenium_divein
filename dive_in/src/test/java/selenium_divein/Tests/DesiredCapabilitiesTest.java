package selenium_divein.Tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class DesiredCapabilitiesTest {
    static WebDriver driver;

    //@BeforeTest
    public static void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");

        driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
    }

    //@Test
    public void testCapabilities() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
    }
}

