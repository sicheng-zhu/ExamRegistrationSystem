package com.Input.RegistrationSystem.ChromeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Input.RegistrationSystem.User;

/**
 * @author Sicheng Zhu
 * This test case tests input -> clear -> input -> clear -> input -> submit
 */
public class TestCaseRF09 {
	public static void main(String[] args) {                
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\eclipse\\workspace\\RegistrationSystem\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	
        driver.manage().deleteAllCookies();
        
        try {        	
        	driver.get("http://localhost:8084/RegistrationSystem/RegistrationForm.jsp");
            driver.manage().window().maximize();                               
            Thread.sleep(3000);
            
            User.inputAllTestData(driver);
            Thread.sleep(3000);
            
            User.clickClearButton(driver);
            Thread.sleep(3000);
            
            User.inputPaperInfoTableTestData(driver);
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
