package selenium_divein.Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import selenium_divein.Tests.SauceTest;

public class Products 
{
    public static void verifyShoeName1()
    {
        String expectedShoe = "Formal Shoes";
        String actualShoe = SauceTest.driver.findElement(By.xpath("/html/body/div[2]/center/h2").getText());
        Assert.assertEquals(expectedShoe,actualShoe);
        // if(expectedShoe.equals(actualShoe))
        // {
        //     SauceTest.test.log(Status.PASS,"Verified formal shoes");
        // }
        SauceTest.driver.findElement(By.xpath("/html/body/div[2]/center/div/i[1]").click());
        String expectedshoe1 = "Classic Cheltenham";
        String actualshoe1 = SauceTest.driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]")).getText().trim();
        Assert.assertEquals(expectedshoe1, actualshoe1);
    }
     
    public static void verifyShoeName2()
    {
        String expectedShoe = "Sports Shoes";
        String actualShoe = SauceTest.driver.findElement(By.xpath("/html/body/div[3]/center/h2").getText());
        Assert.assertEquals(expectedShoe,actualShoe);
        // if(expectedShoe.equals(actualShoe))
        // {
        //     SauceTest.test.log(Status.PASS,"Verified sports shoes");
        // }
        SauceTest.driver.findElement(By.xpath("/html/body/div[3]/center/div/i[1]").click());
        String expectedshoe2 = "Ultimate";
        String actualshoe2 = SauceTest.driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[1]/td[1]")).getText().trim();
        Assert.assertEquals(expectedshoe2, actualshoe2);
    }
    public static void verifyShoeName3()
    {
        String expectedShoe = "Sneakers";
        String actualShoe = SauceTest.driver.findElement(By.xpath("/html/body/div[4]/center/h2").getText());
        Assert.assertEquals(expectedShoe, actualShoe);
        // if(expectedShoe.equals(actualShoe))
        // {
        //     SauceTest.test.log(Status.PASS, "Verified sneakers");
        // }
        SauceTest.driver.findElement(By.xpath("/html/body/div[4]/center/div/i[2]").click());
        String expectedshoe3 = "Archivo";
        String actualshoe3 = SauceTest.driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[1]/td[1]")).getText().trim();
        Assert.assertEquals(expectedshoe3, actualshoe3);
    }
}
