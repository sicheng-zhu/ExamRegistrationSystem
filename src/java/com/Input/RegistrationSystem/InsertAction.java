package com.Input.RegistrationSystem;

import com.opensymphony.xwork2.ActionSupport;

public class InsertAction extends ActionSupport{    
    private String HospitalName;
    private String ExamYear;
    private String SubjectName;
    private String RegistrationTimes;
    private String StudtName;
    private String Sex;
    private String StudentID;
    private String StudentType;
    private String IssusOrgOfChiefResidentCert;
    private String ChiefResidentMonth;
    private String AttendingPhysicianYear;
    private String DoctorPhone;
    private String StudtLevel;
    private String GraduationYear;
    private String GraduationUniversity;
    private String FirstStageCertificationIssueDate;
    private String FirstStageSpeciality;
    private String IssueGovernmentAgency;
    private String PaperTitle;
    private String IssueTime;
    private String IssuePublicationName;
    private String IssuePublicationNumber;
    private String EmployerForAPOrCurrWithSecCert;
    private String StartingEmploymentDate;

    
    public String getHospitalName() {
        return HospitalName;
    }

    
    public void setHospitalName(String HospitalName) {
        this.HospitalName = HospitalName;
    }


    public String getExamYear() {
        return ExamYear;
    }


    public void setExamYear(String ExamYear) {
        this.ExamYear = ExamYear;
    }

 
    public String getSubjectName() {
        return SubjectName;
    }


    public void setSubjectName(String SubjectName) {
        this.SubjectName = SubjectName;
    }


    public String getRegistrationTimes() {
        return RegistrationTimes;
    }

 
    public void setRegistrationTimes(String RegistrationTimes) {
        this.RegistrationTimes = RegistrationTimes;
    }


    public String getStudtName() {
        return StudtName;
    }

 
    public void setStudtName(String StudtName) {
        this.StudtName = StudtName;
    }


    public String getSex() {
        return Sex;
    }


    public void setSex(String Sex) {
        this.Sex = Sex;
    }

 
    public String getStudentID() {
        return StudentID;
    }

 
    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }


    public String getStudentType() {
        return StudentType;
    }

 
    public void setStudentType(String StudentType) {
        this.StudentType = StudentType;
    }

 
    public String getIssusOrgOfChiefResidentCert() {
        return IssusOrgOfChiefResidentCert;
    }

 
    public void setIssusOrgOfChiefResidentCert(String IssusOrgOfChiefResidentCert) {
        this.IssusOrgOfChiefResidentCert = IssusOrgOfChiefResidentCert;
    }

 
    public String getChiefResidentMonth() {
        return ChiefResidentMonth;
    }

 
    public void setChiefResidentMonth(String ChiefResidentMonth) {
        this.ChiefResidentMonth = ChiefResidentMonth;
    }

 
    public String getAttendingPhysicianYear() {
        return AttendingPhysicianYear;
    }

 
    public void setAttendingPhysicianYear(String AttendingPhysicianYear) {
        this.AttendingPhysicianYear = AttendingPhysicianYear;
    }

 
    public String getDoctorPhone() {
        return DoctorPhone;
    }

 
    public void setDoctorPhone(String DoctorPhone) {
        this.DoctorPhone = DoctorPhone;
    }

 
    public String getStudtLevel() {
        return StudtLevel;
    }

 
    public void setStudtLevel(String Level) {
        this.StudtLevel = Level;
    }

  
    public String getGraduationYear() {
        return GraduationYear;
    }

 
    public void setGraduationYear(String GraduationYear) {
        this.GraduationYear = GraduationYear;
    }


    public String getGraduationUniversity() {
        return GraduationUniversity;
    }


    public void setGraduationUniversity(String GraduationUniversity) {
        this.GraduationUniversity = GraduationUniversity;
    }

 
    public String getFirstStageCertificationIssueDate() {
        return FirstStageCertificationIssueDate;
    }

  
    public void setFirstStageCertificationIssueDate(String FirstStageCertificationIssueDate) {
        this.FirstStageCertificationIssueDate = FirstStageCertificationIssueDate;
    }

 
    public String getFirstStageSpeciality() {
        return FirstStageSpeciality;
    }

 
    public void setFirstStageSpeciality(String FirstStageSpeciality) {
        this.FirstStageSpeciality = FirstStageSpeciality;
    }

 
    public String getIssueGovernmentAgency() {
        return IssueGovernmentAgency;
    }

 
    public void setIssueGovernmentAgency(String IssueGovernmentAgency) {
        this.IssueGovernmentAgency = IssueGovernmentAgency;
    }

  
    public String getPaperTitle() {
        return PaperTitle;
    }

 
    public void setPaperTitle(String PaperTitle) {
        this.PaperTitle = PaperTitle;
    }

 
    public String getIssueTime() {
        return IssueTime;
    }

 
    public void setIssueTime(String IssueTime) {
        this.IssueTime = IssueTime;
    }

 
    public String getIssuePublicationName() {
        return IssuePublicationName;
    }

 
    public void setIssuePublicationName(String IssuePublicationName) {
        this.IssuePublicationName = IssuePublicationName;
    }

  
    public String getIssuePublicationNumber() {
        return IssuePublicationNumber;
    }

 
    public void setIssuePublicationNumber(String IssuePublicationNumber) {
        this.IssuePublicationNumber = IssuePublicationNumber;
    }

 
    public String getEmployerForAPOrCurrWithSecCert() {
        return EmployerForAPOrCurrWithSecCert;
    }

 
    public void setEmployerForAPOrCurrWithSecCert(String EmployerForAPOrCurrWithSecCert) {
        this.EmployerForAPOrCurrWithSecCert = EmployerForAPOrCurrWithSecCert;
    }

 
    public String getStartingEmploymentDate() {
        return StartingEmploymentDate;
    }

 
    public void setStartingEmploymentDate(String StartingEmploymentDate) {
        this.StartingEmploymentDate = StartingEmploymentDate;
    }
    
    public String execute() throws Exception {
        DBConnection db = new DBConnection();       
                
        try{
            db.saveStudentInfoTable(StudtName, Sex, StudtLevel);
            db.savePaperTable(PaperTitle, IssueTime, IssuePublicationName, IssuePublicationNumber);
            db.saveRegistrationFormTable(ExamYear, StudentID, StudentType, SubjectName, FirstStageCertificationIssueDate, 
                                         FirstStageSpeciality, IssueGovernmentAgency, IssusOrgOfChiefResidentCert, RegistrationTimes, 
                                         HospitalName, DoctorPhone, GraduationUniversity, GraduationYear, ChiefResidentMonth, 
                                         AttendingPhysicianYear, EmployerForAPOrCurrWithSecCert, StartingEmploymentDate);
            
//            Uncomment the following lines when implementing unit test
//            db.saveStudentInfoTable("张三", "男", "本科");
//            db.savePaperTable("大纲", "1900-01-01", "出版社","A-1111");
//            db.saveRegistrationFormTable("2000", "A1111", "医师", "导论", "2000-01-01", "牙科", "北京卫生局", "北京第一医院",
//                                         "1", "北京第一医院", "11111111", "北京大学", "1999", "1", "1", "北京第一医院", 
//                                         "2000-01-01");
            return "success";
        }catch(Exception e){
            e.printStackTrace();           
        }
        return "error";
    }
}
