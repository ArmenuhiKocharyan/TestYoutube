package testPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestSubtitle extends WebDriverSettings{

    @Test
    public void testSubtitles() throws InterruptedException {


        Assert.assertTrue(driver.findElement(By.cssSelector("yt-formatted-string.style-scope.ytd-rich-grid-video-renderer")).isDisplayed());
        driver.findElement(By.cssSelector("yt-formatted-string.style-scope.ytd-rich-grid-video-renderer")).click();

        Assert.assertTrue(driver.findElement(By.cssSelector(".ytp-subtitles-button")).isEnabled());
        {
            driver.findElement(By.cssSelector(".ytp-subtitles-button")).click();
        }

    }
}




