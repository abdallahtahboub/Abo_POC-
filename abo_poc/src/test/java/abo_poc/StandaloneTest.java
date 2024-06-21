package abo_poc;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandaloneTest { 

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.leaseplan-abocar.de/login");

        driver.findElement(By.id("mat-input-0")).sendKeys("abdallah");;
        driver.findElement(By.id("mat-input-1")).sendKeys("abdallah");;
        driver.findElement(By.id("test_login_button_submit")).click();
    }
    
}
