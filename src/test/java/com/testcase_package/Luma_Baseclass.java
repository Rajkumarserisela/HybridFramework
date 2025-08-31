package com.testcase_package;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.utilities_package.Luma_Readingdata;






public class Luma_Baseclass {
	
public static WebDriver driver;

public Logger log;





 public Luma_Readingdata readingdata = new Luma_Readingdata();
 public String Firstname = readingdata.getFirstname();
 public String Lastname = readingdata.getLastname();
 public  String Emailaddress = readingdata.getEmailaddress();
 public String Password = readingdata.getPassword();
 public String Confirmpassword = readingdata.getConfirmpassword(); 




@BeforeClass
@Parameters({"browser","url"})
public void openApplication(String br, String URL) {
	if(br.equals("chrome")) {
		driver = new ChromeDriver();
	}
	
	else if(br.equals("edge")) {
		driver = new EdgeDriver();
	}
	
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	
	log=Logger.getLogger("Hybridframework");
	PropertyConfigurator.configure("Log4j.properties");
	
	
}
@AfterClass
public void closeApplication() {
	driver.close();
}

}
