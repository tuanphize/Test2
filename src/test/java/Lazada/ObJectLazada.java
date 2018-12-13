package Lazada;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObJectLazada {
	private WebDriver driver;
	@FindBy(css="div.search-box__bar--29h6>input[type=\"search\"]")
	public WebElement txtSearch;
	@FindBy(css="div.mui-zebra-module:nth-child(4) div.site-nav.J_NavScroll:nth-child(5) div.lzd-header.lzd-header-lite:nth-child(1) div.lzd-header-content-wrap.J_NavScroll div.lzd-header-content div.lzd-logo-bar div.logo-bar-content.header-content div.lzd-nav-search form:nth-child(1) div.search-box--2I2a div.search-box__search--2fC5 > button.search-box__button--1oH7")
	public WebElement btnFind;
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	public WebElement txtResult;
	
	public ObJectLazada(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
