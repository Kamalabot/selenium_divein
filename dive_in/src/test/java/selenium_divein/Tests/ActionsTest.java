package selenium_divein.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ActionsTest {
    static WebDriver driver;

    @BeforeTest
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void performActions() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        Actions actions = new Actions(driver);
        WebElement menuButton = driver.findElement(By.id("react-burger-menu-btn"));

        // Mouse hover
        actions.moveToElement(menuButton).perform();

        // Click on an element
        actions.click(menuButton).perform();

        // Right click
        WebElement cartLink = driver.findElement(By.id("shopping_cart_container"));
        actions.contextClick(cartLink).perform();

        // Double click
        actions.doubleClick(menuButton).perform();

        // Keyboard action (Shift + Enter)
        actions.keyDown(Keys.SHIFT).sendKeys(Keys.ENTER).keyUp(Keys.SHIFT).perform();
    }
}

