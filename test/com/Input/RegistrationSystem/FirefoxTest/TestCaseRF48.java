package com.Input.RegistrationSystem.FirefoxTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.Input.RegistrationSystem.User;
/**
 * @author Sicheng Zhu
 * This test case validates StartingEmploymentDate text field with all inputs are not empty.
 */
public class TestCaseRF48 {
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
            
            for(int i = 0; i < User.getWholeFormTestData().length - 1; i++) 
            	User.inputToField(driver, User.getWholeFormTestDataTagName()[i], User.getWholeFormTestData()[i]);            
            Thread.sleep(3000);                        
            
            User.inputToField(driver, User.getWholeFormTestDataTagName()[23], "2000-Jan-10");
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[23]);
            Thread.sleep(3000);                        
            
            User.inputToField(driver, User.getWholeFormTestDataTagName()[23], "01/31/2000");
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[23]);
            Thread.sleep(3000);
            
            User.inputToField(driver, User.getWholeFormTestDataTagName()[23], sDataFormat.format(new Date()).toString());
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[23]);
            Thread.sleep(3000);
            
            cal.setTime(new Date());
            cal.add(Calendar.DAY_OF_YEAR, + 1);
            Date newDate = cal.getTime();
            User.inputToField(driver, User.getWholeFormTestDataTagName()[23], String.valueOf(sDataFormat.format(newDate)));
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[23]);
            Thread.sleep(3000);
            
            cal.setTime(new Date());
            cal.add(Calendar.YEAR, - 301);
            newDate = cal.getTime();
            User.inputToField(driver, User.getWholeFormTestDataTagName()[23], String.valueOf(sDataFormat.format(newDate)));
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[23]);
            Thread.sleep(3000);
            
            cal.setTime(new Date());
            cal.add(Calendar.YEAR, - 1);
            newDate = cal.getTime();
            User.inputToField(driver, User.getWholeFormTestDataTagName()[23], String.valueOf(sDataFormat.format(newDate)));
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
