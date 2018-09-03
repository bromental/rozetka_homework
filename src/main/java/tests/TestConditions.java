package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPageRozetka;

import static utils.DriverManager.getDriver;

public class TestConditions {

    protected WebDriver driver = getDriver();

    @Before
    public void setUp() {
        driver.manage().window().maximize();
        driver.get("http://rozetka.com.ua");
        LoginPageRozetka loginPageRozetka = PageFactory.initElements(driver, LoginPageRozetka.class);
        loginPageRozetka.registeredUserLogin();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
