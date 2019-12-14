package testPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestVolume extends WebDriverSettings{

    @Test
    public void testVolumeUpDown() throws InterruptedException {

        Assert.assertTrue(driver.findElement(By.cssSelector("yt-formatted-string.style-scope.ytd-rich-grid-video-renderer")).isDisplayed());
        driver.findElement(By.cssSelector("yt-formatted-string.style-scope.ytd-rich-grid-video-renderer")).click();
        Thread.sleep(500);

        Assert.assertTrue(driver.findElement(By.className("ytp-play-button")).isDisplayed());
        driver.findElement(By.className("ytp-play-button")).click();
        driver.findElement(By.className("ytp-play-button")).click();

        actions.sendKeys(Keys.CONTROL + "m").build().perform();
        actions.sendKeys(Keys.CONTROL + "m").build().perform();

        Assert.assertTrue(driver.findElement(By.className("ytp-volume-panel")).isEnabled());
        Integer valBeforDown = Integer.valueOf(driver.findElement(By.className("ytp-volume-panel")).getAttribute("aria-valuenow"));
        System.out.println(valBeforDown);

        for (int i = 0; i < 6; i++) {
            actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        }

        Integer valAfterDown = Integer.valueOf(driver.findElement(By.className("ytp-volume-panel")).getAttribute("aria-valuenow"));
        System.out.println(valAfterDown);

        Assert.assertTrue(valAfterDown < valBeforDown);
        {
            for (int i = 0; i < 6; i++) {
                actions.sendKeys(Keys.ARROW_UP).build().perform();
            }
        }
    }
}
