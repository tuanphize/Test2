package Viettel.Test2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */

public class AppTestEmail
{
    /**
     * Rigorous Test :-)
     */
   
    private WebDriver driver;
    TestObjectEmail obj;
    
    
    @Before
    public void Dobefore() {
    	
    	driver =new ChromeDriver();
        driver.get("http://testmaster.vn/");
    }
    @Test
    public void validateEmailDK()
    {
    	 JavascriptExecutor js= (JavascriptExecutor) driver;	
     driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
     driver.manage().window().maximize();
     js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
     obj.txtDangKy.sendKeys("123");
     obj.btnEmail.click();
     assertTrue(obj.txtError.isDisplayed());
     assertEquals(obj.txtError.getText(),"* Email không đúng định dạng");
    }
}
