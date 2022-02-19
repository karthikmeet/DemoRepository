package org.pagefactory;

import org.baseutil.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory extends BaseClass{
	
	public LoginPageFactory() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="email")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}
	
	@FindBy(id="pass")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	/*
	 * @FindBys({
	 * 
	 * @FindBy(id="email"),
	 * 
	 * @FindBy(name="email") }) private WebElement usernameAnd;
	 * 
	 * public WebElement getUsernameAnd() { return usernameAnd; }
	 * 
	 * 
	 * 
	 * @FindAll({
	 * 
	 * @FindBy(id="email"),
	 * 
	 * @FindBy(name="emal") }) private WebElement usernameOr;
	 * 
	 * public WebElement getUsernameOr() { return usernameOr; }
	 */
	
	
}

