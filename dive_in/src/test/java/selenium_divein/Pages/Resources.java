package selenium_divein.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import selenium_divein.Tests.jsonTypicodeTest;

public class Resources 
{
    public static void countLinks() 
    {
        List<WebElement> list = jsonTypicodeTest.driver.findElements(By.xpath("/html/body/div[2]/main/table[1]/tbody/tr[1]/td[1]/a"));
        System.out.println(list.size());
        for(int i=0; i<list.size(); i++)
        {
            String linkText = list.get(i).getText();
            System.out.println(linkText);

        }
        String expectedLink0 = "/posts";
        String actualLink0 = list[0];
        Assert.assertEquals(expectedLink0, actualLink0);

        String expectedLink1 = "/comments";
        String actualLink1 = list[1];
        Assert.assertEquals(expectedLink1, actualLink1);

        String expectedLink2 = "/albums";
        String actualLink2 = list[2];
        Assert.assertEquals(expectedLink2, actualLink2);

        String expectedLink3 = "/photos";
        String actualLink3 = list[3];
        Assert.assertEquals(expectedLink3, actualLink3);

        String expectedLink4 = "/todos";
        String actualLink4 = list[4];
        Assert.assertEquals(expectedLink4, actualLink4);
        
        String expectedLink5 = "/users";
        String actualLink5 = list[5];
        Assert.assertEquals(expectedLink5, actualLink5);
    }
}
