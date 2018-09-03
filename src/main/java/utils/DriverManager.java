package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    public static WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver2.exe");
        return new ChromeDriver();
    }
}
