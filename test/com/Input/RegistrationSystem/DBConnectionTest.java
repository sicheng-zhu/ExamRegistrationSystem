package com.Input.RegistrationSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author Sicheng Zhu
 */
public class DBConnectionTest {
    Connection conn; 
//    DBConnectionTest DBC = new DBConnectionTest();
    
    // Connect to database
    public void connectDB() {
        try{
            String username = ""; 
            String password = ""; 
            String url = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=E:\\Software\\NetBeans 7.1.2\\NetBeansProjects\\RegistrationSystem\\web\\RegistrationForm.mdb";             
//             String url = "jdbc:sqlserver://localhost; DatabaseName=RegistrationSystem";
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
//             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url);             
        } catch(Exception e) {
            e.printStackTrace();                
        } 
    }
    
//    @Test
//    public void DBConnectionTest() {
//        DBConnectionTest DBconnTest = new DBConnectionTest();
//        // No exception will be thrown if connection is successful
//        assertNotNull(DBconnTest);
//        assertNotNull(DBconnTest.conn);
//        assertNotNull(DBconnTest.st);
//        
//        try{
//            DBconnTest.conn.close();
//            DBconnTest.st.close();
//        }
//        catch(Exception e) {
//            e.printStackTrace();
//        }
//    }

    /**
     * Test of Database connection, of class DBConnection.
     */
    @Test
    public void testDBConnection() {
        DBConnection DBconn = new DBConnection();
        // No exception will be thrown if connection is successful
        assertNotNull(DBconn);
        assertNotNull(DBconn.conn);   
        try{
            DBconn.conn.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }    

    /**
     * Test of saveStudentInfoTable method, of class DBConnection.
     */
    // 0-9, a-zA-Z, punctuations, Chinese
    //
    // Test cases for studentName
    // setStudtName("0")
    // assertEquals(getStudtName(),input);
    // setStudtName("0")
    // assertEquals(getStudtName(),input);
    // setStudtName("a")
    // assertEquals(getStudtName(),input);
    // setStudtName("A")
    // assertEquals(getStudtName(),input);
    // setStudtName(";")
    // assertEquals(getStudtName(),input);
    // setStudtName("1b")
    // assertEquals(getStudtName(),input);
    // setStudtName("1B")
    // assertEquals(getStudtName(),input);
    // setStudtName("2'")
    // assertEquals(getStudtName(),input);
    // setStudtName("a[")
    // assertEquals(getStudtName(),input);
    // setStudtName("A[")
    // assertEquals(getStudtName(),input);
    // setStudtName("2a]")
    // assertEquals(getStudtName(),input);
    // setStudtName("2A]")
    // assertEquals(getStudtName(),input);
    
    // setStudtName("李")
    // assertEquals(getStudtName(),input);
    // setStudtName("李0")
    // assertEquals(getStudtName(),input);
    // setStudtName("a李")
    // assertEquals(getStudtName(),input);
    // setStudtName("李A")
    // assertEquals(getStudtName(),input);
    // setStudtName(";李")
    // assertEquals(getStudtName(),input);
    // setStudtName("李1b")
    // assertEquals(getStudtName(),input);
    // setStudtName("1李B")
    // assertEquals(getStudtName(),input);
    // setStudtName("2'李")
    // assertEquals(getStudtName(),input);
    // setStudtName("a李[")
    // assertEquals(getStudtName(),input);
    // setStudtName("李A[")
    // assertEquals(getStudtName(),input);
    // setStudtName("2李a]")
    // assertEquals(getStudtName(),input);
    // setStudtName("2A李]")
    // assertEquals(getStudtName(),input);
    // setStudtName("张三")
    // assertEquals(getStudtName(),insert_success);
    // setStudtName("张张张张张张张张张张张张张张张张张张张张")
    // assertEquals(getStudtName(),insert_success);
    // setStudtName("张张张张张张张张张张张张张张张张张张张张张")
    // assertEquals(getStudtName(),input);
    
    /**
     * Test of saveStudentInfoTable method, of class DBConnection.
     * Uncomment the conn.close() in studentInfoTable method when implementing unit test
     */
    @Test
    public void testSaveStudentInfoTable() {        
        // Initialize stuInfoTableTestPreStmt to query database.
        PreparedStatement stuInfoTableTestPreStmt = null;
        // Initialize inqueryTestRS to get result set after each insertion.
        ResultSet inqueryStuInfoTestRS = null;                 
        
        // Test data to check database connectivity.
        String[][] testData = {{"张三", "男", "硕士"},
                               {"张三张三张三张三张三张三张三张三张三张三", "女", "博士"}};  
        
        // Insert test data iteratively.
        for(int i = 0; i < testData.length; i++) {   
            DBConnection insertStuInfo = new DBConnection();
            connectDB();            
            insertStuInfo.saveStudentInfoTable(testData[i][0], testData[i][1], testData[i][2]);            
            
            try{                            
                stuInfoTableTestPreStmt = conn.prepareStatement("select StudtName, Sex, StudtLevel from StudentInfo", 
                                ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                inqueryStuInfoTestRS = stuInfoTableTestPreStmt.executeQuery();                
                inqueryStuInfoTestRS.last();   
                
                // Check if what just tried to be inserted could be found in database
                assertEquals(testData[i][0], inqueryStuInfoTestRS.getString("StudtName"));
                assertEquals(testData[i][1], inqueryStuInfoTestRS.getString("Sex"));
                assertEquals(testData[i][2], inqueryStuInfoTestRS.getString("StudtLevel"));                
            } catch(Exception e) {      
                System.out.println("1");
                e.printStackTrace();                
            } finally {                
                try{
                    inqueryStuInfoTestRS.close();
                    stuInfoTableTestPreStmt.close();
//                    insertStuInfo.conn.close();
                    conn.close();
                }catch(Exception e) {    
                    System.out.println("2");
                    e.printStackTrace();            
                }
            }
        }        
    }

    /**
     * Test of savePaperTable method, of class DBConnection.
     * Uncomment the conn.close() in paperTable method when implementing unit test
     */
    @Test
    public void testSavePaperTable() {                               
        // TODO review the generated test code and remove the default call to fail.       
        PreparedStatement paperInfoTableTestPreStmt = null;
        ResultSet inqueryPaperInfoTestRS = null;            
        
        String[][] testData = {{"大纲", "1900-01-01", "出版社","A-1111"},
                               {"大纲大纲大纲大纲大纲大纲大纲大纲大纲大纲", "2000-01-01", "出版社","A-1111"}};
        for(int i = 0; i < testData.length; i++) {
            DBConnection insertPaperInfo = new DBConnection();
            connectDB();       
            insertPaperInfo.savePaperTable(testData[i][0], testData[i][1], testData[i][2], testData[i][3]);           
        
            try{                            
                paperInfoTableTestPreStmt = conn.prepareStatement("select PaperTitle, IssueTime, IssuePublicationName, IssuePublicationNumber from Paper", 
                                ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                inqueryPaperInfoTestRS = paperInfoTableTestPreStmt.executeQuery();                
                inqueryPaperInfoTestRS.last();   
                
                // Check if what just tried to be inserted could be found in database
                assertEquals(testData[i][0], inqueryPaperInfoTestRS.getString("PaperTitle"));
                assertEquals(testData[i][1], inqueryPaperInfoTestRS.getDate("IssueTime").toString());
                assertEquals(testData[i][2], inqueryPaperInfoTestRS.getString("IssuePublicationName")); 
                assertEquals(testData[i][3], inqueryPaperInfoTestRS.getString("IssuePublicationNumber"));                                                                            
            } catch(Exception e) {    
                System.out.println("3");
                e.printStackTrace();                
            } finally {                
                try{
                    inqueryPaperInfoTestRS.close();
                    paperInfoTableTestPreStmt.close();                
//                insertPaperInfo.conn.close();
                    conn.close();
                }catch(Exception e) { 
                    System.out.println("4");
                    e.printStackTrace();            
                }
            }                
        }
    }
    
    /**
     * Test of saveRegistrationFormTable method, of class DBConnection.
     * Uncomment the conn.close() in registrationFormTable method when implementing unit test
     * 
     */
    @Test
    public void testSaveRegistrationFormTable() {        
        String ExamYear = "2000"; // > current year, not < 100 years ago, not > 100 years later
        String StudentID = "一"; // not > 20 chars
        String StudentType = "一"; // not > 10 chars
        String SubjectName = "一"; // not > 100 chars
        String FirstStageCertificationIssueDate = "2000-01-01"; //  not > current date
        String FirstStageSpeciality = "一"; // not > 20 digits
        String IssueGovernmentAgency = "一"; // not > 100 chars
        String IssusOrgOfChiefResidentCert = "一"; // not > 100 chars
        String RegistrationTimes = "1"; // 2,  not < 1, not > 2
        String HospitalName = "一"; // not > 100 chars
        String DoctorPhone = "11111111"; //1111111111111, only 8 or 13 digits
        String GraduationUniversity = "一"; // not > 20 chars
        String GraduationYear = "1999"; // not < 300 years ago, not current year
        String ChiefResidentMonth = "1"; // not > 1000, not < 0
        String AttendingPhysicianYear = "1"; // not > 300, not < 0
        String EmployerForAPOrCurrWithSecCert = "一"; // not > 100 chars
        String StartingEmploymentDate = "2000-01-01"; // not > current date
        
        ResultSet inqueryRegInfoTestRS = null;
        PreparedStatement regInfoTableTestPreStmt = null;
        
        String testData[][] = {{"2000","A1111","医师","导论","2000-01-01","牙科","北京卫生局","北京第一医院","1",
                                "北京第一医院", "11111111","北京大学", "1999","1","1","北京第一医院","2000-01-01"},
                               {"2001","Q1000","行政主管","概论","2003-01-01","呼吸道","北京卫生局","北京第二医院","2",
                                "北京第二医院", "11111111111","清华大学", "2000","2","2","北京第二医院","2004-01-01"}};
                
        // TODO review the generated test code and remove the default call to fail.
        for(int i = 0; i < testData.length; i++) {
            DBConnection insertRegInfo = new DBConnection();
            connectDB();            
            insertRegInfo.saveRegistrationFormTable(testData[i][0], testData[i][1], testData[i][2], testData[i][3], 
                                                testData[i][4], testData[i][5], testData[i][6], testData[i][7], 
                                                testData[i][8], testData[i][9], testData[i][10], testData[i][11], 
                                                testData[i][12], testData[i][13], testData[i][14], testData[i][15], 
                                                testData[i][16]);            
            
            try{                            
                regInfoTableTestPreStmt = conn.prepareStatement("select ExamYear, StudentID, StudentType, SubjectName, FirstStageCertificationIssueDate, FirstStageSpeciality, IssueGovernmentAgency, IssusOrgOfChiefResidentCert, RegistrationTimes, HospitalName, DoctorPhone, GraduationUniversity, GraduationYear, ChiefResidentMonth, AttendingPhysicianYear, EmployerForAPOrCurrWithSecCert, StartingEmploymentDate from RegistrationForm", 
                        ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                inqueryRegInfoTestRS = regInfoTableTestPreStmt.executeQuery();                
                inqueryRegInfoTestRS.last();   
                
            // Check if what just tried to be inserted could be found in database
                assertEquals(testData[i][0], inqueryRegInfoTestRS.getString("ExamYear"));
                assertEquals(testData[i][1], inqueryRegInfoTestRS.getString("StudentID"));
                assertEquals(testData[i][2], inqueryRegInfoTestRS.getString("StudentType"));
                assertEquals(testData[i][3], inqueryRegInfoTestRS.getString("SubjectName"));
                assertEquals(testData[i][4], inqueryRegInfoTestRS.getDate("FirstStageCertificationIssueDate").toString());
                assertEquals(testData[i][5], inqueryRegInfoTestRS.getString("FirstStageSpeciality"));
                assertEquals(testData[i][6], inqueryRegInfoTestRS.getString("IssueGovernmentAgency"));
                assertEquals(testData[i][7], inqueryRegInfoTestRS.getString("IssusOrgOfChiefResidentCert"));
                assertEquals(testData[i][8], inqueryRegInfoTestRS.getString("RegistrationTimes"));
                assertEquals(testData[i][9], inqueryRegInfoTestRS.getString("HospitalName"));
                assertEquals(testData[i][10], inqueryRegInfoTestRS.getString("DoctorPhone"));
                assertEquals(testData[i][11], inqueryRegInfoTestRS.getString("GraduationUniversity"));
                assertEquals(testData[i][12], inqueryRegInfoTestRS.getString("GraduationYear"));
                assertEquals(testData[i][13], inqueryRegInfoTestRS.getString("ChiefResidentMonth"));
                assertEquals(testData[i][14], inqueryRegInfoTestRS.getString("AttendingPhysicianYear"));
                assertEquals(testData[i][15], inqueryRegInfoTestRS.getString("EmployerForAPOrCurrWithSecCert"));
                assertEquals(testData[i][16], inqueryRegInfoTestRS.getDate("StartingEmploymentDate").toString());
            } catch(Exception e) {  
                System.out.println("5");
                e.printStackTrace();                
            } finally {                
                try{
                    inqueryRegInfoTestRS.close();
                    regInfoTableTestPreStmt.close();
//                    insertRegInfo.conn.close();
                    conn.close();
                }catch(Exception e) {  
                    System.out.println("6");
                    e.printStackTrace();            
                }
            }
        }
    }
}
