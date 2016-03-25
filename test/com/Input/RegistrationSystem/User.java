package com.Input.RegistrationSystem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class User {
	private static final String[] wholeFormTestData = {"������һҽԺ", "2000", "����", "1", "����", "��", "A1111", "ҽʦ", "������һҽԺ", 
		                                               "1", "1", "11111111", "����", "1999", "������ѧ", "2000-01-01", "����", 
		                                               "����������", "���", "1900-01-01", "������", "A-1111", "������һҽԺ", 
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
	
	private static final String[] studentInfoTestData = {"����","A1111", "��", "����", "������ѧ", "1999", "ҽʦ", "11111111", 
		                                                 "������һҽԺ", "1", "1", "������һҽԺ", "2000-01-01"};	
	
	private static final String[] studentInfoTestDataTagName = {"StudtName", "StudentID", "Sex", "StudtLevel",
			                                                    "GraduationUniversity", "GraduationYear", "StudentType",
					                                            "DoctorPhone", "HospitalName", "ChiefResidentMonth",
                                                                "AttendingPhysicianYear", "EmployerForAPOrCurrWithSecCert", 
                                                                "StartingEmploymentDate"};
	
	private static final String[] paperInfoTestData = {"���", "1900-01-01", "������","A-1111"};
	
	private static final String[] paperInfoTestDataTagName = {"PaperTitle", "IssueTime", "IssuePublicationName",
			                                                  "IssuePublicationNumber"};
	
	private final String[] registrationFormTestData = {"2000", "A1111", "ҽʦ", "����", "2000-01-01", "����", 
			                                   "����������", "������һҽԺ", "1", "������һҽԺ", "11111111", 
			                                   "������ѧ", "1999", "1", "1", "������һҽԺ", "2000-01-01"};
	
	private final static String[] registrationFormTestDataTagName = {"ExamYear", "StudentID", "StudentType", "SubjectName", 
			                                          "FirstStageCertificationIssueDate", "FirstStageSpeciality", 
                                                      "IssueGovernmentAgency", "IssusOrgOfChiefResidentCert", 
                                                      "RegistrationTimes", "HospitalName", "DoctorPhone", 
                                                      "GraduationUniversity", "GraduationYear", 
                                                      "ChiefResidentMonth", "AttendingPhysicianYear", 
                                                      "EmployerForAPOrCurrWithSecCert", 
                                                      "StartingEmploymentDate"};
	
	private final static String[] examInfoTestData = {"2000", "����", "1"};
	
	private final static String[] examInfoTestDataTagName = {"ExamYear", "SubjectName", "RegistrationTimes"};
	
	private final static String[] firstStageExamInfoTestData = {"2000-01-01", "����", "����������", "������һҽԺ"};
	
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
		WebElement element = driver.findElement(By.xpath("/html/body//input[@value='�ύ']"));
		element.click();
	}
	
	public static void clickClearButton(WebDriver driver) {		
		WebElement element = driver.findElement(By.xpath("/html/body//input[@value='���']"));
		element.click();
	}
	
	public static void clickSaveButton(WebDriver driver) {		
		WebElement element = driver.findElement(By.xpath("/html/body//input[@value='����']"));
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
