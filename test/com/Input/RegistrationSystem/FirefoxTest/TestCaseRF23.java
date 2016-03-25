package com.Input.RegistrationSystem.FirefoxTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.Input.RegistrationSystem.User;
/**
 * @author Sicheng Zhu
 * This test case validates HospitalName text field.
 */
public class TestCaseRF23 {
	public static void main(String[] args) {                
        System.setProperty("webdriver.firefox.bin", "E:\\Software\\Mozilla firefox\\firefox.exe"); 
        WebDriver driver = new FirefoxDriver();
    	
        driver.manage().deleteAllCookies();
        
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

            User.inputToField(driver, User.getWholeFormTestDataTagName()[0], "�����һҽԺ��������Ժ��");
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

            User.inputToField(driver, User.getWholeFormTestDataTagName()[0], "�����һҽԺ�����һҽԺ�����һҽԺ�����һҽԺ"
                                                            + "�����һҽԺ�����һҽԺ�����һҽԺ�����һҽԺ�����һҽԺ�����һҽԺ"
                                                            + "�����һҽԺ�����һҽԺ�����һҽԺ�����һҽԺ�����һҽԺ�����һҽԺ"
                                                            + "�����һҽԺ");
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[0]);
            Thread.sleep(3000);

            User.inputToField(driver, User.getWholeFormTestDataTagName()[0], "�����һҽԺ");
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
