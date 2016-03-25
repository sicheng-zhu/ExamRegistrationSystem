package com.Input.RegistrationSystem;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Sicheng Zhu
 */
public class FormAction extends ActionSupport{    
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
    final String numberReg ="\\d+\\.{0,1}\\d*";    
    final String chineseCharacterReg ="^[\u4e00-\u9fa5]+$";
    final String containsLetterReg =".*[a-zA-Z]+.*";
    final String containsNumbersRegEx = ".*\\d+.*";
    final String containsPuncRegEx = ".*[\\p{Punct}]+.*";//String containsPuncRegEx = ".*[\\pP\\p{Punct}]+.*";
    final String containsFullWidthFormRegEx = ".*[\uFF00-\uFFFF]+.*";
    private Calendar cal = Calendar.getInstance();
    private SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    
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
    
    /**
     * Insert user inputs into database.
     */
    public String insert() throws Exception{
        this.clearErrorsAndMessages();
        
        // Check if user inputs are valid
        
        if(isHospitalNameValid() == false)
            return "input";
        
        //
        if(isExamYearValid() == false)
            return "input";
        
        //
        if(isSubjectNameValid() == false)
            return "input";
        
        //
        if(isRegistrationTimesValid() == false)
            return "input";
        
        //
        if(isStudtNameValid() == false)
            return "input";
        
        //
        if(isSexValid() == false)
            return "input";
        
        //
        if(isStudentIDValid() == false)
            return "input";
        
        //
        if(isStudentTypeValid() == false)
            return "input";
        
        //
        if(isIssusOrgOfChiefResidentCertValid() == false)
            return "input";
        
        //
        if(isChiefResidentMonthValid() == false)
            return "input";
        
        //
        if(isAttendingPhysicianYearValid() == false)
            return "input";
        
        //
        if(isDoctorPhoneValid() == false)
            return "input";
        
        //
        if(isStudtLevelValid() == false)
            return "input";
        
        //
        if(isGraduationYearValid() == false)
            return "input";
        
        //
        if(isGraduationUniversityValid() == false)
            return "input";
        
        //
        if(isFirstStageCertificationIssueDateValid() == false)
            return "input";
        
        //
        if(isFirstStageSpecialityValid() == false)
            return "input";
        
        //
        if(isIssueGovernmentAgencyValid() == false)
            return "input";
        
        //
        if(isPaperTitleValid() == false)
            return "input";
        
        //
        if(isIssueTimeValid() == false)
            return "input";
        
        //
        if(isIssuePublicationNameValid() == false)
            return "input";
        
        //
        if(isIssuePublicationNumberValid() == false)
            return "input";
        
        //
        if(isEmployerForAPOrCurrWithSecCertValid() == false)
            return "input";
        
        if("".equals(EmployerForAPOrCurrWithSecCert))
            setEmployerForAPOrCurrWithSecCert("未填写");
        
        //
        if(isStartingEmploymentDateValid() == false)
            return "input";
        
        if("".equals(StartingEmploymentDate))
            setStartingEmploymentDate("1001-01-01");           
                   
        
        DBConnection db = new DBConnection();       
                
        try{
            db.saveStudentInfoTable(StudtName, Sex, StudtLevel);
            db.savePaperTable(PaperTitle, IssueTime, IssuePublicationName, IssuePublicationNumber);
            db.saveRegistrationFormTable(ExamYear, StudentID, StudentType, SubjectName, 
                                         FirstStageCertificationIssueDate, FirstStageSpeciality, IssueGovernmentAgency, 
                                         IssusOrgOfChiefResidentCert, RegistrationTimes, HospitalName, DoctorPhone, 
                                         GraduationUniversity, GraduationYear, ChiefResidentMonth, AttendingPhysicianYear, 
                                         EmployerForAPOrCurrWithSecCert, StartingEmploymentDate);
            
//             Uncomment the following lines when implementing unit test
//            db.saveStudentInfoTable("张三", "男", "本科");
//            db.savePaperTable("大纲", "1900-01-01", "出版社","A-1111");
//            db.saveRegistrationFormTable("2000", "A1111", "医师", "导论", "2000-01-01", "牙科", "北京卫生局", "北京第一医院",
//                                         "1", "北京第一医院", "11111111", "北京大学", "1999", "1", "1", "北京第一医院", 
//                                         "2000-01-01");
            return "insert_success";
        }catch(Exception e){
            e.printStackTrace();           
        }
        return "insert_error";
    }
    
