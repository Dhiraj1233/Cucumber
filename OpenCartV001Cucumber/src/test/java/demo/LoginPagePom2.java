
package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePom2
{
	@FindBy(id = "input-email")
	private WebElement emailTxt2;

	@FindBy(id = "input-password")
	private WebElement passTxt31;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement LoginBtn31;

	public LoginPagePom2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement enterEmail()
	{
		return emailTxt2;
	}
		public WebElement enterPass()
	{
		return passTxt31;
	}
	public void clickLogin()
	{
		LoginBtn31.click();;	
	}
}