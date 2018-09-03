package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class ConditionersPageRozetka {
    @FindBy(xpath = "(//div[@class='g-i-tile-i-title clearfix'])[16]/a")
    private WebElement conditionerItem;

    @FindBy(xpath = "//button[@name='topurchases']")
    private WebElement shoppingCartButton;

    public void addItemToShoppingCartByRegisteredUser() {
        conditionerItem.click();
        shoppingCartButton.click();
    }

    public boolean isCheckoutButtonEnabled(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        By buttonBuy = By.xpath("//button[@id='popup-checkout']");
        return driver.findElement(buttonBuy).isEnabled();
    }
}