    /**
     * Start session save.
     */
    public String save() throws Exception{       
        return "save_prepare_success";
    }

    /**
     * Assign value in session to field.
     */
    public String saveSession() throws Exception { 
        try{   
            HospitalName = (String)ActionContext.getContext().getSession().get("HospitalName");
            ExamYear = (String)ActionContext.getContext().getSession().get("ExamYear");
            SubjectName = (String)ActionContext.getContext().getSession().get("SubjectName");
            RegistrationTimes = (String)ActionContext.getContext().getSession().get("RegistrationTimes");
            StudtName = (String)ActionContext.getContext().getSession().get("StudtName");
            Sex = (String)ActionContext.getContext().getSession().get("Sex");
            StudentID = (String)ActionContext.getContext().getSession().get("StudentID");
            StudentType = (String)ActionContext.getContext().getSession().get("StudentType");
            IssusOrgOfChiefResidentCert = (String)ActionContext.getContext().getSession().get("IssusOrgOfChiefResidentCert");
            ChiefResidentMonth = (String)ActionContext.getContext().getSession().get("ChiefResidentMonth");
            AttendingPhysicianYear = (String)ActionContext.getContext().getSession().get("AttendingPhysicianYear");
            DoctorPhone = (String)ActionContext.getContext().getSession().get("DoctorPhone");
            StudtLevel = (String)ActionContext.getContext().getSession().get("StudtLevel");
            GraduationYear = (String)ActionContext.getContext().getSession().get("GraduationYear");
            GraduationUniversity = (String)ActionContext.getContext().getSession().get("GraduationUniversity");
            FirstStageCertificationIssueDate = (String)ActionContext.getContext().getSession().get("FirstStageCertificationIssueDate");
            FirstStageSpeciality = (String)ActionContext.getContext().getSession().get("FirstStageSpeciality");
            IssueGovernmentAgency = (String)ActionContext.getContext().getSession().get("IssueGovernmentAgency");
            PaperTitle = (String)ActionContext.getContext().getSession().get("PaperTitle");
            IssueTime = (String)ActionContext.getContext().getSession().get("IssueTime");
            IssuePublicationName = (String)ActionContext.getContext().getSession().get("IssuePublicationName");
            IssuePublicationNumber = (String)ActionContext.getContext().getSession().get("IssuePublicationNumber");
            EmployerForAPOrCurrWithSecCert = (String)ActionContext.getContext().getSession().get("EmployerForAPOrCurrWithSecCert");
            StartingEmploymentDate = (String)ActionContext.getContext().getSession().get("StartingEmploymentDate");
            
            return "save_success"; 
        }catch(Exception e){ 
            e.printStackTrace(); 
            return "save_error"; 
        } 
     }
    
    public String clear() throws Exception{ 
        ClearAction clearAct = new ClearAction();
        
        if(clearAct.clearAll())
            return "clear_success";
        else
            return "clear_error";        
    }
    
    // Add no whitespace allowed for each input validation at next revision
    // Revise is date validation check for 3 methods at next revision
    /**
     * Check if hospitalName is valid.
     */    
    public boolean isHospitalNameValid() {
        if(HospitalName.equals("")){
            this.addFieldError(HospitalName, "医院名称不能为空");
           return false;
        }
        
        if(isFullWidthForm(HospitalName)){
            this.addFieldError(HospitalName, "医院名称不能为全角");
           return false;
        }
        
        if(HospitalName.matches(containsLetterReg)){
            this.addFieldError(HospitalName, "医院名称不能包含字母");
            return false;
        }
        
        if(HospitalName.length() > 100){
            this.addFieldError(HospitalName, "医院名称不能大于100字符");
            return false;
        }
        
        return true;
    }
    
