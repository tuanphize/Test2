package Lazada;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppTestLazada {
WebDriver driver;
ObJectLazada laza ;
@Before
public void iNitTest() throws InterruptedException {
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.lazada.vn/");
	this.laza=new ObJectLazada(driver);
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	

}
@After
public void AfterRun() {
	//this.driver.close();
	//aa
}
@Test
public void hienthiKQSearch() {
	laza.txtSearch.sendKeys("lót giày tăng chiều cao");
	laza.btnFind.click();
	assertTrue(laza.txtResult.isDisplayed());
	assertEquals(laza.txtResult.getText(),"5049 items found for \"");
	
}
}
