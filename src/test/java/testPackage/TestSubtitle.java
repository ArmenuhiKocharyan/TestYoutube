package testPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestSubtitle {

    @Test
    public void testSubtitles() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com");

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"img\"]")).isDisplayed());
        driver.findElement(By.xpath("//*[@id=\"img\"]")).click();

        Assert.assertTrue(driver.findElement(By.cssSelector(".ytp-subtitles-button")).isEnabled());
        {
            driver.findElement(By.cssSelector(".ytp-subtitles-button")).click();
        }

        driver.quit();
    }
}