    /**
     * Check if examYear is valid.
     */
    public boolean isExamYearValid() {
        if(ExamYear.equals("")){
            this.addFieldError(ExamYear, "考试年份不能为空");
            return false;
        }
        
        if(isFullWidthForm(ExamYear)){
            this.addFieldError(ExamYear, "考试年份不能为全角");
            return false;
        }
        
	if(!ExamYear.matches(numberReg)){
            this.addFieldError(ExamYear, "考试年份只能包含数字");
            return false;
        }
                
        if(Integer.parseInt(ExamYear) > cal.get(Calendar.YEAR) + 100 ||
           Integer.parseInt(ExamYear) < cal.get(Calendar.YEAR) - 100){
            this.addFieldError(ExamYear, "考试年份无效");
            return false;
        }
        
        return true;
    }
    
    /**
     * Check if subjectName is valid.
     */
    public boolean isSubjectNameValid() {
        if(SubjectName.equals("")){
            this.addFieldError(SubjectName, "报考专业不能为空");
            return false;
        }
        
        if(isFullWidthForm(SubjectName)){
            this.addFieldError(SubjectName, "报考专业不能为全角");
           return false;
        }
        
        if(SubjectName.length() > 100){
            this.addFieldError(SubjectName, "报考专业不能大于100字符");
            return false;
        }
        
        return true;
    }
    
    /**
     * Check if registrationTimes is valid.
     */
    public boolean isRegistrationTimesValid() {
        if(RegistrationTimes.equals("")){
            this.addFieldError(RegistrationTimes, "报考次数不能为空");
            return false;
        }
        
        if(isFullWidthForm(RegistrationTimes)){
            this.addFieldError(RegistrationTimes, "报考次数不能为全角");
           return false;
        }
        
	if(!RegistrationTimes.matches(numberReg)){
            this.addFieldError(RegistrationTimes, "报名次数只能包含数字");
            return false;
        }
        
        if(Integer.valueOf(RegistrationTimes) > 2){
            this.addFieldError(RegistrationTimes, "报考次数不能多于两次");
            return false;
        }
        
        if(Integer.valueOf(RegistrationTimes) < 1){
            this.addFieldError(RegistrationTimes, "报考次数不能少于一次");
            return false;
        }
        
        return true;
    }
    
    /**
     * Check if studtName is valid.
     */
    public boolean isStudtNameValid() {
        if(StudtName.equals("")){
            this.addFieldError(StudtName, "姓名不能为空");
            return false;
        }
        
        if(isFullWidthForm(StudtName)){
            this.addFieldError(StudtName, "姓名不能为全角");
           return false;
        }
        
        if(StudtName.matches(containsLetterReg)){
            this.addFieldError(StudtName, "姓名不能包含字母");
            return false;
        }
        
        if(hasNumber(StudtName)){
            this.addFieldError(StudtName, "姓名不能包含数字");
           return false;
        }
        
        if(StudtName.length() > 20){
            this.addFieldError(StudtName, "姓名不能多于20字符");
            return false;
        }
        
        return true;
    }
    
    /**
     * Check if sex is valid.
     */
    public boolean isSexValid() {
        if(Sex.equals("")){
            this.addFieldError(Sex, "性别不能为空");
            return false;
        }
        
        if(isFullWidthForm(Sex)){
            this.addFieldError(Sex, "性别不能为全角");
           return false;
        }
        
        if(!Sex.matches(chineseCharacterReg)){
            this.addFieldError(Sex, "性别只能包含汉字");
            return false;
        }
        
        if(!Sex.equals("男") && !Sex.equals("女")){
            this.addFieldError(Sex, "性别只能是男或女");
            return false;
        }
        
        return true;
    }
    
    /**
     * Check if studentID is valid.
     */
    public boolean isStudentIDValid() {
        if(StudentID.equals("")){
            this.addFieldError(StudentID, "学员编号不能为空");
            return false;
        }
        
        if(isFullWidthForm(StudentID)){
            this.addFieldError(StudentID, "学员编号不能为全角");
            return false;
        }
        
        if(StudentID.length() > 20){
            this.addFieldError(StudentID, "学员编号不能大于20字符");
            return false;
        }
        
        return true;
    }
    
