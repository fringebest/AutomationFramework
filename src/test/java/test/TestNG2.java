package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG2 {

    static WebDriver driver = null;

    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void start2(){
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();
        driver.findElement(By.name("q")).sendKeys("TestNG");
    }

    @AfterTest
    public void closeUp(){
        driver.close();
        driver.quit();
        System.out.println("Test successfully");
    }
}
