package selenium_divein.Tests;

import selenium_divein.Pages.HomePage;
import selenium_divein.Pages.ProductsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {
  public static WebDriver driver;

  @BeforeTest
  public static void Setup() {
    // driver is of type WebDriver
    driver = new ChromeDriver();
    // here it is setup with home page before continuing with below tests
    driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
  }

  @Test
  public static void validate_title_onlineproducts() throws InterruptedException{
    // Home Page
    HomePage.click_burger(); 
    HomePage.click_pdt_list();
    // products page
    ProductsPage.verify_title_sports();
    ProductsPage.verify_title_formals();
    ProductsPage.verify_title_sneakers();
    // get the first ttitle of the product items
    ProductsPage.get_items_formals();
    ProductsPage.get_items_sports();
    ProductsPage.get_items_sneakers();
  }
  

}
