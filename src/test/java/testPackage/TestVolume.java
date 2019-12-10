package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVolume extends WebDriverSettings {

    @Test
    public void testVolumeUpDown() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"img\"]")).click();

        driver.findElement(By.className("ytp-play-button")).click();

        driver.findElement(By.className("ytp-play-button")).click();

        actions.sendKeys(Keys.CONTROL + "m").build().perform();

        actions.sendKeys(Keys.CONTROL + "m").build().perform();

        Integer valBeforDown = Integer.valueOf(driver.findElement(By.className("ytp-volume-panel")).getAttribute("aria-valuenow"));
        System.out.println(valBeforDown);

        for (int i = 0; i < 6; i++) {
            actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        }

        Integer valAfterDown = Integer.valueOf(driver.findElement(By.className("ytp-volume-panel")).getAttribute("aria-valuenow"));
        System.out.println(valAfterDown);

        Assert.assertTrue(valAfterDown < valBeforDown); {
            for (int i = 0; i < 6; i++) {
                actions.sendKeys(Keys.ARROW_UP).build().perform();
            }
        }
    }
}