    /**
     * Check if studentType is valid.
     */
    public boolean isStudentTypeValid() {
        if(StudentType.equals("")){
            this.addFieldError(StudentType, "学员类型不能为空");
            return false;
        }
        
        if(isFullWidthForm(StudentType)){
            this.addFieldError(StudentType, "学员类型不能为全角");
            return false;
        }
        
        if(StudentType.length() > 10){
            this.addFieldError(StudentType, "学员类型不能大于10字符");
            return false;
        }
        
        return true;
    }
    
    /**
     * Check if issusOrgOfChiefResidentCert is valid.
     */
    public boolean isIssusOrgOfChiefResidentCertValid() {
        if(IssusOrgOfChiefResidentCert.equals("")){
            this.addFieldError(IssusOrgOfChiefResidentCert, "住院医师发证机构不能为空");
            return false;
        }
        
        if(isFullWidthForm(IssusOrgOfChiefResidentCert)){
            this.addFieldError(IssusOrgOfChiefResidentCert, "住院医师发证机构不能为全角");
            return false;
        }
        
        if(IssusOrgOfChiefResidentCert.matches(containsLetterReg)){
            this.addFieldError(IssusOrgOfChiefResidentCert, "住院医师发证机构不能包含字母");
            return false;
        }
        
        if(IssusOrgOfChiefResidentCert.length() > 100){
            this.addFieldError(IssusOrgOfChiefResidentCert, "住院医师发证机构不能大于100字符");
            return false;
        }
        
        return true;
    }
    
    /**
     * Check if chiefResidentMonth is valid.
     */
    public boolean isChiefResidentMonthValid() {
        if(ChiefResidentMonth.equals("")){
            this.addFieldError(ChiefResidentMonth, "总住院医师时间不能为空");
            return false;
        }
        
        if(isFullWidthForm(ChiefResidentMonth)){
            this.addFieldError(ChiefResidentMonth, "总住院医师时间不能为全角");
            return false;
        }
        
        if(!ChiefResidentMonth.matches(numberReg)){
            this.addFieldError(ChiefResidentMonth, "总住院医师时间只能包含数字");
            return false;
        }
        
        if(Integer.valueOf(ChiefResidentMonth) < 0 || Integer.valueOf(ChiefResidentMonth) > 1000){
            this.addFieldError(ChiefResidentMonth, "总住院医师时间不能小于0个月，不能大于1000个月");
            return false;
        }
        
        return true;
    }
    
    /**
     * Check if attendingPhysicianYear is valid.
     */
    public boolean isAttendingPhysicianYearValid() {
        if(AttendingPhysicianYear.equals("")){
            this.addFieldError(AttendingPhysicianYear, "主治医师任职时间不能为空");
            return false;
        }
        
        if(isFullWidthForm(AttendingPhysicianYear)){
            this.addFieldError(AttendingPhysicianYear, "主治医师任职时间不能为全角");
            return false;
        }
        
        if(!AttendingPhysicianYear.matches(numberReg)){
            this.addFieldError(AttendingPhysicianYear, "主治医师任职时间只能包含数字");
            return false;
        }
        
         if(Integer.valueOf(AttendingPhysicianYear) < 0 || Integer.valueOf(AttendingPhysicianYear) > 300){
            this.addFieldError(AttendingPhysicianYear, "主治医师任职时间无效");
            return false;
        }
         
         return true;
    }
    
    
    /**
     * Check if doctorPhone is valid.
     */
    public boolean isDoctorPhoneValid() {
        if(DoctorPhone.equals("")){
            this.addFieldError(DoctorPhone, "联系电话不能为空");
            return false;
        }
        
        if(isFullWidthForm(DoctorPhone)){
            this.addFieldError(DoctorPhone, "联系电话不能为全角");
            return false;
        }
        
        if(!DoctorPhone.matches(numberReg)){
            this.addFieldError(DoctorPhone, "联系电话只能包含数字");
            return false;
        }
        
        if(DoctorPhone.length() != 8 && DoctorPhone.length() != 13){
            this.addFieldError(DoctorPhone, "联系电话只能为8位或13位");
            return false;
        }
        
        return true;
    }
    
