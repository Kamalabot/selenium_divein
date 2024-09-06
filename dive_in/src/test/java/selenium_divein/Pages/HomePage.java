package selenium_divein.Pages;

import selenium_divein.Tests.*;
import selenium_divein.Tests.SeleniumTest;
import org.openqa.selenium.By;

public class HomePage{

  public static String has_burger = "//*[@id='menuToggle']/input";
  public static String has_list = "//*[@id='menu']/a[3]/li";

  public static void click_burger() {
    SeleniumTest.driver.findElement(By.xpath(has_burger)).click();
  }

  public static void click_pdt_list() throws InterruptedException{
    Thread.sleep(2000);
    SeleniumTest.driver.findElement(By.xpath(has_list)).click();

  }

}
