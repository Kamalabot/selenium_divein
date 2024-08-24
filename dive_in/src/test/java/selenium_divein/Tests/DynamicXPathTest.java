package selenium_divein.Tests;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DynamicXPathTest {
    static WebDriver driver;

    @BeforeTest
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
        
        // Perform login
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();
    }

    @Test
    public void testDynamicXPaths() {
        // 1. Using contains() function
        WebElement productTitle = driver.findElement(By.xpath("//span[contains(text(),'Products')]"));
        System.out.println("Product Title: " + productTitle.getText());

        // 2. Using starts-with() function
        WebElement firstProduct = driver.findElement(By.xpath("//div[starts-with(@class,'inventory_item')]"));
        System.out.println("First Product: " + firstProduct.getText());

        // 3. Using text() function
        WebElement addToCartButton = driver.findElement(By.xpath("//button[text()='Add to cart']"));
        addToCartButton.click();

        // 4. Using ancestor axis
        WebElement productPrice = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']/ancestor::div[@class='inventory_item']//div[@class='inventory_item_price']"));
        System.out.println("Product Price: " + productPrice.getText());

        // 5. Using following-sibling axis
        WebElement addToCart = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']/following-sibling::div//button"));
        addToCart.click();

        // 6. Using indexing in XPath
        List<WebElement> inventoryItems = driver.findElements(By.xpath("//div[@class='inventory_item']"));
        if (!inventoryItems.isEmpty()) {
            WebElement secondItem = inventoryItems.get(1);
            System.out.println("Second Product: " + secondItem.getText());
        }

        // 7. Using and & or conditions
        WebElement checkoutButton = driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button' and contains(text(),'Checkout')]"));
        checkoutButton.click();

        // 8. Using not() function
        List<WebElement> nonCancelButtons = driver.findElements(By.xpath("//button[not(contains(text(), 'Cancel'))]"));
        for (WebElement button : nonCancelButtons) {
            System.out.println("Non-cancel button: " + button.getText());
        }

        // 9. Using self axis
        WebElement selectedProduct = driver.findElement(By.xpath("//div[@class='inventory_item_label']/self::div"));
        System.out.println("Selected Product: " + selectedProduct.getText());

        // 10. Using preceding-sibling axis
        WebElement productLabel = driver.findElement(By.xpath("//button[text()='Remove']/preceding-sibling::div[@class='inventory_item_label']"));
        System.out.println("Product Label: " + productLabel.getText());
    }

    @AfterTest
    public static void tearDown() {
        driver.quit();
    }
}

