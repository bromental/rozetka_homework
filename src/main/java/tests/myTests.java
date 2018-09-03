package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.CategoriesPageRozetka;
import pages.ConditionersPageRozetka;

import static org.hamcrest.CoreMatchers.containsString;

public class myTests extends TestConditions {

    @Test
    public void checkItemIsAddedToShoppingCartByRegisteredUser() {
        CategoriesPageRozetka categoriesPageRozetka = new CategoriesPageRozetka();
        categoriesPageRozetka.chooseItemCategory(driver);

        ConditionersPageRozetka conditionersPage = PageFactory.initElements(driver, ConditionersPageRozetka.class);
        conditionersPage.addItemToShoppingCartByRegisteredUser();

        Assert.assertTrue(conditionersPage.isCheckoutButtonEnabled(driver));
    }

    @Test
    public void checkCategoryIsOpenedByRegisteredUser() {
        CategoriesPageRozetka categoriesPageRozetka = new CategoriesPageRozetka();
        categoriesPageRozetka.chooseItemCategory(driver);

        Assert.assertThat("Conditioners page is not opened", driver.getTitle().toLowerCase(), containsString("кондиц"));
    }
}
