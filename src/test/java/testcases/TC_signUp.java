package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjects.signUpPage;
import testBase.baseClass;

import java.time.Duration;

public class TC_signUp extends baseClass {

    @Test(priority = 1)
    public void validSignUp() throws InterruptedException {
        signUpPage hp = new signUpPage(driver);

        hp.signUp();

        hp.FirstName(randomString().toUpperCase());
        hp.LastName(randomString().toUpperCase());
        hp.EmailAddress(p.getProperty("Email_Address"));


        //WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(1000));
        //mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app']/div[1]")));

       // hp.setPopUp();

        hp.Password(p.getProperty("password"));
        hp.Create();
        driver.findElement(By.xpath("//*[@id=\"create-account\"]/div[5]//div/section/div/div[1]/button/svg")).click();


    }
}
