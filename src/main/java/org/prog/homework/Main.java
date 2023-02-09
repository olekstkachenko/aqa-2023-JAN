package org.prog;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String... args) throws InterruptedException {
        ChromeDriver chromeDriver = null;
        try {
            WebDriverManager.chromedriver().setup();

            WebDriver driver = new ChromeDriver();
            driver.get("https://rozetka.com.ua/");
            WebElement searchBar = driver.findElement(By.name("search"));
            searchBar.sendKeys("iphone");
            searchBar.sendKeys(Keys.ENTER);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            driver.findElement(By.xpath("//rz-filter-stack"));
            System.out.println("done!");
            WebElement iPhone14 = driver.findElement(By.xpath("//app-goods-tile-default/div/div[2]/a"));
            System.out.println("done!");
            iPhone14.click();
            driver.findElement(By.xpath("//rz-seller-title"));
            System.out.println("done!");
            String url = driver.getCurrentUrl();
            System.out.println("Current Url is:"  + url);        
        } finally {
            if (chromeDriver != null) {
                chromeDriver.quit();
            }
        }
    }
}
// Test case
// 1) Open rozetka.com.ua
// 2) Find search field 
// 3) Type "iphone" in search field
// 4) Verify presence search tab on left of the page
// 5) Find second item in list and click on it
// 6) Find item title on the page
// 7) Get current Url 
