package selenium_divein.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCaptures{
    public static void main(String[] args) {
        // Initialize the WebDriver (assuming you're using Chrome)
        WebDriver driver = new ChromeDriver();

        // Navigate to your target page
        driver.get("URL_OF_YOUR_PAGE");

        // Locate the element using XPath
        WebElement element = driver.findElement(By.xpath("/html/body/div[11]/div[1]/div[1]/div/div/section/div/div/div/div/div[1]/div/div[1]/div/div/div[1]/div[2]/div/div[1]/ul/li[1]/span[1]"));

        // Get the text value
        String value = element.getText();

        // Define the regex pattern for a number with comma separators and two decimal places
    //  25,265.65
        String regexPattern = "^\\d{1,3}(,\\d{3})*\\.\\d{2}$";

        // Assert the value matches the pattern
        if (value.matches(regexPattern)) {
            System.out.println("Value matches the expected format.");
        } else {
            System.out.println("Assertion failed! Value does not match the expected format.");
        }

        // Close the browser
        driver.quit();
    }
}

