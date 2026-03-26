package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import testBase.baseClass;
import pageObjects.selectingNoirJacket;
public class TC_addToCart extends baseClass{

    @Test
    public void addToCart()
    {
        selectingNoirJacket sj= new selectingNoirJacket(driver);

        sj.setHome();
        sj.selectnoirJacket();

        WebElement sizeDropdwon= driver.findElement(By.xpath("//*[@id='product-select-option-0']"));
        Select se= new Select(sizeDropdwon);
        se.selectByValue("L");

        WebElement colorDropdwon= driver.findElement(By.xpath("//*[@id='product-select-option-1']"));
        Select se1= new Select(colorDropdwon);
        se1.selectByValue("Red");

        sj.clickAddToCart();

        sj.setClickMyCart();



    }
}
