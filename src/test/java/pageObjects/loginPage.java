package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends basePage{

    public loginPage(WebDriver driver)
    {
        super(driver);
    }
    @FindBy(xpath = "//*[contains(text(),'Log In')]")
    WebElement login;

    @FindBy(xpath = "//*[@id=\"customer_email\"]")
    WebElement EmailAddress;

    @FindBy(xpath = "//*[@id=\"customer_password\"]")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"customer\"]/form/div[5]/input")
    WebElement signIn;

    public void loginClick()
    {
        login.click();
    }
    public void setEmailAddress(String email)
    {
        EmailAddress.clear();
        EmailAddress.click();
        EmailAddress.sendKeys(email);
    }
    public void setPassword(String pass)
    {
        password.clear();
        password.click();
        password.sendKeys(pass);
    }
    public void signInClick()
    {
     signIn.click();
    }
}
