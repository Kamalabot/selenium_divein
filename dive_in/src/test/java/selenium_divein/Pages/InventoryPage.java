package selenium_divein.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {

    WebDriver driver;

    @FindBy(className = "inventory_item")
    WebElement inventoryItem;

    @FindBy(className = "shopping_cart_badge")
    WebElement shoppingCartBadge;

    // Constructor initializes WebElements using PageFactory
    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Method to add an item to the cart
    public void addItemToCart(String itemName) {
        // Example of locating and interacting with a dynamic element
        WebElement item = driver.findElement(By.xpath("//div[text()='" + itemName + "']/following-sibling::button"));
        item.click();
    }

    // Method to check if the page is loaded
    public boolean isPageLoaded() {
        return inventoryItem.isDisplayed();
    }

    // Method to verify if an item is in the cart
    public boolean isItemInCart(String itemName) {
        // Check if the shopping cart badge is displayed
        return shoppingCartBadge.isDisplayed();
    }
}
