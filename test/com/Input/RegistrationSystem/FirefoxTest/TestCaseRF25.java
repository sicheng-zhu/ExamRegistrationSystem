package com.Input.RegistrationSystem.FirefoxTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.Input.RegistrationSystem.User;
/**
 * @author Sicheng Zhu
 * This test case validates SubjectName text field.
 */
public class TestCaseRF25 {
	public static void main(String[] args) {                
        System.setProperty("webdriver.firefox.bin", "E:\\Software\\Mozilla firefox\\firefox.exe"); 
        WebDriver driver = new FirefoxDriver();
    	
        driver.manage().deleteAllCookies();
        
        try {        	
        	driver.get("http://localhost:8084/RegistrationSystem/RegistrationForm.jsp");
            driver.manage().window().maximize();                               
            Thread.sleep(3000);
            
            for(int i = 0; i < User.getWholeFormTestData().length - 22; i++) 
            	User.inputToField(driver, User.getWholeFormTestDataTagName()[i], User.getWholeFormTestData()[i]);            
            Thread.sleep(3000);
            
            User.inputToField(driver, User.getWholeFormTestDataTagName()[2], "");
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[2]);
            Thread.sleep(3000);

            User.inputToField(driver, User.getWholeFormTestDataTagName()[2], "�ٴ�ҽѧ�ۺϵ��ۣ����ࣩ");
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[2]);
            Thread.sleep(3000);

            User.inputToField(driver, User.getWholeFormTestDataTagName()[2], "�ٴ�ҽѧ�ۺϵ����ٴ�ҽѧ�ۺϵ����ٴ�ҽѧ�ۺϵ���"
                + "�ٴ�ҽѧ�ۺϵ����ٴ�ҽѧ�ۺϵ����ٴ�ҽѧ�ۺϵ����ٴ�ҽѧ�ۺϵ����ٴ�ҽѧ�ۺϵ���"
                + "�ٴ�ҽѧ�ۺϵ����ٴ�ҽѧ�ۺϵ����ٴ�ҽѧ�ۺϵ����ٴ�ҽѧ�ۺϵ����ٴ�ҽѧ�ۺϵ���");
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[2]);
            Thread.sleep(3000);

            User.inputToField(driver, User.getWholeFormTestDataTagName()[2], "�ٴ�ҽѧ�ۺϵ���");
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