    /**
     * Check if studtLevel is valid.
     */
    public boolean isStudtLevelValid() {
        if(StudtLevel.equals("")){
            this.addFieldError(StudtLevel, "学历不能为空");
            return false;
        }
        
        if(isFullWidthForm(StudtLevel)){
            this.addFieldError(StudtLevel, "学历不能为全角");
            return false;
        }
        
        if(!StudtLevel.matches(chineseCharacterReg)){
            this.addFieldError(StudtLevel, "学历只能包含汉字");
            return false;
        }
        
        String degree[] = {"无","小学","初中","高中","本科","硕士","博士"};
        for(int index = 0; index < degree.length + 1; index++) { 
            if(index == degree.length) {
                this.addFieldError(StudtLevel, "学历只能是无,小学,初中,高中,本科,硕士,博士中的一个");
                return false;    
            }
            
            if(StudtLevel.equals(degree[index]))
                break;                       
        }
        
        return true;
    }
    
    /**
     * Check if graduationYear is valid.
     */
    public boolean isGraduationYearValid() {
        if(GraduationYear.equals("")){
            this.addFieldError(GraduationYear, "毕业时间不能为空");
            return false;
        }
        
        if(isFullWidthForm(GraduationYear)){
            this.addFieldError(GraduationYear, "毕业时间不能为全角");
            return false;
        }
        
        if(!GraduationYear.matches(numberReg)){
            this.addFieldError(GraduationYear, "毕业时间只能包含数字");
            return false;
        }
        
        if(Integer.parseInt(GraduationYear) > cal.get(Calendar.YEAR) ||
           Integer.parseInt(GraduationYear) < cal.get(Calendar.YEAR) - 300){
            this.addFieldError(GraduationYear, "毕业年份无效");
            return false;
        }
        
        return true;
    }
    
    /**
     * Check if graduationUniversity is valid.
     */
    public boolean isGraduationUniversityValid() {
        if(GraduationUniversity.equals("")){
            this.addFieldError(GraduationUniversity, "毕业学校不能为空");
            return false;
        }
        
        if(isFullWidthForm(GraduationUniversity)){
            this.addFieldError(GraduationUniversity, "毕业学校不能为全角");
            return false;
        }
        
        if(GraduationUniversity.matches(containsLetterReg)){
            this.addFieldError(GraduationUniversity, "毕业学校不能包含字母");
            return false;
        }
        
        if(GraduationUniversity.length() > 20){
            this.addFieldError(GraduationUniversity, "毕业学校不能大于20字符");
            return false;
        }
        
        return true;
    }
    
    // Add no Chinese allowed at next revision
    /**
     * Check if firstStageCertificationIssueDate is valid.
     */
    public boolean isFirstStageCertificationIssueDateValid() {
        if(FirstStageCertificationIssueDate.equals("")){
            this.addFieldError(FirstStageCertificationIssueDate, "一阶段合格证发放时间不能为空");
            return false;
        }
                
        if(isFullWidthForm(FirstStageCertificationIssueDate)){
            this.addFieldError(FirstStageCertificationIssueDate, "一阶段合格证发放时间不能为全角");
            return false;
        }
        
        if(FirstStageCertificationIssueDate.matches(containsLetterReg)){
            this.addFieldError(FirstStageCertificationIssueDate, "一阶段合格证发放时间不能包含字母");
            return false;
        }  
        
        if(!isValidDate(FirstStageCertificationIssueDate)){
            this.addFieldError(FirstStageCertificationIssueDate, "一阶段合格证发放时间格式应为：YYYY-MM-DD或日期不对");
            return false;
        }    
        
        if(compareDate(FirstStageCertificationIssueDate, getCurrentDate()) != -1){
            this.addFieldError(FirstStageCertificationIssueDate, "一阶段合格证发放时间不能是今天或将来的日期");
            return false;
        }                
        
        if(compareDate(FirstStageCertificationIssueDate, getDateBeforeYears(300, sDateFormat.format(new Date()).toString())) == Integer.MAX_VALUE ||
           compareDate(FirstStageCertificationIssueDate, getDateBeforeYears(300, sDateFormat.format(new Date()).toString())) == Integer.MIN_VALUE){
            this.addFieldError(FirstStageCertificationIssueDate, "技术故障，请联系管理员");
            return false;
        }
                        
        if(compareDate(FirstStageCertificationIssueDate, getDateBeforeYears(300, sDateFormat.format(new Date()).toString())) == -1){
            this.addFieldError(FirstStageCertificationIssueDate, "一阶段合格证发放时间不能是300年以前");
            return false;
        }
        
        return true;
    }
        
