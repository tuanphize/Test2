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
        JavascriptExecutor js=(JavascriptExecutor) driver;
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	js.executeScript("scroll(0,400)");
      
   
    }
	 @After
	    public void CloseTest() {
	    driver.close();
	    }
	@Ignore
	@Test
	//1.1
	public void validateEmailDK() {
		obj.txtDangKy.sendKeys("123");
		obj.btnEmailNgoai.click();
		assertTrue(obj.txtError.isDisplayed());
		assertEquals(obj.txtError.getText(), "* Email không đúng định dạng");
	}
	//1.2
	@Ignore
	@Test
	public void ktTonTaiEmailK() {
		obj.txtDangKy.sendKeys("nguyentuan23695@gmail.com");
		obj.btnEmailNgoai.click();
		assertTrue(obj.txtError.isDisplayed());
		assertEquals(obj.txtError.getText(), "* Email đã tồn tại");
	}
	//1.3
    @Ignore
	@Test
	public void extraFormAppear() {
		obj.txtDangKy.sendKeys("nguyentuan23695@gmail.com");
		obj.btnEmailNgoai.click();
		assertTrue(obj.textDongY.isDisplayed());
		assertEquals(obj.textDongY.getText(),
				"Để phục vụ bạn được tốt hơn, bạn vui lòng cung cấp thêm các thông tin bên dưới.");

	}
	//2.1
    @Ignore
    @Test
    public void hoTenExtraForm() {
    	obj.txtDangKy.sendKeys("nguyentuan@gmail.com");
    	obj.btnEmailNgoai.click();
    	assertTrue(obj.textDongY.isDisplayed());
    	obj.txthoTen.sendKeys("");
    	assertEquals(obj.cbGioiTinh.getText(),"Không xác định");
    	assertEquals(obj.cbLoaiTin.getText(),"Nhận tất cả các loại tin");
    	assertEquals(obj.textDongY.getText(),"Bạn chưa nhập họ tên","");
    	
    }
    //2.2
    @Test
    public void ktHoTenExtraform() throws InterruptedException {
    	obj.txtDangKy.sendKeys("nguyentuan@gmail.com");
    	obj.btnEmailNgoai.click();
        obj.txthoTen.sendKeys("123");
        obj.btnDongY.click();
        Thread.sleep(1000);
        assertTrue(obj.formDongY.isDisplayed());
        //assertEquals(obj.textDongY.getText(),"Họ tên không đúng định dạng");
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
