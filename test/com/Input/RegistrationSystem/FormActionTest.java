package com.Input.RegistrationSystem;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Sicheng Zhu
 */
public class FormActionTest {
    private Calendar cal = Calendar.getInstance();
    private SimpleDateFormat sDataFormat = new SimpleDateFormat("yyyy-MM-dd");
    
    /**
     * Test of insert method, of class FormAction.
     * Uncomment conn.close() in each method of DBConnection class
     * Mark argument validation checks, and DBConnection classes's methods calls
     * as comment, and uncomment method calls with test data in FormAction class.
     */
    @Test
    public void testInsert() throws Exception {        
        FormAction insertTestInstance = new FormAction();
        String expResult = "insert_success";
        String actResult = insertTestInstance.insert();
        assertEquals(expResult, actResult);        
    }

    /**
     * Test of isHospitalNameValid method, of class FormAction.
     */
    @Test
    public void testIsHospitalNameValid() {
        FormAction hospitalNameTestInstance = new FormAction();
        
        hospitalNameTestInstance.setHospitalName("");
        assertFalse(hospitalNameTestInstance.isHospitalNameValid());
        
        hospitalNameTestInstance.setHospitalName("北大第一医院（朝阳分院）");
        assertFalse(hospitalNameTestInstance.isHospitalNameValid());
        
        hospitalNameTestInstance.setHospitalName("Beijing University First Hospital");
        assertFalse(hospitalNameTestInstance.isHospitalNameValid());
        
        hospitalNameTestInstance.setHospitalName("北大第一医院北大第一医院北大第一医院北大第一医院"
                + "北大第一医院北大第一医院北大第一医院北大第一医院北大第一医院北大第一医院"
                + "北大第一医院北大第一医院北大第一医院北大第一医院北大第一医院北大第一医院"
                + "北大第一医院");
        assertFalse(hospitalNameTestInstance.isHospitalNameValid());
        
        hospitalNameTestInstance.setHospitalName("北大第一医院");
        assertTrue(hospitalNameTestInstance.isHospitalNameValid());                
    }

    /**
     * Test of isExamYearValid method, of class FormAction.
     */
    @Test
    public void testIsExamYearValid() {       
        FormAction examYearTestInstance = new FormAction();        
        
        examYearTestInstance.setExamYear("");
        assertFalse(examYearTestInstance.isExamYearValid());
        
        examYearTestInstance.setExamYear("２０００");
        assertFalse(examYearTestInstance.isExamYearValid());
        
        examYearTestInstance.setExamYear("200I");
        assertFalse(examYearTestInstance.isExamYearValid());
        
        examYearTestInstance.setExamYear(String.valueOf(cal.get(Calendar.YEAR) + 101));
        assertFalse(examYearTestInstance.isExamYearValid());
        
        examYearTestInstance.setExamYear(String.valueOf(cal.get(Calendar.YEAR) - 200));
        assertFalse(examYearTestInstance.isExamYearValid());
        
        examYearTestInstance.setExamYear(String.valueOf(cal.get(Calendar.YEAR) - 1));
        assertTrue(examYearTestInstance.isExamYearValid());
    }

    /**
     * Test of isSubjectNameValid method, of class FormAction.
     */
    @Test
    public void testIsSubjectNameValid() {        
        FormAction subjectNameTestInstance = new FormAction();
        
        subjectNameTestInstance.setSubjectName("");
        assertFalse(subjectNameTestInstance.isSubjectNameValid());
        
        subjectNameTestInstance.setSubjectName("临床医学综合导论（Ａ类）");
        assertFalse(subjectNameTestInstance.isSubjectNameValid());
        
        subjectNameTestInstance.setSubjectName("临床医学综合导论临床医学综合导论临床医学综合导论"
                + "临床医学综合导论临床医学综合导论临床医学综合导论临床医学综合导论临床医学综合导论"
                + "临床医学综合导论临床医学综合导论临床医学综合导论临床医学综合导论临床医学综合导论");
        assertFalse(subjectNameTestInstance.isSubjectNameValid());
        
        subjectNameTestInstance.setSubjectName("临床医学综合导论");
        assertTrue(subjectNameTestInstance.isSubjectNameValid());
    }

    /**
     * Test of isRegistrationTimesValid method, of class FormAction.
     */
    @Test
    public void testIsRegistrationTimesValid() {        
        FormAction registrationTimesTestInstance = new FormAction();
        
        registrationTimesTestInstance.setRegistrationTimes("");
        assertFalse(registrationTimesTestInstance.isRegistrationTimesValid());
        
        registrationTimesTestInstance.setRegistrationTimes("２");
        assertFalse(registrationTimesTestInstance.isRegistrationTimesValid());
        
        registrationTimesTestInstance.setRegistrationTimes("One");
        assertFalse(registrationTimesTestInstance.isRegistrationTimesValid());
        
        registrationTimesTestInstance.setRegistrationTimes("二");
        assertFalse(registrationTimesTestInstance.isRegistrationTimesValid());
        
        registrationTimesTestInstance.setRegistrationTimes("!");
        assertFalse(registrationTimesTestInstance.isRegistrationTimesValid());
        
        registrationTimesTestInstance.setRegistrationTimes("一Two1-");
        assertFalse(registrationTimesTestInstance.isRegistrationTimesValid());
        
        registrationTimesTestInstance.setRegistrationTimes("3");
        assertFalse(registrationTimesTestInstance.isRegistrationTimesValid());
        
        registrationTimesTestInstance.setRegistrationTimes("0");
        assertFalse(registrationTimesTestInstance.isRegistrationTimesValid());
        
        registrationTimesTestInstance.setRegistrationTimes("1");
        assertTrue(registrationTimesTestInstance.isRegistrationTimesValid());
    }

    /**
     * Test of isStudtNameValid method, of class FormAction.
     */
    @Test
    public void testIsStudtNameValid() {
        FormAction studtNameTestInstance = new FormAction();
        
        studtNameTestInstance.setStudtName("");
        assertFalse(studtNameTestInstance.isStudtNameValid());
        
        studtNameTestInstance.setStudtName("张３");
        assertFalse(studtNameTestInstance.isStudtNameValid());
        
        studtNameTestInstance.setStudtName("San Zhang");
        assertFalse(studtNameTestInstance.isStudtNameValid());
        
        studtNameTestInstance.setStudtName("张3");
        assertFalse(studtNameTestInstance.isStudtNameValid());
        
        studtNameTestInstance.setStudtName("司徒君鹏司徒君鹏司徒君鹏司徒君鹏司徒君鹏"
                                           + "司徒君鹏司徒君鹏司徒君鹏司徒君鹏司徒君鹏司徒君鹏");
        assertFalse(studtNameTestInstance.isStudtNameValid());
        
        studtNameTestInstance.setStudtName("司徒君鹏");
        assertTrue(studtNameTestInstance.isStudtNameValid());                       
    }

    /**
     * Test of isSexValid method, of class FormAction.
     */
    @Test
    public void testIsSexValid() {                
        FormAction sexTestInstance = new FormAction();
        
        sexTestInstance.setSex("");
        assertFalse(sexTestInstance.isSexValid());
        
        sexTestInstance.setSex("Ｍ");
        assertFalse(sexTestInstance.isSexValid());
        
        sexTestInstance.setSex("Male");
        assertFalse(sexTestInstance.isSexValid());
        
        sexTestInstance.setSex("保密");
        assertFalse(sexTestInstance.isSexValid());
        
        sexTestInstance.setSex("女");
        assertTrue(sexTestInstance.isSexValid());
    }

