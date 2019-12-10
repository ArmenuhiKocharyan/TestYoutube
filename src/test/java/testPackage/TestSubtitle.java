package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSubtitle extends WebDriverSettings {

    @Test
    public void testSubtitles() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"img\"]")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//*/div[2]/div[2]/button[2]")).isDisplayed()); {
            actions.sendKeys(Keys.CONTROL + "c").build().perform();
            actions.sendKeys(Keys.CONTROL + "c").build().perform();
        }


    }
}




