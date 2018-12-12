package Testmaster.vn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TestObjectEmail {
private WebDriver driver;
@FindBy(xpath="/html[1]/body[1]/main[1]/div[6]/div[1]/div[1]/div[3]/div[2]/div[1]/input[1]")
public WebElement txtDangKy;
@FindBy(css="button.next-btn-primary")
public WebElement btnEmailNgoai;
@FindBy (xpath="/html[1]/body[1]/main[1]/div[6]/div[1]/div[1]/div[3]/div[2]/div[3]/span[1]")
public WebElement txtError;
@FindBy(css="body.modal-open:nth-child(2) div.modal.fade.popover-dialog.form.extra-subscription-form.in:nth-child(3) div:nth-child(1) div.popover-body p:nth-child(1) > b:nth-child(1)")
public WebElement textDongY;
public TestObjectEmail(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

}