    /**
     * Test of isStudentIDValid method, of class FormAction.
     */
    @Test
    public void testIsStudentIDValid() {
        FormAction studentIDTestInstance = new FormAction();
        
        studentIDTestInstance.setStudentID("");
        assertFalse(studentIDTestInstance.isStudentIDValid());
        
        studentIDTestInstance.setStudentID("Ａ－１１１１");
        assertFalse(studentIDTestInstance.isStudentIDValid());
        
        studentIDTestInstance.setStudentID("A-1111111111111111111");
        assertFalse(studentIDTestInstance.isStudentIDValid());
        
        studentIDTestInstance.setStudentID("A-1111");
        assertTrue(studentIDTestInstance.isStudentIDValid());
    }

    /**
     * Test of isStudentTypeValid method, of class FormAction.
     */
    @Test
    public void testIsStudentTypeValid() {
        FormAction studentTypeTestInstance = new FormAction();
        
        studentTypeTestInstance.setStudentType("");
        assertFalse(studentTypeTestInstance.isStudentTypeValid());
        
        studentTypeTestInstance.setStudentType("Ｂ");
        assertFalse(studentTypeTestInstance.isStudentTypeValid());
        
        studentTypeTestInstance.setStudentType("新生(B类)新生(B类)新生(B类)");
        assertFalse(studentTypeTestInstance.isStudentTypeValid());
        
        studentTypeTestInstance.setStudentType("新生(B类)");
        assertTrue(studentTypeTestInstance.isStudentTypeValid());
    }

    /**
     * Test of isIssusOrgOfChiefResidentCertValid method, of class FormAction.
     */
    @Test
    public void testIsIssusOrgOfChiefResidentCertValid() {
        FormAction issusOrgOfChiefResidentCertInstance = new FormAction();
        
        issusOrgOfChiefResidentCertInstance.setIssusOrgOfChiefResidentCert("");
        assertFalse(issusOrgOfChiefResidentCertInstance.isIssusOrgOfChiefResidentCertValid());
        
        issusOrgOfChiefResidentCertInstance.setIssusOrgOfChiefResidentCert("北京大学附属第１医院");
        assertFalse(issusOrgOfChiefResidentCertInstance.isIssusOrgOfChiefResidentCertValid());
        
        issusOrgOfChiefResidentCertInstance.setIssusOrgOfChiefResidentCert("Beijing University First Hospital");
        assertFalse(issusOrgOfChiefResidentCertInstance.isIssusOrgOfChiefResidentCertValid());
        
        issusOrgOfChiefResidentCertInstance.setIssusOrgOfChiefResidentCert("北京大学附属第1医院北京大学附属第1医院"
                + "北京大学附属第1医院北京大学附属第1医院北京大学附属第1医院北京大学附属第1医院北京大学附属第1医院"
                + "北京大学附属第1医院北京大学附属第1医院北京大学附属第1医院北京大学附属第1医院");
        assertFalse(issusOrgOfChiefResidentCertInstance.isIssusOrgOfChiefResidentCertValid());
        
        issusOrgOfChiefResidentCertInstance.setIssusOrgOfChiefResidentCert("北京大学附属第一医院");
        assertTrue(issusOrgOfChiefResidentCertInstance.isIssusOrgOfChiefResidentCertValid());
    }

    /**
     * Test of isChiefResidentMonthValid method, of class FormAction.
     */
    @Test
    public void testIsChiefResidentMonthValid() {
       FormAction chiefResidentMonthInstance = new FormAction();
        
       chiefResidentMonthInstance.setChiefResidentMonth("");
       assertFalse(chiefResidentMonthInstance.isChiefResidentMonthValid());
       
       chiefResidentMonthInstance.setChiefResidentMonth("１");
       assertFalse(chiefResidentMonthInstance.isChiefResidentMonthValid());
       
       chiefResidentMonthInstance.setChiefResidentMonth("One");
       assertFalse(chiefResidentMonthInstance.isChiefResidentMonthValid());
       
       chiefResidentMonthInstance.setChiefResidentMonth("-1");
       assertFalse(chiefResidentMonthInstance.isChiefResidentMonthValid());
       
       chiefResidentMonthInstance.setChiefResidentMonth("1002");
       assertFalse(chiefResidentMonthInstance.isChiefResidentMonthValid());
       
       chiefResidentMonthInstance.setChiefResidentMonth("2");
       assertTrue(chiefResidentMonthInstance.isChiefResidentMonthValid());
    }

    /**
     * Test of isAttendingPhysicianYearValid method, of class FormAction.
     */
    @Test
    public void testIsAttendingPhysicianYearValid() {
        FormAction attendingPhysicianYearInstance = new FormAction();
        
        attendingPhysicianYearInstance.setAttendingPhysicianYear("");
        assertFalse(attendingPhysicianYearInstance.isAttendingPhysicianYearValid());
        
        attendingPhysicianYearInstance.setAttendingPhysicianYear("１");
        assertFalse(attendingPhysicianYearInstance.isAttendingPhysicianYearValid());
        
        attendingPhysicianYearInstance.setAttendingPhysicianYear("Ten");
        assertFalse(attendingPhysicianYearInstance.isAttendingPhysicianYearValid());
        
        attendingPhysicianYearInstance.setAttendingPhysicianYear("一");
        assertFalse(attendingPhysicianYearInstance.isAttendingPhysicianYearValid());
        
        attendingPhysicianYearInstance.setAttendingPhysicianYear("-");
        assertFalse(attendingPhysicianYearInstance.isAttendingPhysicianYearValid());
        
        attendingPhysicianYearInstance.setAttendingPhysicianYear("-1");
        assertFalse(attendingPhysicianYearInstance.isAttendingPhysicianYearValid());
        
        attendingPhysicianYearInstance.setAttendingPhysicianYear("400");
        assertFalse(attendingPhysicianYearInstance.isAttendingPhysicianYearValid());
        
        attendingPhysicianYearInstance.setAttendingPhysicianYear("5");
        assertTrue(attendingPhysicianYearInstance.isAttendingPhysicianYearValid());
    }

    /**
     * Test of isDoctorPhoneValid method, of class FormAction.
     */
    @Test
    public void testIsDoctorPhoneValid() {
        FormAction doctorPhoneInstance = new FormAction();
        
        doctorPhoneInstance.setDoctorPhone("");
        assertFalse(doctorPhoneInstance.isDoctorPhoneValid());
        
        doctorPhoneInstance.setDoctorPhone("２２２２２２２２");
        assertFalse(doctorPhoneInstance.isDoctorPhoneValid());
        
        doctorPhoneInstance.setDoctorPhone("ol23456789101");
        assertFalse(doctorPhoneInstance.isDoctorPhoneValid());
        
        doctorPhoneInstance.setDoctorPhone("(010)11111111");
        assertFalse(doctorPhoneInstance.isDoctorPhoneValid());
        
        doctorPhoneInstance.setDoctorPhone("1111111111");
        assertFalse(doctorPhoneInstance.isDoctorPhoneValid());
        
        doctorPhoneInstance.setDoctorPhone("01234567");
        assertTrue(doctorPhoneInstance.isDoctorPhoneValid());              
    }

    /**
     * Test of isStudtLevelValid method, of class FormAction.
     */
    @Test
    public void testIsStudtLevelValid() {
        FormAction isStudtLevelInstance = new FormAction();
        
        isStudtLevelInstance.setStudtLevel("");
        assertFalse(isStudtLevelInstance.isStudtLevelValid());
        
        isStudtLevelInstance.setStudtLevel("Ｂａｃｈｅｌｏｒ");
        assertFalse(isStudtLevelInstance.isStudtLevelValid());
        
        isStudtLevelInstance.setStudtLevel("Bachelor");
        assertFalse(isStudtLevelInstance.isStudtLevelValid());
        
        isStudtLevelInstance.setStudtLevel("16年级毕业");
        assertFalse(isStudtLevelInstance.isStudtLevelValid());
        
        isStudtLevelInstance.setStudtLevel(".");
        assertFalse(isStudtLevelInstance.isStudtLevelValid());
        
        isStudtLevelInstance.setStudtLevel("学士学位");
        assertFalse(isStudtLevelInstance.isStudtLevelValid());
        
        isStudtLevelInstance.setStudtLevel("硕士");
        assertTrue(isStudtLevelInstance.isStudtLevelValid());
    }

