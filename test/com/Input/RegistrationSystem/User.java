package com.Input.RegistrationSystem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class User {
	private static final String[] wholeFormTestData = {"北京第一医院", "2000", "导论", "1", "张三", "男", "A1111", "医师", "北京第一医院", 
		                                               "1", "1", "11111111", "本科", "1999", "北京大学", "2000-01-01", "牙科", 
		                                               "北京卫生局", "大纲", "1900-01-01", "出版社", "A-1111", "北京第一医院", 
		                                               "2000-01-01"};
	
	private static final String[] wholeFormTestDataTagName = {"HospitalName", "ExamYear", "SubjectName", "RegistrationTimes", 
		                                                      "StudtName", "Sex", "StudentID", "StudentType", 
		                                                      "IssusOrgOfChiefResidentCert", "ChiefResidentMonth", 
		                                                      "AttendingPhysicianYear", "DoctorPhone", "StudtLevel", 
			                                                  "GraduationYear", "GraduationUniversity", 
                                                              "FirstStageCertificationIssueDate", "FirstStageSpeciality", 
                                                              "IssueGovernmentAgency", "PaperTitle", "IssueTime", 
                                                              "IssuePublicationName", "IssuePublicationNumber", 
                                                              "EmployerForAPOrCurrWithSecCert", "StartingEmploymentDate"};
	
	private static final String[] studentInfoTestData = {"张三","A1111", "男", "本科", "北京大学", "1999", "医师", "11111111", 
		                                                 "北京第一医院", "1", "1", "北京第一医院", "2000-01-01"};	
	
	private static final String[] studentInfoTestDataTagName = {"StudtName", "StudentID", "Sex", "StudtLevel",
			                                                    "GraduationUniversity", "GraduationYear", "StudentType",
					                                            "DoctorPhone", "HospitalName", "ChiefResidentMonth",
                                                                "AttendingPhysicianYear", "EmployerForAPOrCurrWithSecCert", 
                                                                "StartingEmploymentDate"};
	
	private static final String[] paperInfoTestData = {"大纲", "1900-01-01", "出版社","A-1111"};
	
	private static final String[] paperInfoTestDataTagName = {"PaperTitle", "IssueTime", "IssuePublicationName",
			                                                  "IssuePublicationNumber"};
	
	private final String[] registrationFormTestData = {"2000", "A1111", "医师", "导论", "2000-01-01", "牙科", 
			                                   "北京卫生局", "北京第一医院", "1", "北京第一医院", "11111111", 
			                                   "北京大学", "1999", "1", "1", "北京第一医院", "2000-01-01"};
	
	private final static String[] registrationFormTestDataTagName = {"ExamYear", "StudentID", "StudentType", "SubjectName", 
			                                          "FirstStageCertificationIssueDate", "FirstStageSpeciality", 
                                                      "IssueGovernmentAgency", "IssusOrgOfChiefResidentCert", 
                                                      "RegistrationTimes", "HospitalName", "DoctorPhone", 
                                                      "GraduationUniversity", "GraduationYear", 
                                                      "ChiefResidentMonth", "AttendingPhysicianYear", 
                                                      "EmployerForAPOrCurrWithSecCert", 
                                                      "StartingEmploymentDate"};
	
	private final static String[] examInfoTestData = {"2000", "导论", "1"};
	
	private final static String[] examInfoTestDataTagName = {"ExamYear", "SubjectName", "RegistrationTimes"};
	
	private final static String[] firstStageExamInfoTestData = {"2000-01-01", "牙科", "北京卫生局", "北京第一医院"};
	
	private final static String[] firstStageExamInfoTestDataTagName = {"FirstStageCertificationIssueDate", 
		                                                               "FirstStageSpeciality", "IssueGovernmentAgency", 
		                                                               "IssusOrgOfChiefResidentCert"};
	
	public static void inputAllTestData(WebDriver driver) {			
		WebElement element = null;
			
		for(int i = 0; i < wholeFormTestDataTagName.length; i++) {
			element = driver.findElement(By.xpath("//input[@name='"+wholeFormTestDataTagName[i]+"']"));
			element.sendKeys(wholeFormTestData[i]);
		}			
	}
	
	public static void inputStuInfoTableTestData(WebDriver driver) {			
		WebElement element = null;
			
		for(int i = 0; i < studentInfoTestDataTagName.length; i++) {
			element = driver.findElement(By.xpath("//input[@name='"+studentInfoTestDataTagName[i]+"']"));
			element.sendKeys(studentInfoTestData[i]);
		}			
	}
	
	public static void inputPaperInfoTableTestData(WebDriver driver) {			
		WebElement element = null;
			
		for(int i = 0; i < paperInfoTestDataTagName.length; i++) {
			element = driver.findElement(By.xpath("//input[@name='"+paperInfoTestDataTagName[i]+"']"));
			element.sendKeys(paperInfoTestData[i]);
		}			
	}
	
	public static void inputExamInfoTableTestData(WebDriver driver) {			
		WebElement element = null;
			
		for(int i = 0; i < examInfoTestDataTagName.length; i++) {
			element = driver.findElement(By.xpath("//input[@name='"+examInfoTestDataTagName[i]+"']"));
			element.sendKeys(examInfoTestData[i]);
		}			
	}
	
	public static void inputFirstStageExamInfoTableTestData(WebDriver driver) {			
		WebElement element = null;
			
		for(int i = 0; i < firstStageExamInfoTestDataTagName.length; i++) {
			element = driver.findElement(By.xpath("//input[@name='"+firstStageExamInfoTestDataTagName[i]+"']"));
			element.sendKeys(firstStageExamInfoTestData[i]);
		}			
	}
	
	public static void clickSubmitButton(WebDriver driver) {			
		WebElement element = driver.findElement(By.xpath("/html/body//input[@value='提交']"));
		element.click();
	}
	
	public static void clickClearButton(WebDriver driver) {		
		WebElement element = driver.findElement(By.xpath("/html/body//input[@value='清空']"));
		element.click();
	}
	
	public static void clickSaveButton(WebDriver driver) {		
		WebElement element = driver.findElement(By.xpath("/html/body//input[@value='保存']"));
		element.click();
	}
	
	public static String[] getWholeFormTestData() {
		return wholeFormTestData;
	}
	
	public static String[] getWholeFormTestDataTagName() {
		return wholeFormTestDataTagName;
	}
	
	public static void inputToField(WebDriver driver, String textFieldName, String value) {
		WebElement element = driver.findElement(By.xpath("//input[@name='"+textFieldName+"']"));
		element.sendKeys(value);
	}
	
	public static void clearField(WebDriver driver, String textFieldName) {
		WebElement element = driver.findElement(By.xpath("//input[@name='"+textFieldName+"']"));
		element.clear();
	}
}
