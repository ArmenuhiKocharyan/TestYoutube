package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSubtitle extends WebDriverSettings {

    @Test
    public void testSubtitles() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"img\"]")).click();

        Assert.assertTrue(driver.findElement(By.cssSelector(".ytp-subtitles-button")).isDisplayed()); {
            actions.sendKeys(Keys.CONTROL + "c").build().perform();
            actions.sendKeys(Keys.CONTROL + "c").build().perform();
        }


    }
}