    /**
     * Test of isGraduationYearValid method, of class FormAction.
     */
    @Test
    public void testIsGraduationYearValid() {
        FormAction isGraduationYearInstance = new FormAction();
        
        isGraduationYearInstance.setGraduationYear("");
        assertFalse(isGraduationYearInstance.isGraduationYearValid());
        
        isGraduationYearInstance.setGraduationYear("２０００");
        assertFalse(isGraduationYearInstance.isGraduationYearValid());
        
        isGraduationYearInstance.setGraduationYear("Year two thousand");
        assertFalse(isGraduationYearInstance.isGraduationYearValid());
        
        isGraduationYearInstance.setGraduationYear("二零零零年");
        assertFalse(isGraduationYearInstance.isGraduationYearValid());
        
        isGraduationYearInstance.setGraduationYear("=...");
        assertFalse(isGraduationYearInstance.isGraduationYearValid());
        
        isGraduationYearInstance.setGraduationYear(String.valueOf(cal.get(Calendar.YEAR) + 1));
        assertFalse(isGraduationYearInstance.isGraduationYearValid());
        
        isGraduationYearInstance.setGraduationYear(String.valueOf(cal.get(Calendar.YEAR) - 301));
        assertFalse(isGraduationYearInstance.isGraduationYearValid());
        
        isGraduationYearInstance.setGraduationYear(String.valueOf(cal.get(Calendar.YEAR) - 1));
        assertTrue(isGraduationYearInstance.isGraduationYearValid());
    }

    /**
     * Test of isGraduationUniversityValid method, of class FormAction.
     */
    @Test
    public void testIsGraduationUniversityValid() {
        FormAction isGraduationUniversityInstance = new FormAction();
        
        isGraduationUniversityInstance.setGraduationUniversity("");
        assertFalse(isGraduationUniversityInstance.isGraduationUniversityValid());
        
        isGraduationUniversityInstance.setGraduationUniversity("北京第２外国语大学");
        assertFalse(isGraduationUniversityInstance.isGraduationUniversityValid());
        
        isGraduationUniversityInstance.setGraduationUniversity("Peking University");
        assertFalse(isGraduationUniversityInstance.isGraduationUniversityValid());
        
        isGraduationUniversityInstance.setGraduationUniversity("北京第二外国语大学北京第二外国语大学北京第二外国语大学");
        assertFalse(isGraduationUniversityInstance.isGraduationUniversityValid());
        
        isGraduationUniversityInstance.setGraduationUniversity("北京大学");
        assertTrue(isGraduationUniversityInstance.isGraduationUniversityValid());
    }

    /**
     * Test of isFirstStageCertificationIssueDateValid method, of class FormAction.
     */
    @Test
    public void testIsFirstStageCertificationIssueDateValid() {
        FormAction isFirstStageCertificationIssueDateInstance = new FormAction();
        
        isFirstStageCertificationIssueDateInstance.setFirstStageCertificationIssueDate("");
        assertFalse(isFirstStageCertificationIssueDateInstance.isFirstStageCertificationIssueDateValid());
        
        isFirstStageCertificationIssueDateInstance.setFirstStageCertificationIssueDate("２０００－０１－０１");
        assertFalse(isFirstStageCertificationIssueDateInstance.isFirstStageCertificationIssueDateValid());
        
        isFirstStageCertificationIssueDateInstance.setFirstStageCertificationIssueDate("1999-Ja-30");
        assertFalse(isFirstStageCertificationIssueDateInstance.isFirstStageCertificationIssueDateValid());
        
        isFirstStageCertificationIssueDateInstance.setFirstStageCertificationIssueDate("02/04/2011");
        assertFalse(isFirstStageCertificationIssueDateInstance.isFirstStageCertificationIssueDateValid());            
                        
        isFirstStageCertificationIssueDateInstance.setFirstStageCertificationIssueDate(String.valueOf(sDataFormat.format(new Date())));
        assertFalse(isFirstStageCertificationIssueDateInstance.isFirstStageCertificationIssueDateValid());        
        
        cal.setTime(new Date());
        cal.add(Calendar.DAY_OF_YEAR, + 1);
        Date newDate = cal.getTime();         
        isFirstStageCertificationIssueDateInstance.setFirstStageCertificationIssueDate(String.valueOf(sDataFormat.format(newDate)));
        assertFalse(isFirstStageCertificationIssueDateInstance.isFirstStageCertificationIssueDateValid());
        
        cal.setTime(new Date());
        cal.add(Calendar.YEAR, - 301);
        newDate = cal.getTime();
        isFirstStageCertificationIssueDateInstance.setFirstStageCertificationIssueDate(String.valueOf(sDataFormat.format(newDate)));
        assertFalse(isFirstStageCertificationIssueDateInstance.isFirstStageCertificationIssueDateValid());
        
        cal.setTime(new Date());
        cal.add(Calendar.YEAR, - 1);
        newDate = cal.getTime();                
        isFirstStageCertificationIssueDateInstance.setFirstStageCertificationIssueDate(String.valueOf(sDataFormat.format(newDate)));
        assertTrue(isFirstStageCertificationIssueDateInstance.isFirstStageCertificationIssueDateValid());
    }

    /**
     * Test of isFirstStageSpecialityValid method, of class FormAction.
     */
    @Test
    public void testIsFirstStageSpecialityValid() {
        FormAction isFirstStageSpecialityInstance = new FormAction();
        
        isFirstStageSpecialityInstance.setFirstStageSpeciality("");
        assertFalse(isFirstStageSpecialityInstance.isFirstStageSpecialityValid());
        
        isFirstStageSpecialityInstance.setFirstStageSpeciality("临床医学（助理医师类）");
        assertFalse(isFirstStageSpecialityInstance.isFirstStageSpecialityValid());
        
        isFirstStageSpecialityInstance.setFirstStageSpeciality("Clinical Medicine (For Physician assistant)");
        assertFalse(isFirstStageSpecialityInstance.isFirstStageSpecialityValid());
        
        isFirstStageSpecialityInstance.setFirstStageSpeciality("临床医学(1级)");
        assertFalse(isFirstStageSpecialityInstance.isFirstStageSpecialityValid());
        
        isFirstStageSpecialityInstance.setFirstStageSpeciality("临床医学(助理医师类)临床医学(助理医师类)");
        assertFalse(isFirstStageSpecialityInstance.isFirstStageSpecialityValid());
        
        isFirstStageSpecialityInstance.setFirstStageSpeciality("临床医学(助理医师类)");
        assertTrue(isFirstStageSpecialityInstance.isFirstStageSpecialityValid());
    }

    /**
     * Test of isIssueGovernmentAgencyValid method, of class FormAction.
     */
    @Test
    public void testIsIssueGovernmentAgencyValid() {
        FormAction isIssueGovernmentAgencyInstance = new FormAction();
        
        isIssueGovernmentAgencyInstance.setIssueGovernmentAgency("");
        assertFalse(isIssueGovernmentAgencyInstance.isIssueGovernmentAgencyValid());
        
        isIssueGovernmentAgencyInstance.setIssueGovernmentAgency("Ｂｅｉｊｉｎｇ Xicheng District Health Bureau");
        assertFalse(isIssueGovernmentAgencyInstance.isIssueGovernmentAgencyValid());
        
        isIssueGovernmentAgencyInstance.setIssueGovernmentAgency("Beijing Xicheng District Health Bureau");
        assertFalse(isIssueGovernmentAgencyInstance.isIssueGovernmentAgencyValid());
        
        isIssueGovernmentAgencyInstance.setIssueGovernmentAgency("北京市卫生局(西城分局)");
        assertFalse(isIssueGovernmentAgencyInstance.isIssueGovernmentAgencyValid());
        
        isIssueGovernmentAgencyInstance.setIssueGovernmentAgency("北京市西城区卫生局(护国寺西巷57号)");
        assertFalse(isIssueGovernmentAgencyInstance.isIssueGovernmentAgencyValid());
        
        isIssueGovernmentAgencyInstance.setIssueGovernmentAgency("北京市西城区卫生局北京市西城区卫生局北京市西城区卫生局"
                + "北京市西城区卫生局北京市西城区卫生局北京市西城区卫生局北京市西城区卫生局北京市西城区卫生局北京市西城区卫生局"
                + "北京市西城区卫生局北京市西城区卫生局北京市西城区卫生局");
        assertFalse(isIssueGovernmentAgencyInstance.isIssueGovernmentAgencyValid());
        
        isIssueGovernmentAgencyInstance.setIssueGovernmentAgency("北京市西城区卫生局");
        assertTrue(isIssueGovernmentAgencyInstance.isIssueGovernmentAgencyValid());
    }

