package com.utilities_package;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Luma_Readingdata {

    Properties pro;

    public Luma_Readingdata() {
        // Initialize the Properties object and load the file
        pro = new Properties();
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\sailo\\eclipse-workspace\\Hybridframework\\Configuration\\Data.properties"); // Or whatever your file path is
            pro.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getFirstname() {
        return pro.getProperty("firstname");
    }

    public String getLastname() {
        return pro.getProperty("firstname");
    }

    // Add other getter methods for your properties
    public String getEmailaddress() {
        return pro.getProperty("emailaddress");
    }
    
    public String getPassword() {
    	return pro.getProperty("Password");
    }
    
    public String getConfirmpassword() {
    	return pro.getProperty("Confirmpassword");
    }
}