package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends basePage{
    public homePage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy (xpath="//*[contains(text(),'Sign up')]")
    WebElement signUp;

    @FindBy(xpath = "//*[@id='first_name']/input")
    WebElement FirstName;

    @FindBy(xpath = "//*[@id='last_name']/input")
    WebElement LastName;

    @FindBy(xpath = "//*[@id='email']/input")
    WebElement EmailAddress;

    @FindBy(xpath = "//*[@id='password']/input")
    WebElement Password;

    @FindBy(xpath = "//*[@class='action_bottom']/input")
    WebElement Create;

    public void signUp()
    {
        signUp.click();
    }
    public void FirstName()
    {
        FirstName.clear();
        FirstName.click();
    }
    public void LastName()
    {
        LastName.clear();
        LastName.click();
    }
    public void EmailAddress()
    {
        EmailAddress.clear();
        EmailAddress.click();
    }

    public void Password()
    {
        Password.clear();
        Password.click();
    }

    public void Create()
    {
        Create.click();
    }

}
