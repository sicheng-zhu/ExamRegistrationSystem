package com.Input.RegistrationSystem.ChromeTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.Input.RegistrationSystem.User;
/**
 * @author Sicheng Zhu
 * This test case validates IssueTime text field.
 */
public class TestCaseRF42 {
	public static void main(String[] args) {                
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\eclipse\\workspace\\RegistrationSystem\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	
        driver.manage().deleteAllCookies();
        
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sDataFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        try {        	
        	driver.get("http://localhost:8084/RegistrationSystem/RegistrationForm.jsp");
            driver.manage().window().maximize();                               
            Thread.sleep(3000);
            
            for(int i = 0; i < User.getWholeFormTestData().length - 5; i++) 
            	User.inputToField(driver, User.getWholeFormTestDataTagName()[i], User.getWholeFormTestData()[i]);            
            Thread.sleep(3000);
            
            User.inputToField(driver, User.getWholeFormTestDataTagName()[19], "");
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[19]);
            Thread.sleep(3000);
            
            User.inputToField(driver, User.getWholeFormTestDataTagName()[19], "£²£°£°£°£­£°£±£­£°£±");
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[19]);
            Thread.sleep(3000);

            User.inputToField(driver, User.getWholeFormTestDataTagName()[19], "2000-Jan-01");
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[19]);
            Thread.sleep(3000);

            User.inputToField(driver, User.getWholeFormTestDataTagName()[19], "01/01/2000");
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[19]);
            Thread.sleep(3000);

            User.inputToField(driver, User.getWholeFormTestDataTagName()[19], sDataFormat.format(new Date()).toString());
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[19]);
            Thread.sleep(3000);

            cal.setTime(new Date());
            cal.add(Calendar.DAY_OF_YEAR, + 1);
            Date newDate = cal.getTime();
            User.inputToField(driver, User.getWholeFormTestDataTagName()[19], String.valueOf(sDataFormat.format(newDate)));
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[19]);
            Thread.sleep(3000);

            cal.setTime(new Date());
            cal.add(Calendar.YEAR, - 301);
            newDate = cal.getTime();
            User.inputToField(driver, User.getWholeFormTestDataTagName()[19], String.valueOf(sDataFormat.format(newDate)));
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[19]);
            Thread.sleep(3000);

            cal.setTime(new Date());
            cal.add(Calendar.YEAR, - 1);
            newDate = cal.getTime();
            User.inputToField(driver, User.getWholeFormTestDataTagName()[19], String.valueOf(sDataFormat.format(newDate)));
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