    /**
     * Test of isPaperTitleValid method, of class FormAction.
     */
    @Test
    public void testIsPaperTitleValid() {
        FormAction isPaperTitleInstance = new FormAction();
        
        isPaperTitleInstance.setPaperTitle("");
        assertFalse(isPaperTitleInstance.isPaperTitleValid());        
        
        isPaperTitleInstance.setPaperTitle("调治亚健康状态是中医学在２１世纪对人类的新贡献");
        assertFalse(isPaperTitleInstance.isPaperTitleValid());                
        
        isPaperTitleInstance.setPaperTitle("调治亚健康状态是中医学在21世纪对人类的新贡献调治亚健康状态是中医学在21世纪对人类的新贡献"
                + "调治亚健康状态是中医学在21世纪对人类的新贡献调治亚健康状态是中医学在21世纪对人类的新贡献"
                + "调治亚健康状态是中医学在21世纪对人类的新贡献");
        assertFalse(isPaperTitleInstance.isPaperTitleValid());
        
        isPaperTitleInstance.setPaperTitle("21世纪中国精神医学的思考——由《全球疾病负担研究》引发的联想");
        assertTrue(isPaperTitleInstance.isPaperTitleValid());
    }

    /**
     * Test of isIssueTimeValid method, of class FormAction.
     */
    @Test
    public void testIsIssueTimeValid() {
        FormAction isIssueTimeInstance = new FormAction();
        
        isIssueTimeInstance.setIssueTime("");
        assertFalse(isIssueTimeInstance.isIssueTimeValid());
                
        isIssueTimeInstance.setIssueTime("２０００－０１－０１");
        assertFalse(isIssueTimeInstance.isIssueTimeValid());
        
        isIssueTimeInstance.setIssueTime("2000-Jan-01");
        assertFalse(isIssueTimeInstance.isIssueTimeValid());
        
        isIssueTimeInstance.setIssueTime("01/01/2000");
        assertFalse(isIssueTimeInstance.isIssueTimeValid());
        
        isIssueTimeInstance.setIssueTime(sDataFormat.format(new Date()).toString());
        assertFalse(isIssueTimeInstance.isIssueTimeValid());
        
        cal.setTime(new Date());
        cal.add(Calendar.DAY_OF_YEAR, + 1);
        Date newDate = cal.getTime();
        isIssueTimeInstance.setIssueTime(String.valueOf(sDataFormat.format(newDate)));
        assertFalse(isIssueTimeInstance.isIssueTimeValid());
        
        cal.setTime(new Date());
        cal.add(Calendar.YEAR, - 301);
        newDate = cal.getTime();
        isIssueTimeInstance.setIssueTime(String.valueOf(sDataFormat.format(newDate)));
        assertFalse(isIssueTimeInstance.isIssueTimeValid());
        
        cal.setTime(new Date());
        cal.add(Calendar.YEAR, - 1);
        newDate = cal.getTime();
        isIssueTimeInstance.setIssueTime(String.valueOf(sDataFormat.format(newDate)));
        assertTrue(isIssueTimeInstance.isIssueTimeValid());
    }

    /**
     * Test of isIssuePublicationNameValid method, of class FormAction.
     */
    @Test
    public void testIsIssuePublicationNameValid() {
        FormAction isIssuePublicationNameInstance = new FormAction();
        
        isIssuePublicationNameInstance.setIssuePublicationName("");
        assertFalse(isIssuePublicationNameInstance.isIssuePublicationNameValid());
        
        isIssuePublicationNameInstance.setIssuePublicationName("Ｃｈｉｎａ　Ｍａｃｈｉｎｅ　Ｐｒｅｓｓ");
        assertFalse(isIssuePublicationNameInstance.isIssuePublicationNameValid());
        
        isIssuePublicationNameInstance.setIssuePublicationName("China Machine Press");
        assertFalse(isIssuePublicationNameInstance.isIssuePublicationNameValid());
        
        isIssuePublicationNameInstance.setIssuePublicationName("机械工业出版社机械工业出版社机械工业出版社");
        assertFalse(isIssuePublicationNameInstance.isIssuePublicationNameValid());
        
        isIssuePublicationNameInstance.setIssuePublicationName("机械工业出版社");
        assertTrue(isIssuePublicationNameInstance.isIssuePublicationNameValid());
    }

    /**
     * Test of isIssuePublicationNumberValid method, of class FormAction.
     */
    @Test
    public void testIsIssuePublicationNumberValid() {
        FormAction isIssuePublicationNumberInstance = new FormAction();
        
        isIssuePublicationNumberInstance.setIssuePublicationNumber("");
        assertFalse(isIssuePublicationNumberInstance.isIssuePublicationNumberValid());
        
        isIssuePublicationNumberInstance.setIssuePublicationNumber("ＩＳＳＮ 0123-4567");
        assertFalse(isIssuePublicationNumberInstance.isIssuePublicationNumberValid());
        
        isIssuePublicationNumberInstance.setIssuePublicationNumber("ISSN 0123-4567ISSN 0123-4567");
        assertFalse(isIssuePublicationNumberInstance.isIssuePublicationNumberValid());
        
        isIssuePublicationNumberInstance.setIssuePublicationNumber("ISSN 0123-4567");
        assertTrue(isIssuePublicationNumberInstance.isIssuePublicationNumberValid());
    }

    /**
     * Test of isEmployerForAPOrCurrWithSecCertValid method, of class FormAction.
     */
    @Test
    public void testIsEmployerForAPOrCurrWithSecCertValid() {
         FormAction isEmployerForAPOrCurrWithSecCertInstance = new FormAction();
         
         isEmployerForAPOrCurrWithSecCertInstance.setEmployerForAPOrCurrWithSecCert("");
         assertTrue(isEmployerForAPOrCurrWithSecCertInstance.isEmployerForAPOrCurrWithSecCertValid());
        
         isEmployerForAPOrCurrWithSecCertInstance.setEmployerForAPOrCurrWithSecCert("北京大学第１医院");
         assertFalse(isEmployerForAPOrCurrWithSecCertInstance.isEmployerForAPOrCurrWithSecCertValid());
         
         isEmployerForAPOrCurrWithSecCertInstance.setEmployerForAPOrCurrWithSecCert("Peking University First Hospital");
         assertFalse(isEmployerForAPOrCurrWithSecCertInstance.isEmployerForAPOrCurrWithSecCertValid());
         
         isEmployerForAPOrCurrWithSecCertInstance.setEmployerForAPOrCurrWithSecCert("北京大学第1医院北京大学第1医院北京大学第1医院"
                 + "北京大学第1医院北京大学第1医院北京大学第1医院北京大学第1医院北京大学第1医院北京大学第1医院北京大学第1医院北京大学第1医院"
                 + "北京大学第1医院北京大学第1医院");
         assertFalse(isEmployerForAPOrCurrWithSecCertInstance.isEmployerForAPOrCurrWithSecCertValid());
         
         isEmployerForAPOrCurrWithSecCertInstance.setEmployerForAPOrCurrWithSecCert("北京大学第1医院");
         assertTrue(isEmployerForAPOrCurrWithSecCertInstance.isEmployerForAPOrCurrWithSecCertValid());
    }

