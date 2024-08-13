package selenium_divein.Tests;

import selenium_divein.Pages.HomePage;
import selenium_divein.Pages.ProductsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest; 
import com.aventstack.extentreports.ExtentReports; 
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SeleniumTest {
  public static WebDriver driver;
  static ExtentReports report;
  public static ExtentTest test;
  static ExtentReports extent = new ExtentReports(); 



  @BeforeTest
  public static void Setup() {
    // driver is of type WebDriver
    driver = new ChromeDriver();
    ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
    extent.attachReporter(spark);
    // here it is setup with home page before continuing with below tests
    driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
  }

  @Test
  public static void validate_title_onlineproducts() throws InterruptedException{
    test = extent.createTest("Test to show home page and product lists");
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
    extent.flush();
  }
  

}
