package com.jarvis.web.Service;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Service;

@Service 
public class WebServiceImpl implements WebServices {

    @Override
    public String openWebsite(String websitename) {
       WebDriver driver=new ChromeDriver();
       
       WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
       String url="http://www."+websitename+".com";
       driver.get(url);
       return "Opening "+websitename;
    }
    
}
