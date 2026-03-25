package testcases;

import org.testng.annotations.Test;
import pageObjects.homePage;
import testBase.baseClass;

public class TC_signUp extends baseClass {

    @Test(priority = 1)
    public void validSignUp() throws InterruptedException {
        homePage hp = new homePage(driver);

        hp.signUp();

        hp.FirstName(randomString().toUpperCase());
        hp.LastName(randomString().toUpperCase());
        hp.EmailAddress(p.getProperty("Email_Address"));
        hp.Password(p.getProperty("password"));
        hp.Create();

    }
}
