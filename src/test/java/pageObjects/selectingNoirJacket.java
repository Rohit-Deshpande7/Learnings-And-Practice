package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class selectingNoirJacket extends basePage{

    public selectingNoirJacket(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//*[contains(text(),'Home')]")
    WebElement home;

    @FindBy(xpath = "//*[@id='page-content']/section/div[2]/a/img")
    WebElement noirJacket;

    @FindBy(xpath = "//*[@id='add']")
    WebElement addToCart;

    public void setHome()
    {
        home.click();
    }

    public void selectnoirJacket()
    {
        noirJacket.click();
    }

    public void clickAddToCart()
    {
        addToCart.click();
    }

}
