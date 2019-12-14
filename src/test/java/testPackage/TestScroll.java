package testPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestScroll extends WebDriverSettings{

    @Test
    public void testScrolling() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        for (int i = 0; i < 2; i++) {
            js.executeScript("window.scrollBy(0,1000)");
        }

        for (int i = 0; i < 2; i++) {
            js.executeScript("window.scrollBy(0,-1000)");
        }
    }
}
