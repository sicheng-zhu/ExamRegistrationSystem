package com.Input.RegistrationSystem.ChromeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.Input.RegistrationSystem.User;
/**
 * @author Sicheng Zhu
 * This test case validates HospitalName text field.
 */
public class TestCaseRF23 {
	public static void main(String[] args) {                
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\eclipse\\workspace\\RegistrationSystem\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	
//        driver.manage().deleteAllCookies();
        
        try {        	
        	driver.get("http://localhost:8084/RegistrationSystem/RegistrationForm.jsp");
            driver.manage().window().maximize();                               
            Thread.sleep(3000);
            
            User.inputToField(driver, User.getWholeFormTestDataTagName()[0], "");
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[0]);
            Thread.sleep(3000);

            User.inputToField(driver, User.getWholeFormTestDataTagName()[0], "北大第一医院（朝阳分院）");
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[0]);
            Thread.sleep(3000);

            User.inputToField(driver, User.getWholeFormTestDataTagName()[0], "Beijing University First Hospital");
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[0]);
            Thread.sleep(3000);

            User.inputToField(driver, User.getWholeFormTestDataTagName()[0], "北大第一医院北大第一医院北大第一医院北大第一医院"
                                                            + "北大第一医院北大第一医院北大第一医院北大第一医院北大第一医院北大第一医院"
                                                            + "北大第一医院北大第一医院北大第一医院北大第一医院北大第一医院北大第一医院"
                                                            + "北大第一医院");
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[0]);
            Thread.sleep(3000);

            User.inputToField(driver, User.getWholeFormTestDataTagName()[0], "北大第一医院");
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
