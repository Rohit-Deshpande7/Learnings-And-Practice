package testBase;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.logging.Logger;

public class baseClass {

    public WebDriver driver;
    public Logger logger;
    public Properties p;

@BeforeClass
    public void setup() throws NullPointerException, IOException {
        FileReader file= new FileReader(".\\src\\test\\java\\utilities\\config.properties");
        p = new Properties();
        p.load(file);

        driver= new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.get(p.getProperty("siteurl"));

        driver.manage().window().maximize();
    }
//@AfterClass
   // public void tearDown()
    //{
    //    driver.quit();
//}

    public String randomString()
    {
        String genratedString = RandomStringUtils.randomAlphabetic(6);
        return genratedString;
    }

    public String randomInt()
    {
        String genratedInt = RandomStringUtils.randomNumeric(10);
        return genratedInt;
    }
}