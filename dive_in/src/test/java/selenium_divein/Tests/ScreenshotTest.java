package selenium_divein.Tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenshotTest {
    static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void captureScreenshot() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        try {
            WebElement productsTitle = driver.findElement(By.className("title"));
            assert (productsTitle.isDisplayed());
        } catch (NoSuchElementException e) {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenshot, new File("screenshot.png"));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}

