package com.testcase_package;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageobject_package.Luma_Signup_pom;

public class TC_02_LumaSignup extends Luma_Baseclass {
	
	public WebDriver driver;

	public Luma_Signup_pom signup;
	
	@Test
	public void LumaSignup() {
		  driver = new ChromeDriver();
		  
	
		  
		  signup = new Luma_Signup_pom(driver);
		  signup.Signuplink();
		  signup.setEmailaddress(Emailaddress);
		  signup.setPassword(Confirmpassword);
	}
	
	

}
