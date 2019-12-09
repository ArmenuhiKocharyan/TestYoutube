package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class TestForwardAndBack extends WebDriverSettings {

    @Test
    public void forwAndBack() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"img\"]")).click();

        for (int i = 0; i < 6; i++) {
            actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        }

        for (int i = 0; i < 6; i++) {
            actions.sendKeys(Keys.ARROW_LEFT).build().perform();
        }

    }

}
