package com.Input.RegistrationSystem.FirefoxTest;

import java.util.Calendar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.Input.RegistrationSystem.User;
/**
 * @author Sicheng Zhu
 * This test case validates ExamYear text field.
 */
public class TestCaseRF24 {	
	public static void main(String[] args) {                
        System.setProperty("webdriver.firefox.bin", "E:\\Software\\Mozilla firefox\\firefox.exe"); 
        WebDriver driver = new FirefoxDriver();
    	
        driver.manage().deleteAllCookies();
        
    	Calendar cal = Calendar.getInstance();
    	
        try {        	
        	driver.get("http://localhost:8084/RegistrationSystem/RegistrationForm.jsp");
            driver.manage().window().maximize();                               
            Thread.sleep(3000);
            
            for(int i = 0; i < User.getWholeFormTestData().length - 23; i++) 
            	User.inputToField(driver, User.getWholeFormTestDataTagName()[i], User.getWholeFormTestData()[i]);            
            Thread.sleep(3000);
            
            User.inputToField(driver, User.getWholeFormTestDataTagName()[1], "");
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[1]);
            Thread.sleep(3000);

            User.inputToField(driver, User.getWholeFormTestDataTagName()[1], "£²£°£°£°");
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[1]);
            Thread.sleep(3000);

            User.inputToField(driver, User.getWholeFormTestDataTagName()[1], "200I");
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[1]);
            Thread.sleep(3000);

            User.inputToField(driver, User.getWholeFormTestDataTagName()[1], String.valueOf(cal.get(Calendar.YEAR) + 101));
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[1]);
            Thread.sleep(3000);

            User.inputToField(driver, User.getWholeFormTestDataTagName()[1], String.valueOf(cal.get(Calendar.YEAR) - 200));
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[1]);
            Thread.sleep(3000);

            User.inputToField(driver, User.getWholeFormTestDataTagName()[1], String.valueOf(cal.get(Calendar.YEAR) - 1));
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
