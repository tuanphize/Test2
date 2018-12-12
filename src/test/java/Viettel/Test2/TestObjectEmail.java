package Viettel.Test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TestObjectEmail {
private WebDriver driver;
@FindBy(xpath="/html[1]/body[1]/main[1]/div[6]/div[1]/div[1]/div[3]/div[2]/div[1]/input[1]")
public WebElement txtDangKy;
@FindBy(css="button.next-btn-primary")
public WebElement btnEmail;
@FindBy (xpath="/html[1]/body[1]/main[1]/div[6]/div[1]/div[1]/div[3]/div[2]/div[3]/span[1]")
public WebElement txtError;
@FindBy(css="div.footer:nth-child(6) div.container div:nth-child(1) div.subscription.col-sm-6 div.mod-input.error div.col-sm-3:nth-child(2) > button.next-btn-primary")
public WebElement buttontDangKy;
public TestObjectEmail(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

}
