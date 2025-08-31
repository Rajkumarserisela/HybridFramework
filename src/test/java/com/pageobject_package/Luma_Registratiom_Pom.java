package com.pageobject_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Luma_Registratiom_Pom {
	
	public static WebDriver driver;
	
	public  Luma_Registratiom_Pom(WebDriver driver)
	{
		Luma_Registratiom_Pom.driver= driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//a[text()='Create an Account'])[1]")
	WebElement createaccountlink;
	
	@FindBy(id="firstname")
	WebElement txtfirstname;
	
	@FindBy(id="lastname")
	WebElement txtlastname;
	
	@FindBy(id="email_address")
	WebElement txtemailaddress;
	
	@FindBy(id="password")
	 WebElement txtpassword;
	
	@FindBy(id="password-confirmation")
	WebElement txtconfirmpassword;
	
	@FindBy(xpath="//button[@class='action submit primary']")
	WebElement buttoncreateaccount;
	
	
	
	public void createaccountlink() {
		createaccountlink.click();
	}
	
	
	public void setFirstname(String Firstname) {
		txtfirstname.sendKeys(Firstname);
		
		}
	
	public void setLastname(String Lastname) {
		txtlastname.sendKeys(Lastname);
	}
	
	public void setEmailaddress(String Emailaddress) {
		txtemailaddress.sendKeys(Emailaddress);
	}
	public void setPassword(String Password) {
		txtpassword.sendKeys(Password);
	}
	
	public void setConfirmpassword(String Confirmpassword) {
		txtconfirmpassword.sendKeys(Confirmpassword);
	}
	
	public void createaccountbtn() {
		buttoncreateaccount.click();
	}
	
}
