package testPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestScroll {

    @Test
    public void testScrolling() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        for (int i = 0; i < 2; i++) {
            js.executeScript("window.scrollBy(0,1000)");
        }

        for (int i = 0; i < 2; i++) {
            js.executeScript("window.scrollBy(0,-1000)");
        }
        driver.quit();
    }
}