    /**
     * Test of isStartingEmploymentDateValid method, of class FormAction.
     */
    @Test
    public void testIsStartingEmploymentDateValid() {
        FormAction isStartingEmploymentDateInstance = new FormAction();
        
        isStartingEmploymentDateInstance.setStartingEmploymentDate("");
        assertTrue(isStartingEmploymentDateInstance.isStartingEmploymentDateValid());
        
        isStartingEmploymentDateInstance.setStartingEmploymentDate("2000-Jan-10");
        assertFalse(isStartingEmploymentDateInstance.isStartingEmploymentDateValid());
        
        isStartingEmploymentDateInstance.setStartingEmploymentDate("01/31/2000");
        assertFalse(isStartingEmploymentDateInstance.isStartingEmploymentDateValid());
        
        isStartingEmploymentDateInstance.setStartingEmploymentDate(sDataFormat.format(new Date()).toString());
        assertFalse(isStartingEmploymentDateInstance.isStartingEmploymentDateValid());
        
        cal.setTime(new Date());
        cal.add(Calendar.DAY_OF_YEAR, + 1);
        Date newDate = cal.getTime();
        isStartingEmploymentDateInstance.setStartingEmploymentDate(String.valueOf(sDataFormat.format(newDate)));
        assertFalse(isStartingEmploymentDateInstance.isStartingEmploymentDateValid());
        
        cal.setTime(new Date());
        cal.add(Calendar.YEAR, - 301);
        newDate = cal.getTime();
        isStartingEmploymentDateInstance.setStartingEmploymentDate(String.valueOf(sDataFormat.format(newDate)));
        assertFalse(isStartingEmploymentDateInstance.isStartingEmploymentDateValid());
        
        cal.setTime(new Date());
        cal.add(Calendar.YEAR, - 1);
        newDate = cal.getTime();
        isStartingEmploymentDateInstance.setStartingEmploymentDate(String.valueOf(sDataFormat.format(newDate)));
        assertTrue(isStartingEmploymentDateInstance.isStartingEmploymentDateValid());
    }

    /**
     * Test of isValidDate method, of class FormAction.
     */
    @Test
    public void testIsValidDate() {
        FormAction isValidDateInstance = new FormAction();
        
        String date = null;
        assertFalse(isValidDateInstance.isValidDate(date));
        assertFalse(isValidDateInstance.isValidDate(""));
        assertFalse(isValidDateInstance.isValidDate("20100202"));
        assertFalse(isValidDateInstance.isValidDate("Jan-03-2000"));
        
        assertFalse(isValidDateInstance.isValidDate("2010/01/01"));
        assertFalse(isValidDateInstance.isValidDate("2010-01/01"));
        assertFalse(isValidDateInstance.isValidDate("2010/01-01"));
        
        assertFalse(isValidDateInstance.isValidDate("2010--1--1"));
        assertFalse(isValidDateInstance.isValidDate("2010-o1-o1"));
        assertFalse(isValidDateInstance.isValidDate("2010-零1-零1"));
        
        assertFalse(isValidDateInstance.isValidDate("201o--1--1"));
        assertFalse(isValidDateInstance.isValidDate("2零10--1--1"));
        assertFalse(isValidDateInstance.isValidDate("2o10-零1-零1"));
        assertFalse(isValidDateInstance.isValidDate("2o10--1-零1"));
                
        assertTrue(isValidDateInstance.isValidDate("0110-01-01"));
        assertTrue(isValidDateInstance.isValidDate("2010-01-01"));
        assertTrue(isValidDateInstance.isValidDate("2010-01-21"));        
        assertTrue(isValidDateInstance.isValidDate("0110-11-21"));
        assertTrue(isValidDateInstance.isValidDate("0110-01-21"));
        assertTrue(isValidDateInstance.isValidDate("2010-01-01"));
        assertTrue(isValidDateInstance.isValidDate("0110-11-01"));
        
        assertFalse(isValidDateInstance.isValidDate("2010-01-32"));
        assertFalse(isValidDateInstance.isValidDate("2010-02-29"));
        assertFalse(isValidDateInstance.isValidDate("2012-02-30"));        
        assertFalse(isValidDateInstance.isValidDate("2010-03-32"));
        assertFalse(isValidDateInstance.isValidDate("2010-04-31"));
        assertFalse(isValidDateInstance.isValidDate("2010-05-32"));
        assertFalse(isValidDateInstance.isValidDate("2010-06-31"));
        assertFalse(isValidDateInstance.isValidDate("2010-07-32"));
        assertFalse(isValidDateInstance.isValidDate("2010-08-32"));
        assertFalse(isValidDateInstance.isValidDate("2010-09-31"));        
        assertFalse(isValidDateInstance.isValidDate("2010-10-32"));
        assertFalse(isValidDateInstance.isValidDate("2010-11-31"));
        assertFalse(isValidDateInstance.isValidDate("2010-12-32"));
        assertFalse(isValidDateInstance.isValidDate("2010-13-01"));
        
        assertTrue(isValidDateInstance.isValidDate("2010-09-09"));
    }

    /**
     * Test of compareDate method, of class FormAction.
     */
    @Test
    public void testCompareDate() {
        FormAction compareDateInstance = new FormAction();
        
        assertEquals(compareDateInstance.compareDate("1999-12-31", "2000-01-01"), -1);
        assertEquals(compareDateInstance.compareDate("2000-01-01", "2000-01-01"), 0);
        assertEquals(compareDateInstance.compareDate("2000-01-02", "2000-01-01"), 1);
        
        assertEquals(compareDateInstance.compareDate("2009-12-31", "2010-01-01"), -1);
        assertEquals(compareDateInstance.compareDate("2010-01-01", "2010-01-01"), 0);
        assertEquals(compareDateInstance.compareDate("2010-01-02", "2010-01-01"), 1);
        
        assertEquals(compareDateInstance.compareDate("2010-01-31", "2010-02-01"), -1);
        assertEquals(compareDateInstance.compareDate("2010-02-01", "2010-02-01"), 0);
        assertEquals(compareDateInstance.compareDate("2010-02-02", "2010-02-01"), 1);
        
        assertEquals(compareDateInstance.compareDate("2008-02-29", "2008-03-01"), -1);
        assertEquals(compareDateInstance.compareDate("2008-03-01", "2008-03-01"), 0);
        assertEquals(compareDateInstance.compareDate("2008-03-02", "2008-03-01"), 1);
        
        assertEquals(compareDateInstance.compareDate("2010-02-28", "2010-03-01"), -1);
        assertEquals(compareDateInstance.compareDate("2010-03-01", "2010-03-01"), 0);
        assertEquals(compareDateInstance.compareDate("2010-03-02", "2010-03-01"), 1);
        
        assertEquals(compareDateInstance.compareDate("2010-03-31", "2010-04-01"), -1);
        assertEquals(compareDateInstance.compareDate("2010-04-01", "2010-04-01"), 0);
        assertEquals(compareDateInstance.compareDate("2010-04-02", "2010-04-01"), 1);
        
        assertEquals(compareDateInstance.compareDate("2010-04-30", "2010-05-01"), -1);
        assertEquals(compareDateInstance.compareDate("2010-05-01", "2010-05-01"), 0);
        assertEquals(compareDateInstance.compareDate("2010-05-02", "2010-05-01"), 1);
        
        assertEquals(compareDateInstance.compareDate("2010-05-31", "2010-06-01"), -1);
        assertEquals(compareDateInstance.compareDate("2010-06-01", "2010-06-01"), 0);
        assertEquals(compareDateInstance.compareDate("2010-06-02", "2010-06-01"), 1);
        
        assertEquals(compareDateInstance.compareDate("2010-06-30", "2010-07-01"), -1);
        assertEquals(compareDateInstance.compareDate("2010-07-01", "2010-07-01"), 0);
        assertEquals(compareDateInstance.compareDate("2010-07-02", "2010-07-01"), 1);
        
        assertEquals(compareDateInstance.compareDate("2010-07-31", "2010-08-01"), -1);
        assertEquals(compareDateInstance.compareDate("2010-08-01", "2010-08-01"), 0);
        assertEquals(compareDateInstance.compareDate("2010-08-02", "2010-08-01"), 1);
        
        assertEquals(compareDateInstance.compareDate("2010-08-31", "2010-09-01"), -1);
        assertEquals(compareDateInstance.compareDate("2010-09-01", "2010-09-01"), 0);
        assertEquals(compareDateInstance.compareDate("2010-09-02", "2010-09-01"), 1);
        
        assertEquals(compareDateInstance.compareDate("2010-09-30", "2010-10-01"), -1);
        assertEquals(compareDateInstance.compareDate("2010-10-01", "2010-10-01"), 0);
        assertEquals(compareDateInstance.compareDate("2010-10-02", "2010-10-01"), 1);
        
        assertEquals(compareDateInstance.compareDate("2010-10-31", "2010-11-01"), -1);
        assertEquals(compareDateInstance.compareDate("2010-11-01", "2010-11-01"), 0);
        assertEquals(compareDateInstance.compareDate("2010-11-02", "2010-11-01"), 1);
        
        assertEquals(compareDateInstance.compareDate("2010-11-30", "2010-12-01"), -1);
        assertEquals(compareDateInstance.compareDate("2010-12-01", "2010-12-01"), 0);
        assertEquals(compareDateInstance.compareDate("2010-12-02", "2010-12-01"), 1); 
        
        assertEquals(compareDateInstance.compareDate("2010-11-30", null), Integer.MAX_VALUE);
        
        assertEquals(compareDateInstance.compareDate("2010-12-01", ""), Integer.MIN_VALUE);
        
        assertEquals(compareDateInstance.compareDate("2010-06-05", "2010-06-06"), -1);
        assertEquals(compareDateInstance.compareDate("2010-06-06", "2010-06-06"), 0);
        assertEquals(compareDateInstance.compareDate("2010-06-07", "2010-06-06"), 1);
    }

