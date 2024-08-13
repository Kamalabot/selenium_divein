package selenium_divein.Pages;

import selenium_divein.Tests.SeleniumTest;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductsPage {
  public static String formal_sh = "/html/body/div[2]/center/h2";
  public static String sports_sh = "/html/body/div[3]/center/h2";
  public static String sneakers_sh = "/html/body/div[4]/center/h2";

  public static String formal_list = "/html/body/div[2]/center/div/i[1]";
  public static String sports_list = "/html/body/div[3]/center/div/i[1]";
  public static String sneakers_list = "/html/body/div[4]/center/div/i[1]";

  public static String tables_formals = "/html/body/div[2]/table/tbody/tr[1]/td[1]";
  public static String tables_sports = "/html/body/div[3]/table/tbody/tr[1]/td[1]";
  public static String tables_sneakers = "/html/body/div[4]/table/tbody/tr[1]/td[1]";

  
  public static void verify_title_formals() {
    String expectedTitle = "Formal Shoes";
    String verfiedTitle = SeleniumTest.driver.findElement(By.xpath(formal_sh)).getText();
    Assert.assertEquals(expectedTitle, verfiedTitle);
  }

  public static void verify_title_sports() {
    String expectedTitle = "Sports Shoes";
    String verfiedTitle = SeleniumTest.driver.findElement(By.xpath(sports_sh)).getText();
    Assert.assertEquals(expectedTitle, verfiedTitle);

  }

  public static void verify_title_sneakers() {
    String expectedTitle = "Sneakers";
    String verfiedTitle = SeleniumTest.driver.findElement(By.xpath(sneakers_sh)).getText();
    Assert.assertEquals(expectedTitle, verfiedTitle);

  }


  public static void get_items_formals() {
    String exceptedElement = "Classic Cheltenham";
    // simply click with driver first on the xpath
    SeleniumTest.driver.findElement(By.xpath(formal_list)).click();
    // that will change the page, after that get the text
    String verifiedElement = SeleniumTest.driver.findElement(By.xpath(tables_formals)).getText().trim();
    Assert.assertEquals(exceptedElement, verifiedElement);

  }

  public static void get_items_sports() {
    String exceptedElement = "Ultimate";
    // simply click with driver first on the xpath
    SeleniumTest.driver.findElement(By.xpath(sports_list)).click();
    // that will change the page, after that get the text
    String verifiedElement = SeleniumTest.driver.findElement(By.xpath(tables_sports)).getText().trim();
    Assert.assertEquals(exceptedElement, verifiedElement);

  }

  public static void get_items_sneakers() {
    String exceptedElement = "Archivo";
    // simply click with driver first on the xpath
    SeleniumTest.driver.findElement(By.xpath(sneakers_list)).click();
    // that will change the page, after that get the text
    String verifiedElement = SeleniumTest.driver.findElement(By.xpath(tables_sneakers)).getText().trim();
    Assert.assertEquals(exceptedElement, verifiedElement);

  }

  public static void get_items_formal_title() {

  }

  public static void get_items_sports_title() {

  }
}
