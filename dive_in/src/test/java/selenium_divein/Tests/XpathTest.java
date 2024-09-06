package selenium_divein.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class XPathTest {
    static WebDriver driver;

    // @BeforeAll
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    // @Test
    public void testDynamicXPaths() {
        // Using Page Object Model for login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        // XPaths:
        WebElement productTitle = driver.findElement(By.xpath("//span[@class='title']"));
        WebElement firstProduct = driver.findElement(By.xpath("(//div[@class='inventory_item'])[1]"));
        WebElement addToCartButton = driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]"));
        WebElement cartIcon = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        WebElement footer = driver.findElement(By.xpath("//div[contains(@class, 'footer')]"));

        // Assertions or actions can be added here
        System.out.println("Product Title: " + productTitle.getText());
        System.out.println("First Product: " + firstProduct.getText());
    }
}
