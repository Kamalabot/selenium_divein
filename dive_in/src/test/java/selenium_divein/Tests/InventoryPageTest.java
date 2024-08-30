package selenium_divein.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium_divein.Pages.InventoryPage;
import selenium_divein.Pages.LoginPage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

class InventoryPageTest {

    WebDriver driver;
    LoginPage loginPage;
    InventoryPage inventoryPage;

    @BeforeTest
    void setup() {
        // Set up ChromeDriver and navigate to the SauceDemo login page
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        
        // Initialize LoginPage and InventoryPage objects
        loginPage = new LoginPage(driver);
        inventoryPage = loginPage.enterUsername("standard_user")
                                 .enterPassword("secret_sauce")
                                 .clickLoginButton();
    }

    @Test
    void testAddItemToCart() {
        // Example of using a method from the InventoryPage to add an item to the cart
        inventoryPage.addItemToCart("Sauce Labs Backpack");
        
        // Verify the item was added
        Assertions.assertTrue(inventoryPage.isItemInCart("Sauce Labs Backpack"), "Item was not added to the cart!");
    }

    @AfterTest
    void teardown() {
        // Quit the driver
        driver.quit();
    }
}
