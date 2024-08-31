package selenium_divein.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicValueRangeAssertion {
    public static void main(String[] args) {
        // Initialize the WebDriver (assuming you're using Chrome)
        WebDriver driver = new ChromeDriver();

        // Navigate to your target page
        driver.get("URL_OF_YOUR_PAGE");

        // Locate the element using XPath
        WebElement element = driver.findElement(By.xpath("/html/body/div[11]/div[1]/div[1]/div/div/section/div/div/div/div/div[1]/div/div[1]/div/div/div[1]/div[2]/div/div[1]/ul/li[1]/span[1]"));

        // Get the text value
        String value = element.getText();

        // Remove commas and convert the value to a double
        double numericValue = Double.parseDouble(value.replace(",", ""));

        // Define the expected range
        double minValue = 25000.00;
        double maxValue = 26000.00;

        // Assert the value is within the expected range
        if (numericValue >= minValue && numericValue <= maxValue) {
            System.out.println("Value is within the expected range.");
        } else {
            System.out.println("Assertion failed! Value is out of the expected range.");
        }

        // Close the browser
        driver.quit();
    }
}
