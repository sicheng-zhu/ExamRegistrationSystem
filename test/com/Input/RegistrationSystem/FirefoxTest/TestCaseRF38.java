package com.Input.RegistrationSystem.FirefoxTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.Input.RegistrationSystem.User;
/**
 * @author Sicheng Zhu
 * This test case validates FirstStageCertificationIssueDate text field.
 */
public class TestCaseRF38 {
	public static void main(String[] args) {                
        System.setProperty("webdriver.firefox.bin", "E:\\Software\\Mozilla firefox\\firefox.exe"); 
        WebDriver driver = new FirefoxDriver();
    	
        driver.manage().deleteAllCookies();
        
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sDataFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        try {        	
        	driver.get("http://localhost:8084/RegistrationSystem/RegistrationForm.jsp");
            driver.manage().window().maximize();                               
            Thread.sleep(3000);
            
            for(int i = 0; i < User.getWholeFormTestData().length - 9; i++) 
            	User.inputToField(driver, User.getWholeFormTestDataTagName()[i], User.getWholeFormTestData()[i]);            
            Thread.sleep(3000);
            
            User.inputToField(driver, User.getWholeFormTestDataTagName()[15], "");
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[15]);
            Thread.sleep(3000);

            User.inputToField(driver, User.getWholeFormTestDataTagName()[15], "£²£°£°£°£­£°£±£­£°£±");
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[15]);
            Thread.sleep(3000);

            User.inputToField(driver, User.getWholeFormTestDataTagName()[15], "1999-Ja-30");
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[15]);
            Thread.sleep(3000);

            User.inputToField(driver, User.getWholeFormTestDataTagName()[15], "02/04/2011");
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[15]);
            Thread.sleep(3000);

            User.inputToField(driver, User.getWholeFormTestDataTagName()[15], String.valueOf(sDataFormat.format(new Date())));
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[15]);
            Thread.sleep(3000);

            cal.setTime(new Date());
            cal.add(Calendar.DAY_OF_YEAR, + 1);
            Date newDate = cal.getTime();
            User.inputToField(driver, User.getWholeFormTestDataTagName()[15], String.valueOf(sDataFormat.format(newDate)));
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[15]);
            Thread.sleep(3000);

            cal.setTime(new Date());
            cal.add(Calendar.YEAR, - 301);
            newDate = cal.getTime();
            User.inputToField(driver, User.getWholeFormTestDataTagName()[15], String.valueOf(sDataFormat.format(newDate)));
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[15]);
            Thread.sleep(3000);

            cal.setTime(new Date());
            cal.add(Calendar.YEAR, - 1);
            newDate = cal.getTime(); 
            User.inputToField(driver, User.getWholeFormTestDataTagName()[15], String.valueOf(sDataFormat.format(newDate)));
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        	e.printStackTrace();
        } finally {
        	driver.quit();
        }
    }
}
