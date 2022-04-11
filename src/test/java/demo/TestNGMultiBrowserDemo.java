package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import utils.ExcelUtils;

public class TestNGMultiBrowserDemo {

    WebDriver driver = null;
    String projectPath = System.getProperty("user.dir");

    @Parameters("browserName")
    @BeforeTest
    public void setUp(@Optional String browserName) {
        System.out.println("Browser name is: " + browserName);
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver_win32/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/geckodriver/geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
        }
    }

        @Test
        public void test1 () throws InterruptedException {
            driver.get("https://google.com");
            Thread.sleep(4000);
        }

        @AfterTest
        public void teardown () {
                driver.close();
        System.out.println("Test Completed Successfully");
    }
}