    /**
     * Check if firstStageSpeciality is valid.
     */
    public boolean isFirstStageSpecialityValid() {
        if(FirstStageSpeciality.equals("")){
            this.addFieldError(FirstStageSpeciality, "一阶段专业不能为空");
            return false;
        }
        
        if(isFullWidthForm(FirstStageSpeciality)){
            this.addFieldError(FirstStageSpeciality, "一阶段专业不能为全角");
            return false;
        }
        
        if(FirstStageSpeciality.matches(containsLetterReg)){
            this.addFieldError(FirstStageSpeciality, "一阶段专业不能包含字母");
            return false;
        }
        
        if(FirstStageSpeciality.matches(containsNumbersRegEx)){
            this.addFieldError(FirstStageSpeciality, "一阶段专业不能包含数字");
            return false;
        }
        
        if(FirstStageSpeciality.length() > 20){
            this.addFieldError(FirstStageSpeciality, "一阶段专业不能大于20字符");
            return false;
        }
        
        return true;
    }
        
    /**
     * Check if issueGovernmentAgency is valid.
     */
    public boolean isIssueGovernmentAgencyValid() {
        if(IssueGovernmentAgency.equals("")){
            this.addFieldError(IssueGovernmentAgency, "发证单位不能为空");
            return false;
        }
        
        if(isFullWidthForm(IssueGovernmentAgency)){
            this.addFieldError(IssueGovernmentAgency, "发证单位不能为全角");
            return false;
        }
        
        if(!IssueGovernmentAgency.matches(chineseCharacterReg)){
            this.addFieldError(IssueGovernmentAgency, "发证单位只能包含汉字");
            return false;
        }
        
        if(IssueGovernmentAgency.length() > 100){
            this.addFieldError(IssueGovernmentAgency, "发证单位不能大于100字符");
            return false;
        }
        
        return true;
    }
    
    /**
     * Check if paperTitle is valid.
     */
    public boolean isPaperTitleValid() {
        if(PaperTitle.equals("")){
            this.addFieldError(PaperTitle, "论文题目不能为空");
            return false;
        }
        
        if(isFullWidthForm(PaperTitle)){
            this.addFieldError(PaperTitle, "论文题目不能为全角");
            return false;
        }
        
        if(PaperTitle.length() > 100){
            this.addFieldError(PaperTitle, "论文题目不能大于100字符");
            return false;
        }
        
        return true;
    }
    
    // Add no Chinese allowed, at next revision
    /**
     * Check if issueTime is valid.
     */
    public boolean isIssueTimeValid() {
        if(IssueTime.equals("")){
            this.addFieldError(IssueTime, "论文发表时间不能为空");
            return false;
        }
        
        if(isFullWidthForm(IssueTime)){
            this.addFieldError(IssueTime, "论文发表时间不能为全角");
            return false;
        }
        
        if(IssueTime.matches(containsLetterReg)){
            this.addFieldError(IssueTime, "论文发表时间不能包含字母");
            return false;
        }
        
        if(!isValidDate(IssueTime)){
            this.addFieldError(IssueTime, "论文发表时间格式应为：YYYY-MM-DD或日期不对");
            return false;
        }
        
        if(compareDate(IssueTime, getCurrentDate()) != -1){
            this.addFieldError(IssueTime, "论文发表时间不能是今天或将来的日期");
            return false;
        }
        
        if(compareDate(IssueTime, getDateBeforeYears(300, sDateFormat.format(new Date()).toString())) == Integer.MAX_VALUE ||
           compareDate(IssueTime, getDateBeforeYears(300, sDateFormat.format(new Date()).toString())) == Integer.MIN_VALUE){
            this.addFieldError(IssueTime, "技术故障，请联系管理员");
            return false;
        }
        
        if(compareDate(IssueTime, getDateBeforeYears(300, sDateFormat.format(new Date()).toString())) == -1){
            this.addFieldError(IssueTime, "论文发表时间不能是300年以前");
            return false;
        }
        
        return true;
    }
    
