package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.LoginData;

public class LoginPageRozetka {

    @FindBy(xpath = "//span[@id='header_user_menu_parent']/a")
    private WebElement loginLink;

    @FindBy(xpath = "//input[@name='login']")
    private WebElement emailInputField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordInputField;

    public void registeredUserLogin() {
        loginLink.click();
        emailInputField.sendKeys(LoginData.getEMAIL());
        passwordInputField.sendKeys(LoginData.getPASSWORD());
        passwordInputField.sendKeys(Keys.ENTER);
    }
}
