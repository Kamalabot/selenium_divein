package selenium_divein.Tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import Pages.InventoryPage;

class LoginPageTest {

    WebDriver driver;
    LoginPage loginPage;
    InventoryPage inventoryPage;

    // @BeforeEach
    void setup() {
        // Set up ChromeDriver and navigate to the SauceDemo login page
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        
        // Initialize the LoginPage object
        loginPage = new LoginPage(driver);
    }

    // @Test
    void testSuccessfulLogin() {
        // Use method chaining to login and navigate to the inventory page
        inventoryPage = loginPage.enterUsername("standard_user")
                                 .enterPassword("secret_sauce")
                                 .clickLoginButton();
        
        // Assert that the inventory page is displayed
        Assertions.assertTrue(inventoryPage.isPageLoaded(), "Inventory Page did not load!");
    }

    // @AfterEach
    void teardown() {
        // Quit the driver
        driver.quit();
    }
}