    /**
     * Check if issuePublicationName is valid.
     */
    public boolean isIssuePublicationNameValid() {
        if(IssuePublicationName.equals("")){
            this.addFieldError(IssuePublicationName, "刊物名称不能为空");
            return false;
        }
        
        if(isFullWidthForm(IssuePublicationName)){
            this.addFieldError(IssuePublicationName, "刊物名称不能为全角");
            return false;
        }
        
        if(!IssuePublicationName.matches(chineseCharacterReg)){
            this.addFieldError(IssuePublicationName, "刊物名称只能包含汉字");
            return false;
        }
        
        if(IssuePublicationName.length() > 20){
            this.addFieldError(IssuePublicationName, "刊物名称不能多于20字");
            return false;
        }              
        
        return true;
    }
    
    /**
     * Check if issuePublicationNumber is valid.
     */
    // Add no Chinese allowed at next revision
    public boolean isIssuePublicationNumberValid() {
        if(IssuePublicationNumber.equals("")){
            this.addFieldError(IssuePublicationNumber, "刊物号不能为空");
            return false;
        }
        
        if(isFullWidthForm(IssuePublicationNumber)){
            this.addFieldError(IssuePublicationNumber, "刊物号不能为全角");
            return false;
        }
        
        if(IssuePublicationNumber.length() > 20){
            this.addFieldError(IssuePublicationNumber, "刊物号不能大于20字符");
            return false;
        }
        
        return true;
    }
        
    /**
     * Check if employerForAPOrCurrWithSecCert is valid.
     */
    public boolean isEmployerForAPOrCurrWithSecCertValid() {
        if("".equals(EmployerForAPOrCurrWithSecCert))
            return true;
        
        if(isFullWidthForm(EmployerForAPOrCurrWithSecCert)){
            this.addFieldError(EmployerForAPOrCurrWithSecCert, "聘任单位不能为全角");
            return false;
        }
        
        if(EmployerForAPOrCurrWithSecCert.matches(containsLetterReg)){
            this.addFieldError(EmployerForAPOrCurrWithSecCert, "聘任单位不能包含字母");
            return false;
        }
        
        if(EmployerForAPOrCurrWithSecCert.length() > 100){
            this.addFieldError(EmployerForAPOrCurrWithSecCert, "聘任单位不能大于100字符");
            return false;
        }
        
        return true;
    }
    
    // Add no Chinese allowed at next revision
    /**
     * Check if startingEmploymentDate is valid.
     */
    public boolean isStartingEmploymentDateValid() {
        if("".equals(StartingEmploymentDate)) {            
            return true;
        }            
        
        if(StartingEmploymentDate.matches(containsLetterReg)){
            this.addFieldError(StartingEmploymentDate, "聘任时间不能包含字母");
            return false;
        }
        
        if(!isValidDate(StartingEmploymentDate)){
            this.addFieldError(StartingEmploymentDate, "聘任时间格式应为：YYYY-MM-DD或日期不对");
            return false;
        }
        
        if(compareDate(StartingEmploymentDate, getCurrentDate()) != -1){
            this.addFieldError(StartingEmploymentDate, "聘任时间不能是今天或将来的日期");
            return false;
        }
        
        if(compareDate(StartingEmploymentDate, getDateBeforeYears(300, sDateFormat.format(new Date()).toString())) == Integer.MAX_VALUE ||
           compareDate(StartingEmploymentDate, getDateBeforeYears(300, sDateFormat.format(new Date()).toString())) == Integer.MIN_VALUE){
            this.addFieldError(StartingEmploymentDate, "技术故障，请联系管理员");
            return false;
        }
        
        if(compareDate(StartingEmploymentDate, getDateBeforeYears(300, sDateFormat.format(new Date()).toString())) == -1){
            this.addFieldError(StartingEmploymentDate, "聘任时间不能是300年以前");
            return false;
        }
        
        return true;
    }
    
