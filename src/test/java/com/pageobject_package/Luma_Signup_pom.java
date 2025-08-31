package com.pageobject_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Luma_Signup_pom {
	
	public static WebDriver driver;
	
	public  Luma_Signup_pom(WebDriver driver){
		
		driver = this.driver;
		PageFactory.initElements(driver,this);
		
	}
	
@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/a")                      
WebElement Signuplink;
	
@FindBy(id="email")
WebElement txtemailaddress;

@FindBy(id="pass")
WebElement txtpassword;

@FindBy(xpath="(//button[@id=\"send2\"])[1]")
WebElement signupbtn;

public void Signuplink() {
	Signuplink.click();
}


public void setEmailaddress(String Emailaddress) {
	txtemailaddress.sendKeys(Emailaddress);
}
public void setPassword(String Password) {
	txtpassword.sendKeys(Password);
}


}
