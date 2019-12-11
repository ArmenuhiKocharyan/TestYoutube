package testPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestForwardAndBack {

    @Test
    public void forwAndBack() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com");

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"img\"]")).isEnabled());
        driver.findElement(By.xpath("//*[@id=\"img\"]")).click();

        for (int i = 0; i < 6; i++) {
            actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        }

        for (int i = 0; i < 6; i++) {
            actions.sendKeys(Keys.ARROW_LEFT).build().perform();
        }

        driver.quit();
    }

}
