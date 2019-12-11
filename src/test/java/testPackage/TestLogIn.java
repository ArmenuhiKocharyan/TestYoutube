package testPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;


public class TestLogIn {

    @Test
    public void getURL() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com");

        Assert.assertTrue(driver.findElement(By.cssSelector("paper-button#button.style-scope.ytd-button-renderer.style-suggestive.size-small")).isEnabled());
        driver.findElement(By.cssSelector("paper-button#button.style-scope.ytd-button-renderer.style-suggestive.size-small")).click();

        Assert.assertTrue(driver.findElement(By.id("identifierId")).isDisplayed());
        driver.findElement(By.id("identifierId")).sendKeys("");

        Assert.assertTrue(driver.findElementByCssSelector("span.RveJvd.snByac").isDisplayed());
        driver.findElementByCssSelector("span.RveJvd.snByac").click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.whsOnd.zHQkBf")));

        Assert.assertTrue(driver.findElementByCssSelector("input.whsOnd.zHQkBf").isDisplayed());
        driver.findElementByCssSelector("input.whsOnd.zHQkBf").sendKeys("");

        Assert.assertTrue(driver.findElementByCssSelector("span.RveJvd.snByac").isDisplayed());
        driver.findElementByCssSelector("span.RveJvd.snByac").click();

        driver.quit();
    }
}
