package testPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class WebDriverSettings {

    public ChromeDriver driver;
    public WebDriverWait wait;
    public Actions actions;

    @BeforeTest
    public void setUp() {
        //Add your path of chromedriver.
        System.setProperty("webdriver.chrome.driver", "your path of chromedriver");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.youtube.com");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 30);
        actions = new Actions(driver);

    }

    @AfterTest
    public void close() {
        driver.quit();
    }

}
