package testPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TestScroll extends WebDriverSettings {

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
