package com.Input.RegistrationSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Sicheng Zhu
 */
public class DBConnection {
    Connection conn;   
    int studentAcc;
    
    public DBConnection() {        
        try{
            String username = ""; 
            String password = "";
            //数据库连接字符串              
             String url = "jdbc:sqlserver://localhost; DatabaseName=RegistrationSystem";
            "jdbc:microsoft:sqlserver://localhost:1433;DatabaseName="data","sa","123456";
            //加载驱动程序
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //建立连接
             conn = DriverManager.getConnection(url, username, password);            
        } catch(Exception e) {
            e.printStackTrace();
            // Add code snippet below if test this method only
//        } finally {
//            try{
//                conn.close();
//            }catch(Exception e) {
//                e.printStackTrace();
//            }           
        }    
 }       
    
    /**
     * Insert student personal information data into database.
     */
    public void saveStudentInfoTable(String StudtName, String Sex, String StudtLevel) {
        // Initialize stuIDPreStmt to get student ID from database.
        PreparedStatement stuIDPreStmt = null;
        // Initialize stuInfoTableInsertPreStmt to insert data into database.
        PreparedStatement stuInfoTableInsertPreStmt = null;
        
        // Get student ID.
        try{            
            stuIDPreStmt = conn.prepareStatement("select StudentAcc from StudentInfo", 
                                ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);            
            ResultSet inqueryStuInfoTableRS = stuIDPreStmt.executeQuery();            
            inqueryStuInfoTableRS.last();
            
            if(inqueryStuInfoTableRS.getRow() != 0) {
                studentAcc = inqueryStuInfoTableRS.getInt(1);
                studentAcc++;
            } else {
                studentAcc = 1;
            }
            inqueryStuInfoTableRS.close();
                        
//            request.setCharacterEncoding("gb2312");
            String studentID = "" + studentAcc;            
//            String studtName=request.getParameter("StudtName");
//            String sex=request.getParameter("Sex");
//            String level=request.getParameter("Level");        
//            out.print(id);
//            String sql="insert into admin values("+id+",'"+uN+"','"+Pwd+"','"+sex+"')";
//            String studentInforSql="insert into StudentInfo values("+studentID+",'"+getStudtName+"',
//                                                                   '"+getSex+"','"+getLevel+"')";
//            st.executeUpdate(studentInforSql);
            
            // Insert data into database.
            stuInfoTableInsertPreStmt = conn.prepareStatement("insert into StudentInfo values(" + studentID + ",?,?,?)");            
            stuInfoTableInsertPreStmt.setString(1, StudtName);
            stuInfoTableInsertPreStmt.setString(2, Sex);
            stuInfoTableInsertPreStmt.setString(3, StudtLevel);
            stuInfoTableInsertPreStmt.executeUpdate();           
        } catch(Exception e) {            
            e.printStackTrace();            
        } finally {
            try{
                stuIDPreStmt.close();
                stuInfoTableInsertPreStmt.close();
//                conn.close(); // Uncomment when unit testing
            }catch(Exception e) {                
                e.printStackTrace();            
            }
        }
    }
     
