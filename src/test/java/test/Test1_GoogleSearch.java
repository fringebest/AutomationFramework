package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class Test1_GoogleSearch {

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
       WebElement searchInput =  driver.findElement(By.name("q"));
       searchInput.sendKeys("Automation step by step");
       searchInput.sendKeys(Keys.RETURN);

        //click on search button
        //driver.findElement(By.).click();
        //driver.findElement(By.xpath("//div//center//input[@class='gNO89b']")).sendKeys(Keys.RETURN);

        //close browser
        driver.close();
        System.out.println("Test completed successfully");
    }
}
