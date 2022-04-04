package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;

public class GoogleSearchTest {

    static WebDriver driver = null;

    public static void main(String[] args) {

        googleSearch();
    }

    public static void googleSearch(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //go to google
        driver.get("https://google.com");

        driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();

        //enter text to search text
       GoogleSearchPage.textboxSearch(driver).sendKeys("Automation step by step");

        //click on search button
        GoogleSearchPage.buttonSearch(driver).sendKeys(Keys.RETURN);

        //close browser
        driver.close();
        System.out.println("Test completed successfully");
    }
}