    /**
     * Insert student paper information data into database.
     */
    public void savePaperTable(String PaperTitle, String IssueTime, 
                                 String IssuePublicationName, String IssuePublicationNumber) {
        PreparedStatement stuPaperIDPreStmt = null;
        PreparedStatement stuRegIDPreStmt = null;
        PreparedStatement stuPaperTableInsertPreStmt = null;        
        
        try{            
            stuPaperIDPreStmt = conn.prepareStatement("select PaperID from Paper", 
                                ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet inqueryPaperInfoTableRS = stuPaperIDPreStmt.executeQuery();
            inqueryPaperInfoTableRS.last();
            
            int paperID;
            if(inqueryPaperInfoTableRS.getRow() != 0) {
                paperID = inqueryPaperInfoTableRS.getInt(1);
                paperID++;
            }else{
                paperID = 1;
            }
            inqueryPaperInfoTableRS.close();
            
            stuRegIDPreStmt = conn.prepareStatement("select RegistrationID from RegistrationForm", 
                                ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet inqueryRegIDRS = stuRegIDPreStmt.executeQuery();
            inqueryRegIDRS.last();
            
            int fkRegistrationID;
            if(inqueryRegIDRS.getRow() != 0) {
                fkRegistrationID = inqueryRegIDRS.getInt(1);
                fkRegistrationID++;
            }else{
                fkRegistrationID = 1;
            }
            inqueryRegIDRS.close();
        
            String paperNum = ""+paperID;
            String fkRegistrationNum = ""+fkRegistrationID;            
//            String fkRegistrationNum=""+fkPegistrationID;
//            String paperTitle=request.getParameter("PaperTitle");
//            String issueTime=request.getParameter("IssueTime");
//            String issuePublicationName=request.getParameter("IssuePublicationName");
//            String issuePublicationNumber=request.getParameter("IssuePublicationNumber");
//            String paperSql="insert into Paper values("+paperNum+","+registrationNum+",
//                                                      '"+PaperTitle+"','"+IssueTime+"',
//                                                      '"+IssuePublicationName+"',
//                                                      '"+IssuePublicationNumber+"')";
//            st.executeUpdate(paperSql);
                    
            stuPaperTableInsertPreStmt = conn.prepareStatement("insert into Paper values("+paperNum+","+fkRegistrationNum+",?,?,?,?)");
            stuPaperTableInsertPreStmt.setString(1, PaperTitle);
            stuPaperTableInsertPreStmt.setString(2, IssueTime);
            stuPaperTableInsertPreStmt.setString(3, IssuePublicationName);
            stuPaperTableInsertPreStmt.setString(4, IssuePublicationNumber);
            stuPaperTableInsertPreStmt.executeUpdate();
        }catch(Exception e) {
            e.printStackTrace();
        } finally {
            try{
                stuPaperIDPreStmt.close();
                stuRegIDPreStmt.close();
                stuPaperTableInsertPreStmt.close(); 
//                conn.close(); // Uncommenet when unit testing
            }catch(Exception e) {
                e.printStackTrace();
            }
        }                   
    }           
    
    /**
     * Insert student registration information data into database.
     */
    public void saveRegistrationFormTable(String ExamYear, String StudentID, String StudentType, 
                                              String SubjectName, String FirstStageCertificationIssueDate, 
                                              String FirstStageSpeciality, String IssueGovernmentAgency, 
                                              String IssusOrgOfChiefResidentCert, String RegistrationTimes, 
                                              String HospitalName, String DoctorPhone, String GraduationUniversity, 
                                              String GraduationYear, String ChiefResidentMonth, 
                                              String AttendingPhysicianYear, String EmployerForAPOrCurrWithSecCert, 
                                              String StartingEmploymentDate) {
        PreparedStatement regIDPreStmt = null;
        PreparedStatement regInfoTableInsertPreStmt = null;
        
        try {
            regIDPreStmt = conn.prepareStatement("select RegistrationID from RegistrationForm", 
                                ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);            
            ResultSet inqueryRegTableRS = regIDPreStmt.executeQuery();            
            inqueryRegTableRS.last();
                    
            int registrationID;
            if(inqueryRegTableRS.getRow() != 0) {
                registrationID = inqueryRegTableRS.getInt(1);
                registrationID++;
            }else {
                registrationID = 1;
            }
            inqueryRegTableRS.close();        
            
            String registrationNum="" + registrationID;        
            
//            String examYear=request.getParameter("ExamYear");
//            String studentNum=request.getParameter("StudentID");
//            String studentType=request.getParameter("StudentType");
//            String subjectName=request.getParameter("SubjectName");
//            String firstStageCertificationIssueDate=request.getParameter("FirstStageCertificationIssueDate");
//            String firstStageSpeciality=request.getParameter("FirstStageSpeciality");
//            String issueGovernmentAgency=request.getParameter("IssueGovernmentAgency");
//            String issusOrgOfChiefResidentCert=request.getParameter("IssusOrgOfChiefResidentCert");
//            String registrationTimes=request.getParameter("RegistrationTimes");
//            String hospitalName=request.getParameter("HospitalName");
//            String doctorPhone=request.getParameter("DoctorPhone");
//            String graduationUniversity=request.getParameter("GraduationUniversity");
//            String graduationYear=request.getParameter("GraduationYear");
//            String chiefResidentMonth=request.getParameter("ChiefResidentMonth");
//            String attendingPhysicianYear=request.getParameter("AttendingPhysicianYear");
//            String employerForAPOrCurrWithSecCert=request.getParameter("EmployerForAPOrCurrWithSecCert");
//            String startingEmploymentDate=request.getParameter("StartingEmploymentDate");
//            String registrationFormSql="insert into RegistrationForm values("+registrationNum+",
//                                                                            '"+Input.getExamYear+"',
//                                                                            "+Input.getStudentID+",
//                                                                            '"+Input.getStudentType+"',
//                                                                            '"+Input.getSubjectName+"',
//                                                                            '"+Input.getFirstStageCertificationIssueDate+"',
//                                                                            '"+Input.getFirstStageSpeciality+"',
//                                                                            '"+Input.getIssueGovernmentAgency+"',
//                                                                            '"+Input.getIssusOrgOfChiefResidentCert+"',
//                                                                            '"+Input.getRegistrationTimes+"',
//                                                                            '"+Input.getHospitalName()+"',
//                                                                            '"+DoctorPhone+"',
//                                                                            '"+GraduationUniversity+"',
//                                                                            '"+GraduationYear+"',
//                                                                            '"+ChiefResidentMonth+"',
//                                                                            '"+AttendingPhysicianYear+"',
//                                                                            '"+EmployerForAPOrCurrWithSecCert+"',
//                                                                            '"+StartingEmploymentDate+"')";
//            st.executeUpdate(registrationFormSql);
            regInfoTableInsertPreStmt = conn.prepareStatement("insert into RegistrationForm values(" + registrationNum + ",?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            regInfoTableInsertPreStmt.setString(1, ExamYear);
            regInfoTableInsertPreStmt.setString(2, StudentID);
            regInfoTableInsertPreStmt.setString(3, StudentType);
            regInfoTableInsertPreStmt.setString(4, SubjectName);
            regInfoTableInsertPreStmt.setString(5, FirstStageCertificationIssueDate);
            regInfoTableInsertPreStmt.setString(6, FirstStageSpeciality);
            regInfoTableInsertPreStmt.setString(7, IssueGovernmentAgency);
            regInfoTableInsertPreStmt.setString(8, IssusOrgOfChiefResidentCert);
            regInfoTableInsertPreStmt.setString(9, RegistrationTimes);
            regInfoTableInsertPreStmt.setString(10, HospitalName);
            regInfoTableInsertPreStmt.setString(11, DoctorPhone);
            regInfoTableInsertPreStmt.setString(12, GraduationUniversity);
            regInfoTableInsertPreStmt.setString(13, GraduationYear);
            regInfoTableInsertPreStmt.setString(14, ChiefResidentMonth);
            regInfoTableInsertPreStmt.setString(15, AttendingPhysicianYear);
            regInfoTableInsertPreStmt.setString(16, EmployerForAPOrCurrWithSecCert);
            regInfoTableInsertPreStmt.setString(17, StartingEmploymentDate);
            regInfoTableInsertPreStmt.executeUpdate();                                   
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try{
                regIDPreStmt.close();
                regInfoTableInsertPreStmt.close();
                conn.close();
            }catch(Exception e) {                
                e.printStackTrace();            
            }
        }
    }
}
