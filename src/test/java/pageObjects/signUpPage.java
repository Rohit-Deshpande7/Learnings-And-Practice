package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class signUpPage extends basePage{
    public signUpPage(WebDriver driver)
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

    @FindBy(xpath = "//*[@id=\"create-account\"]/div[5]//div/section/div/div[1]/button/svg")
    WebElement popUpClose;

    public void signUp()
    {
        signUp.click();
    }
    public void FirstName(String fname)
    {

        FirstName.clear();
        FirstName.click();
        FirstName.sendKeys(fname);
    }
    public void LastName(String lname)
    {
        LastName.clear();
        LastName.click();
        LastName.sendKeys(lname);
    }
    public void EmailAddress(String emailAdd)
    {
        EmailAddress.clear();
        EmailAddress.click();
        EmailAddress.sendKeys(emailAdd);
    }
    public void Password(String pass)
    {
        Password.clear();
        Password.click();
        Password.sendKeys(pass);
    }

    public void setPopUp()
    {
        popUpClose.click();
    }
    public void Create()
    {
        Create.click();
    }

}
