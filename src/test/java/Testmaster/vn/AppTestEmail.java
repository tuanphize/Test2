package Testmaster.vn;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */

public class AppTestEmail {
	/**
	 * Rigorous Test :-)
	 */

	private WebDriver driver;
	TestObjectEmail obj;

	@Before
    public void InitTest() {
    	driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testmaster.vn/");
        this.obj=new TestObjectEmail(this.driver);
        
   
    }
	 @After
	    public void CloseTest() {
	    //this.driver.close();
	    }
	
	@Test
	public void validateEmailDK() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		obj.txtDangKy.sendKeys("123");
		obj.btnEmailNgoai.click();
		assertTrue(obj.txtError.isDisplayed());
		assertEquals(obj.txtError.getText(), "* Email không đúng định dạng");
	}

	@Test
	public void extraForm() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		obj.txtDangKy.sendKeys("nguyentuan23695@gmail.com");
		obj.btnEmailNgoai.click();
		assertTrue(obj.textDongY.isDisplayed());
		assertEquals(obj.textDongY.getText(),
				"Để phục vụ bạn được tốt hơn, bạn vui lòng cung cấp thêm các thông tin bên dưới.");

	}
}
