package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoriesPageRozetka {

    public void chooseItemCategory(WebDriver driver) {
        driver.navigate().refresh();
        By category = By.xpath("//li[@id='4306']");
        By conditionersCategory = By.xpath("//li[@id='4306']//a[contains(text(),'Кондиц')][1]");

        WebElement categoryElement = driver.findElement(category);
        Actions builder = new Actions(driver);
        builder.moveToElement(categoryElement).build().perform();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(conditionersCategory));

        WebElement conditionersElement = driver.findElement(conditionersCategory);
        conditionersElement.click();
    }
}
