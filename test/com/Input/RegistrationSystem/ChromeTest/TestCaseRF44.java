package com.Input.RegistrationSystem.ChromeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.Input.RegistrationSystem.User;
/**
 * @author Sicheng Zhu
 * This test case validates IssuePublicationNumber text field.
 */
public class TestCaseRF44 {
	public static void main(String[] args) {                
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\eclipse\\workspace\\RegistrationSystem\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	
        driver.manage().deleteAllCookies();
        
        try {        	
        	driver.get("http://localhost:8084/RegistrationSystem/RegistrationForm.jsp");
            driver.manage().window().maximize();                               
            Thread.sleep(3000);
            
            for(int i = 0; i < User.getWholeFormTestData().length - 3; i++) 
            	User.inputToField(driver, User.getWholeFormTestDataTagName()[i], User.getWholeFormTestData()[i]);            
            Thread.sleep(3000);
            
            User.inputToField(driver, User.getWholeFormTestDataTagName()[21], "");
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[21]);
            Thread.sleep(3000);

            User.inputToField(driver, User.getWholeFormTestDataTagName()[21], "�ɣӣӣ� 0123-4567");
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[21]);
            Thread.sleep(3000);

            User.inputToField(driver, User.getWholeFormTestDataTagName()[21], "ISSN 0123-4567ISSN 0123-4567");
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[21]);
            Thread.sleep(3000);

            User.inputToField(driver, User.getWholeFormTestDataTagName()[21], "ISSN 0123-4567");
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
