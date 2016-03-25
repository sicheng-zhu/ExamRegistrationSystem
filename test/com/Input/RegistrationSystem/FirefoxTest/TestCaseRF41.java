package com.Input.RegistrationSystem.FirefoxTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.Input.RegistrationSystem.User;
/**
 * @author Sicheng Zhu
 * This test case validates PaperTitle text field.
 */
public class TestCaseRF41 {
	public static void main(String[] args) {                
        System.setProperty("webdriver.firefox.bin", "E:\\Software\\Mozilla firefox\\firefox.exe"); 
        WebDriver driver = new FirefoxDriver();
    	
        driver.manage().deleteAllCookies();
        
        try {        	
        	driver.get("http://localhost:8084/RegistrationSystem/RegistrationForm.jsp");
            driver.manage().window().maximize();                               
            Thread.sleep(3000);
            
            for(int i = 0; i < User.getWholeFormTestData().length - 6; i++) 
            	User.inputToField(driver, User.getWholeFormTestDataTagName()[i], User.getWholeFormTestData()[i]);            
            Thread.sleep(3000);
            
            User.inputToField(driver, User.getWholeFormTestDataTagName()[18], "");
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[18]);
            Thread.sleep(3000);

            User.inputToField(driver, User.getWholeFormTestDataTagName()[18], "调治亚健康状态是中医学在２１世纪对人类的新贡献");
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[18]);
            Thread.sleep(3000);

            User.inputToField(driver, User.getWholeFormTestDataTagName()[18], "调治亚健康状态是中医学在21世纪对人类的新贡献调治亚健康状态是中医学在21世纪对人类的新贡献"
                + "调治亚健康状态是中医学在21世纪对人类的新贡献调治亚健康状态是中医学在21世纪对人类的新贡献"
                + "调治亚健康状态是中医学在21世纪对人类的新贡献");
            Thread.sleep(1000);            
            User.clickSubmitButton(driver);
            Thread.sleep(3000);
            
            User.clearField(driver, User.getWholeFormTestDataTagName()[18]);
            Thread.sleep(3000);

            User.inputToField(driver, User.getWholeFormTestDataTagName()[18], "21世纪中国精神医学的思考——由《全球疾病负担研究》引发的联想");
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
