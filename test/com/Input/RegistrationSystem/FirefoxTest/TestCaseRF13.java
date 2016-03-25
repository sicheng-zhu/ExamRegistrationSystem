package com.Input.RegistrationSystem.FirefoxTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Input.RegistrationSystem.User;
/**
 * @author Sicheng Zhu
 * This test case tests input -> save -> clear -> input -> save -> clear -> input -> submit
 */
public class TestCaseRF13 {
	public static void main(String[] args) {                
        System.setProperty("webdriver.firefox.bin", "E:\\Software\\Mozilla firefox\\firefox.exe"); 
        WebDriver driver = new FirefoxDriver();
    	
        driver.manage().deleteAllCookies();
        
        try {        	
        	driver.get("http://localhost:8084/RegistrationSystem/RegistrationForm.jsp");
            driver.manage().window().maximize();                               
            Thread.sleep(3000);
            
            User.inputAllTestData(driver);
            Thread.sleep(3000);
            
            User.clickSaveButton(driver);
            Thread.sleep(3000);
            
            User.clickClearButton(driver);
            Thread.sleep(3000);
            
            User.inputExamInfoTableTestData(driver);
            Thread.sleep(3000);

            User.clickSaveButton(driver);
            Thread.sleep(3000);
            
            User.clickClearButton(driver);
            Thread.sleep(3000);
            
            User.inputAllTestData(driver);
            Thread.sleep(3000);
            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        	e.printStackTrace();
        } finally {
        	driver.quit();
        }
    }
}
