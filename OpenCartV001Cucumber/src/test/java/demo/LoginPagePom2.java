package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePom2 
{
	@FindBy(id = "input-email")
	private WebElement emailTxt3;

	@FindBy(id = "input-password")
	private WebElement passTxt3;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement LoginBtn3;

	public LoginPagePom2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement enterEmail()
	{
		return emailTxt3;
	}
	public WebElement enterPass()
	{
		return passTxt3;
	}
	public void clickLogin()
	{
		LoginBtn3.click();;	
	}
}
