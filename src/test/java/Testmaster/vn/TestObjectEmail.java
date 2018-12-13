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
@FindBy(css="body.modal-open:nth-child(2) div.modal.fade.popover-dialog.form.extra-subscription-form.in:nth-child(3) div:nth-child(1) div.popover-body p:nth-child(3) > input.form-control")
public WebElement txthoTen;
@FindBy(css="body.modal-open:nth-child(2) div.modal.fade.popover-dialog.form.extra-subscription-form.in:nth-child(3) div.popover-body div.col-sm-5:nth-child(4) div.dropdown:nth-child(2) button.btn.btn-default.dropdown-toggle > span.content-display")
public WebElement cbGioiTinh;
@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[2]/button[1]/span[1]")
public WebElement cbLoaiTin;
@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/button[1]")
public WebElement btnDongY;
@FindBy(xpath="/html[1]/body[1]/div[1]")
public WebElement formDongY;
public TestObjectEmail(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

}