    /**
     * Check if a date is a valid date.
     * Only YYYY-MM-DD is valid
     */ 
    public boolean isValidDate(String date) {
        if ((date == null) || (date.length() != 10)) {
            return false;
        }
        
        if (date.charAt(4) != '-' && date.charAt(7) != '-') {
            return false;
        }
        
        try {            
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            formatter.setLenient(false);
            String tmp = formatter.format(formatter.parse(date));
                
            if (date.equals(tmp)) 
                return true;                   
            else
                return false;
        }
        catch (ParseException e) {
            return false;
        }
    }
    
    /**
     * Compare two dates.
     * If the first argument(date) is earlier than the second, return -1.
     * If the first argument(date) is later than the second, return 1.
     * If the two dates are the same date, return 0.
     */
    public int compareDate(String inputDateString, String currentDateString) {
        if(currentDateString == null)
            return Integer.MAX_VALUE;
        
        DateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
            Date inputDate = dateForm.parse(inputDateString);
            Date currentDate = dateForm.parse(currentDateString);
            
            if (inputDate.getTime() > currentDate.getTime())                  
                return 1;
            else if (inputDate.getTime() < currentDate.getTime())                 
                return -1;
            else 
                return 0;
             
        } catch (Exception exception) {
            return Integer.MIN_VALUE;
        }        
    }
    
    /**
     * Return today's date.
     */
    public String getCurrentDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(new Date()).toString();
    }
    
    /**
     * Return the same date years earlier than this current year.
     */        
    public String getDateBeforeYears(int years, String anyDate) {
        if(years < 0 || years > cal.get(Calendar.YEAR) || !anyDate.equals(sDateFormat.format(new Date()).toString()))
            return null;                
                
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            cal.setTime((new SimpleDateFormat("yyyy-MM-dd")).parse(anyDate));
            cal.add(Calendar.YEAR, - years);
            Date newDate = cal.getTime();
            return String.valueOf(sdf.format(newDate));
        } catch(Exception e) {
            return null;
        }       
    }
    
    /**
     * This function is for test purpose only.
     */
    public String getDateBeforeYearsTest(int years, String anyDate) {
        if(years < 0 || years > cal.get(Calendar.YEAR))
            return null;                
                
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            cal.setTime((new SimpleDateFormat("yyyy-MM-dd")).parse(anyDate));
            cal.add(Calendar.YEAR, - years);
            Date newDate = cal.getTime();
            return String.valueOf(sdf.format(newDate));
        } catch(Exception e) {
            return null;
        }       
    }
    
    /**
     * Check if the argument string contains number.
     * True means contains.
     * False means not contain.
     */
    public boolean hasNumber(String input) {
        if(input == null)
            return false;
        
        Pattern numberPattern = Pattern.compile(containsNumbersRegEx);
        Matcher numberMatcher = numberPattern.matcher(input);
        
        if (numberMatcher.matches())
            return true;
        
        return false;
    }
    
    /**
     * Check if the argument string contains punctuation.
     * True means contains.
     * False means not contain.
     */
    public boolean hasPunctuation(String input) { 
        if(input == null)
            return false;
        
        Pattern punctuationPattern = Pattern.compile(containsPuncRegEx);
        Matcher punctuationMatcher = punctuationPattern.matcher(input);
        
        if (punctuationMatcher.matches())             
            return true;
        
        return false;
    }
    
    /**
     * Check if the argument string is full width form.
     * True means yes.
     * False means no.
     */
    public boolean isFullWidthForm(String input) {    
        if(input == null)
            return false;
        
        if (input.matches(containsFullWidthFormRegEx)) 
            return true;
        
        return false;
    }
}