    /**
     * Test of getCurrentDate method, of class FormAction.
     */
    @Test
    public void testGetCurrentDate() {
        FormAction getCurrentDateInstance = new FormAction();
        
        cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, 1);        

        assertEquals(new SimpleDateFormat("yyyy-MM-dd").format(new Date()).toString(), getCurrentDateInstance.getCurrentDate());
        assertThat(new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()).toString(), not(equalTo(getCurrentDateInstance.getCurrentDate())));
    }
    
    /**
     * Test of getDateBeforeYears method, of class FormAction.
     */
    @Test
    public void testGetDateBeforeYears() {
        FormAction getDateBeforeYearsInstance = new FormAction();
        
        cal = Calendar.getInstance();        
        cal.add(Calendar.YEAR, -1);        
        Calendar currentYearCalendar = Calendar.getInstance();
        Calendar newCalendarForCalculation = Calendar.getInstance();
        
        assertEquals(new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()).toString(), 
                     getDateBeforeYearsInstance.getDateBeforeYears(1, new SimpleDateFormat("yyyy-MM-dd").format(currentYearCalendar.getTime()).toString()));                
                
        newCalendarForCalculation.add(Calendar.DAY_OF_YEAR, 1);
        assertEquals(null,getDateBeforeYearsInstance.getDateBeforeYears(-1, "1999-12-31"));
        assertEquals(null,getDateBeforeYearsInstance.getDateBeforeYears(cal.get(Calendar.YEAR) + 1, "1999-12-31"));
        assertEquals(null,getDateBeforeYearsInstance.getDateBeforeYears(1, new SimpleDateFormat("yyyy-MM-dd").format(newCalendarForCalculation.getTime()).toString()));
        assertEquals(null,getDateBeforeYearsInstance.getDateBeforeYears(-1, new SimpleDateFormat("yyyy-MM-dd").format(newCalendarForCalculation.getTime()).toString()));
        assertEquals(null,getDateBeforeYearsInstance.getDateBeforeYears(cal.get(Calendar.YEAR), new SimpleDateFormat("yyyy-MM-dd").format(newCalendarForCalculation.getTime()).toString()));
        
        assertEquals("1998-12-31",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "1999-12-31"));
        assertEquals("1999-01-01",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2000-01-01"));
        
        assertEquals("1999-01-31",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2000-01-31"));
        assertEquals("1999-02-01",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2000-02-01"));
        
        assertEquals("1999-02-28",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2000-02-28"));
        assertEquals("1999-03-01",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2000-03-01"));        
        
        assertEquals("2001-02-28",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2002-02-28"));               
        assertEquals("2001-03-01",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2002-02-29"));
        assertEquals("2001-03-01",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2002-03-01"));
        
        assertEquals("1999-03-31",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2000-03-31"));
        assertEquals("1999-04-01",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2000-04-01"));
        
        assertEquals("1999-04-30",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2000-04-30"));
        assertEquals("1999-05-01",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2000-05-01"));
        
        assertEquals("1999-05-31",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2000-05-31"));
        assertEquals("1999-06-01",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2000-06-01"));
        
        assertEquals("1999-06-30",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2000-06-30"));
        assertEquals("1999-07-01",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2000-07-01"));
        
        assertEquals("1999-07-31",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2000-07-31"));
        assertEquals("1999-08-01",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2000-08-01"));
        
        assertEquals("1999-08-31",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2000-08-31"));
        assertEquals("1999-09-01",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2000-09-01"));
        
        assertEquals("1999-09-30",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2000-09-30"));
        assertEquals("1999-10-01",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2000-10-01"));
        
        assertEquals("1999-10-31",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2000-10-31"));
        assertEquals("1999-11-01",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2000-11-01"));
        
        assertEquals("1999-11-30",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2000-11-30"));
        assertEquals("1999-12-01",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2000-12-01"));
        
        assertEquals("1999-12-31",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2000-12-31"));
        assertEquals("2000-01-01",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2001-01-01"));
        
        assertEquals("2003-06-06",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2004-06-06"));
        assertEquals("2003-06-07",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2004-06-07"));
        
        assertThat("1001-01-01",not(equalTo(getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "10020101"))));
        assertThat("1001-01-01",not(equalTo(getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "1002/01/01"))));
        assertThat("1001-01-01",not(equalTo(getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "1002-0101"))));
        assertThat("1001-01-01",not(equalTo(getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "100201-01"))));
        assertThat("1001-01-01",not(equalTo(getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "1002-01+01"))));
        assertThat("1001-01-01",not(equalTo(getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "1002/01-01"))));
        
        
        assertThat("1-01-01",not(equalTo(getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2-01-01"))));
        assertThat("11-01-01",not(equalTo(getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "12-01-01"))));
        assertThat("111-01-01",not(equalTo(getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "112-01-01"))));
        assertThat("0-01-01",not(equalTo(getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "1-01-01"))));
        assertThat("1-01-01",not(equalTo(getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "2-01-01"))));
        assertThat("01-01-01",not(equalTo(getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "02-01-01"))));
        assertThat("001-01-01",not(equalTo(getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "002-01-01"))));
        assertEquals("0001-01-01",getDateBeforeYearsInstance.getDateBeforeYearsTest(1, "0002-01-01"));
    }
    
    /**
     * Test of hasNumber method, of class FormAction.
     */
    @Test
    public void testHasNumber() {
        FormAction hasNumberInstance = new FormAction();
        
        assertFalse(hasNumberInstance.hasNumber(null));
        assertFalse(hasNumberInstance.hasNumber(""));       
        assertFalse(hasNumberInstance.hasNumber(" "));
        assertFalse(hasNumberInstance.hasNumber("a"));
        assertFalse(hasNumberInstance.hasNumber("-"));
        assertFalse(hasNumberInstance.hasNumber("数"));
        assertFalse(hasNumberInstance.hasNumber("１"));        
        assertFalse(hasNumberInstance.hasNumber("a "));
        assertFalse(hasNumberInstance.hasNumber(" -"));
        assertFalse(hasNumberInstance.hasNumber("数 "));
        assertFalse(hasNumberInstance.hasNumber("１ "));
        assertFalse(hasNumberInstance.hasNumber("b+"));
        assertFalse(hasNumberInstance.hasNumber("b数"));
        assertFalse(hasNumberInstance.hasNumber("b１"));
        assertFalse(hasNumberInstance.hasNumber("+数"));
        assertFalse(hasNumberInstance.hasNumber("+１"));
        assertFalse(hasNumberInstance.hasNumber("数１"));       
        assertFalse(hasNumberInstance.hasNumber("b +"));
        assertFalse(hasNumberInstance.hasNumber(" b数"));
        assertFalse(hasNumberInstance.hasNumber(" b１"));
        assertFalse(hasNumberInstance.hasNumber("+ 数"));
        assertFalse(hasNumberInstance.hasNumber("+ １"));
        assertFalse(hasNumberInstance.hasNumber("数 １"));
        assertFalse(hasNumberInstance.hasNumber("b+数"));
        assertFalse(hasNumberInstance.hasNumber("b+１"));
        assertFalse(hasNumberInstance.hasNumber("１+数"));        
        assertFalse(hasNumberInstance.hasNumber("b+ 数"));
        assertFalse(hasNumberInstance.hasNumber("b+ １"));
        assertFalse(hasNumberInstance.hasNumber("b数 １"));
        assertFalse(hasNumberInstance.hasNumber("+数 １"));
        assertFalse(hasNumberInstance.hasNumber("+数b１"));
        assertFalse(hasNumberInstance.hasNumber("+数 b１"));
        
        assertTrue(hasNumberInstance.hasNumber("4"));
        assertTrue(hasNumberInstance.hasNumber("4 "));
        assertTrue(hasNumberInstance.hasNumber("c4"));
        assertTrue(hasNumberInstance.hasNumber("4="));
        assertTrue(hasNumberInstance.hasNumber("数4字"));
        assertTrue(hasNumberInstance.hasNumber("１4"));        
        assertTrue(hasNumberInstance.hasNumber("4 c"));
        assertTrue(hasNumberInstance.hasNumber("=4 "));
        assertTrue(hasNumberInstance.hasNumber(" 数4字"));
        assertTrue(hasNumberInstance.hasNumber("１4 "));
        assertTrue(hasNumberInstance.hasNumber("c4="));        
        assertTrue(hasNumberInstance.hasNumber("c数4字"));
        assertTrue(hasNumberInstance.hasNumber("c4１"));               
        assertTrue(hasNumberInstance.hasNumber("=数4字")); 
        assertTrue(hasNumberInstance.hasNumber("=１4")); 
        assertTrue(hasNumberInstance.hasNumber("数字１4"));       
        assertTrue(hasNumberInstance.hasNumber("=c4 "));
        assertTrue(hasNumberInstance.hasNumber("数4字c "));
        assertTrue(hasNumberInstance.hasNumber("１4c "));
        assertTrue(hasNumberInstance.hasNumber(" =数4字")); 
        assertTrue(hasNumberInstance.hasNumber(" =１4"));
        assertTrue(hasNumberInstance.hasNumber(" 数字１4"));
        assertTrue(hasNumberInstance.hasNumber("c数字=4"));
        assertTrue(hasNumberInstance.hasNumber("c１=4"));
        assertTrue(hasNumberInstance.hasNumber("c１数字4"));
        assertTrue(hasNumberInstance.hasNumber("=１数字4"));                       
        assertTrue(hasNumberInstance.hasNumber(" 数c4字="));  
        assertTrue(hasNumberInstance.hasNumber(" c4=１"));
        assertTrue(hasNumberInstance.hasNumber(" 数c4字１"));
        assertTrue(hasNumberInstance.hasNumber(" 数=4字１"));
        assertTrue(hasNumberInstance.hasNumber("c数=4字１"));        
        assertTrue(hasNumberInstance.hasNumber("c=１数4 字")); 
    }
    
    /**
     * Test of hasPunctuation method, of class FormAction.
     */
    @Test
    public void testHasPunctuation() {
        FormAction hasPunctuationInstance = new FormAction();
        
        assertFalse(hasPunctuationInstance.hasPunctuation(null));
        assertFalse(hasPunctuationInstance.hasPunctuation(""));
        
        assertFalse(hasPunctuationInstance.hasPunctuation(" "));
        assertFalse(hasPunctuationInstance.hasPunctuation("a"));
        assertFalse(hasPunctuationInstance.hasPunctuation("9"));
        assertFalse(hasPunctuationInstance.hasPunctuation("标"));
        assertFalse(hasPunctuationInstance.hasPunctuation("？"));
        
        assertFalse(hasPunctuationInstance.hasPunctuation(" a"));
        assertFalse(hasPunctuationInstance.hasPunctuation("9 "));
        assertFalse(hasPunctuationInstance.hasPunctuation("标 "));
        assertFalse(hasPunctuationInstance.hasPunctuation(" ？"));
        assertFalse(hasPunctuationInstance.hasPunctuation("a9"));
        assertFalse(hasPunctuationInstance.hasPunctuation("标a"));
        assertFalse(hasPunctuationInstance.hasPunctuation("a？"));
        assertFalse(hasPunctuationInstance.hasPunctuation("9标"));
        assertFalse(hasPunctuationInstance.hasPunctuation("9？"));
        assertFalse(hasPunctuationInstance.hasPunctuation("标？"));
        
        assertFalse(hasPunctuationInstance.hasPunctuation("a 9"));
        assertFalse(hasPunctuationInstance.hasPunctuation(" a标"));
        assertFalse(hasPunctuationInstance.hasPunctuation("？a "));
        assertFalse(hasPunctuationInstance.hasPunctuation("9 标"));
        assertFalse(hasPunctuationInstance.hasPunctuation(" 9？"));
        assertFalse(hasPunctuationInstance.hasPunctuation(" 标？"));
        assertFalse(hasPunctuationInstance.hasPunctuation("标a9"));
        assertFalse(hasPunctuationInstance.hasPunctuation("a9？"));
        assertFalse(hasPunctuationInstance.hasPunctuation("标a？"));
        assertFalse(hasPunctuationInstance.hasPunctuation("？9标"));
        
        assertFalse(hasPunctuationInstance.hasPunctuation(" a9标"));
        assertFalse(hasPunctuationInstance.hasPunctuation("9 a？"));
        assertFalse(hasPunctuationInstance.hasPunctuation(" a标？"));
        assertFalse(hasPunctuationInstance.hasPunctuation("9 标？"));
        assertFalse(hasPunctuationInstance.hasPunctuation("？9a标"));
        
        assertFalse(hasPunctuationInstance.hasPunctuation("a 9？标"));
        
        
        assertTrue(hasPunctuationInstance.hasPunctuation("?"));
        assertTrue(hasPunctuationInstance.hasPunctuation(" ?"));
        assertTrue(hasPunctuationInstance.hasPunctuation("?a"));
        assertTrue(hasPunctuationInstance.hasPunctuation("9?"));
        assertTrue(hasPunctuationInstance.hasPunctuation("?标"));
        assertTrue(hasPunctuationInstance.hasPunctuation("？?"));
        
        assertTrue(hasPunctuationInstance.hasPunctuation(" ?a"));
        assertTrue(hasPunctuationInstance.hasPunctuation("?9 "));
        assertTrue(hasPunctuationInstance.hasPunctuation("标? "));
        assertTrue(hasPunctuationInstance.hasPunctuation("? ？"));
        assertTrue(hasPunctuationInstance.hasPunctuation("a?9"));
        assertTrue(hasPunctuationInstance.hasPunctuation("?标a"));
        assertTrue(hasPunctuationInstance.hasPunctuation("a？?"));
        assertTrue(hasPunctuationInstance.hasPunctuation("9标?"));
        assertTrue(hasPunctuationInstance.hasPunctuation("9?？"));
        assertTrue(hasPunctuationInstance.hasPunctuation("?标？"));
        
        assertTrue(hasPunctuationInstance.hasPunctuation("a? 9"));
        assertTrue(hasPunctuationInstance.hasPunctuation(" ?a标"));
        assertTrue(hasPunctuationInstance.hasPunctuation("？a? "));
        assertTrue(hasPunctuationInstance.hasPunctuation("9 ?标"));
        assertTrue(hasPunctuationInstance.hasPunctuation("? 9？"));
        assertTrue(hasPunctuationInstance.hasPunctuation("? 标？"));
        assertTrue(hasPunctuationInstance.hasPunctuation("标a?9"));
        assertTrue(hasPunctuationInstance.hasPunctuation("a9？?"));
        assertTrue(hasPunctuationInstance.hasPunctuation("标?a？"));
        assertTrue(hasPunctuationInstance.hasPunctuation("？?9标"));
        
        assertTrue(hasPunctuationInstance.hasPunctuation(" a9?标"));
        assertTrue(hasPunctuationInstance.hasPunctuation("9? a？"));
        assertTrue(hasPunctuationInstance.hasPunctuation("? a标？"));
        assertTrue(hasPunctuationInstance.hasPunctuation("9 标?？"));
        assertTrue(hasPunctuationInstance.hasPunctuation("？9a?标"));
        
        assertTrue(hasPunctuationInstance.hasPunctuation("?a 9？标"));
    }
    
    /**
     * Test of isFullWidthForm method, of class FormAction.
     */
    @Test
    public void testIsFullWidthForm() {
        FormAction isFullWidthFormInstance = new FormAction();
        
        assertFalse(isFullWidthFormInstance.isFullWidthForm(null));
        assertFalse(isFullWidthFormInstance.isFullWidthForm(""));
        
        assertFalse(isFullWidthFormInstance.isFullWidthForm(" "));
        assertFalse(isFullWidthFormInstance.isFullWidthForm("b"));
        assertFalse(isFullWidthFormInstance.isFullWidthForm("1"));
        assertFalse(isFullWidthFormInstance.isFullWidthForm("标"));
        assertFalse(isFullWidthFormInstance.isFullWidthForm("?"));
        
        assertFalse(isFullWidthFormInstance.isFullWidthForm(" b"));
        assertFalse(isFullWidthFormInstance.isFullWidthForm("1 "));
        assertFalse(isFullWidthFormInstance.isFullWidthForm(" 标"));
        assertFalse(isFullWidthFormInstance.isFullWidthForm("? "));
        assertFalse(isFullWidthFormInstance.isFullWidthForm("b1"));
        assertFalse(isFullWidthFormInstance.isFullWidthForm("标b"));
        assertFalse(isFullWidthFormInstance.isFullWidthForm("b?"));
        assertFalse(isFullWidthFormInstance.isFullWidthForm("标1"));
        assertFalse(isFullWidthFormInstance.isFullWidthForm("?1"));
        assertFalse(isFullWidthFormInstance.isFullWidthForm("标?"));
        
        assertFalse(isFullWidthFormInstance.isFullWidthForm("b 1"));
        assertFalse(isFullWidthFormInstance.isFullWidthForm(" b标"));
        assertFalse(isFullWidthFormInstance.isFullWidthForm("?b "));
        assertFalse(isFullWidthFormInstance.isFullWidthForm("标 1"));
        assertFalse(isFullWidthFormInstance.isFullWidthForm(" ?1"));
        assertFalse(isFullWidthFormInstance.isFullWidthForm(" 标?"));
        assertFalse(isFullWidthFormInstance.isFullWidthForm("b1标"));
        assertFalse(isFullWidthFormInstance.isFullWidthForm("1?b"));
        assertFalse(isFullWidthFormInstance.isFullWidthForm("b标?"));
        assertFalse(isFullWidthFormInstance.isFullWidthForm("标?1"));
        
        assertFalse(isFullWidthFormInstance.isFullWidthForm(" b1标"));
        assertFalse(isFullWidthFormInstance.isFullWidthForm("b 1?"));
        assertFalse(isFullWidthFormInstance.isFullWidthForm("b 标?"));
        assertFalse(isFullWidthFormInstance.isFullWidthForm("?1标 "));
        assertFalse(isFullWidthFormInstance.isFullWidthForm("?标1b"));
        
        assertFalse(isFullWidthFormInstance.isFullWidthForm("1标 b?"));
        
        
        assertTrue(isFullWidthFormInstance.isFullWidthForm("？"));
        assertTrue(isFullWidthFormInstance.isFullWidthForm("？ "));
        assertTrue(isFullWidthFormInstance.isFullWidthForm("b？"));
        assertTrue(isFullWidthFormInstance.isFullWidthForm("？1"));
        assertTrue(isFullWidthFormInstance.isFullWidthForm("？标"));
        assertTrue(isFullWidthFormInstance.isFullWidthForm("?？"));
        
        assertTrue(isFullWidthFormInstance.isFullWidthForm("？ b"));
        assertTrue(isFullWidthFormInstance.isFullWidthForm("1 ？"));
        assertTrue(isFullWidthFormInstance.isFullWidthForm("？ 标"));
        assertTrue(isFullWidthFormInstance.isFullWidthForm("? ？"));
        assertTrue(isFullWidthFormInstance.isFullWidthForm("b？1"));
        assertTrue(isFullWidthFormInstance.isFullWidthForm("？标b"));
        assertTrue(isFullWidthFormInstance.isFullWidthForm("b？?"));
        assertTrue(isFullWidthFormInstance.isFullWidthForm("？标1"));
        assertTrue(isFullWidthFormInstance.isFullWidthForm("?1？"));
        assertTrue(isFullWidthFormInstance.isFullWidthForm("标？?"));
        
        assertTrue(isFullWidthFormInstance.isFullWidthForm("b ？1"));
        assertTrue(isFullWidthFormInstance.isFullWidthForm("？ b标"));
        assertTrue(isFullWidthFormInstance.isFullWidthForm("?？b "));
        assertTrue(isFullWidthFormInstance.isFullWidthForm("？标 1"));
        assertTrue(isFullWidthFormInstance.isFullWidthForm(" ?1？"));
        assertTrue(isFullWidthFormInstance.isFullWidthForm("？ 标?"));
        assertTrue(isFullWidthFormInstance.isFullWidthForm("b1？标"));
        assertTrue(isFullWidthFormInstance.isFullWidthForm("1?b？"));
        assertTrue(isFullWidthFormInstance.isFullWidthForm("？b标?"));
        assertTrue(isFullWidthFormInstance.isFullWidthForm("？标?1"));
        
        assertTrue(isFullWidthFormInstance.isFullWidthForm(" b1标？"));
        assertTrue(isFullWidthFormInstance.isFullWidthForm("b 1？?"));
        assertTrue(isFullWidthFormInstance.isFullWidthForm("b？ 标?"));
        assertTrue(isFullWidthFormInstance.isFullWidthForm("?1？标 "));
        assertTrue(isFullWidthFormInstance.isFullWidthForm("?标1？b"));
        
        assertTrue(isFullWidthFormInstance.isFullWidthForm("？1标 b?"));
    }
}
