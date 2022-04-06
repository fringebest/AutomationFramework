package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DefaultCapabilitites {

    public static void main(String[] args) {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();

        WebElement searchElement = driver.findElement(By.name("q"));


        searchElement.sendKeys("ABCDEF");
        searchElement.sendKeys(Keys.RETURN);

        driver.close();
        driver.quit();

    }
}
