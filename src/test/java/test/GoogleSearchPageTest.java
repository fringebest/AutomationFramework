package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

    private static WebDriver driver = null;
    public static void main(String[] args) {

        googleSearchTest();
    }

    public static void googleSearchTest(){
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();

        GoogleSearchPageObjects searchPageObjects = new GoogleSearchPageObjects(driver);

        driver.get("https://google.com");
        searchPageObjects.closePopUpFrame();
        searchPageObjects.setTextBoxSearch("A B C D ");
        searchPageObjects.clickSearchButton();
    }
}
