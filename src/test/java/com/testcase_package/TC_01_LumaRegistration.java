package com.testcase_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pageobject_package.Luma_Registratiom_Pom;

public class TC_01_LumaRegistration extends Luma_Baseclass{
	
	public static WebDriver driver;
	public Luma_Registratiom_Pom lr;
	
	@Test
	public void Lumaregistration() {
		driver = new ChromeDriver();
		lr = new  Luma_Registratiom_Pom(driver);
	
		lr.createaccountlink();
		log.info("Create account button is clicked successfully");
		lr.setFirstname(Firstname);
		log.info("First name is entered successfully");
		lr.setLastname(Lastname);
		log.info("Last name is entered successfully");
		lr.setEmailaddress(Emailaddress);
		log.info("Email address is entered successfully");
		lr.setPassword(Password);
		log.info("Password is entered successfully");
		lr.setConfirmpassword(Confirmpassword);
		log.info("Confirm password is entered successfully");
		lr.createaccountbtn();
		log.info("Create Button is clicked");
		
	}

}
