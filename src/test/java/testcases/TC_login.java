package testcases;

import org.apache.logging.log4j.core.net.Priority;
import org.testng.annotations.Test;
import testBase.baseClass;
import pageObjects.loginPage;

@Test (priority = 2)
public class TC_login extends baseClass{

    public void validLogin(){

        loginPage lg= new loginPage(driver);

        lg.loginClick();

        lg.setEmailAddress(p.getProperty("Email_Address"));
        lg.setPassword(p.getProperty("password"));
        lg.signInClick();

    }
}
