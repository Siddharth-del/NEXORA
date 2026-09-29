
package com.jarvis.web.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchChrome {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
     

        driver.get("https://agripro-ai.vercel.app/signin");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("Siddharth");
       
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("123456");
           

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[.//span[text()='Sign in']]")
                )
        ).click();

       
        System.out.println(driver.getTitle());
        driver.close();
    driver.quit();

    
    }
}
