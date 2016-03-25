<%@ page contentType="text/html" pageEncoding="UTF-8" language="java" import="java.sql.*" errorPage="" %>
<%@ page import="javax.servlet.http.Cookie"%>
<%   
  String hospitalName = request.getParameter("HospitalName");
  Cookie hospitalName_Cookie=new Cookie("hospitalName",hospitalName);  
  hospitalName_Cookie.setMaxAge(60*60*24);
  response.addCookie(hospitalName_Cookie);
  
  String examYear = request.getParameter("ExamYear");
  Cookie examYear_Cookie=new Cookie("examYear",examYear);  
  examYear_Cookie.setMaxAge(60*60*24);
  response.addCookie(examYear_Cookie);
  
  String subjectName = request.getParameter("SubjectName");
  Cookie subjectName_Cookie=new Cookie("subjectName",subjectName);  
  subjectName_Cookie.setMaxAge(60*60*24);
  response.addCookie(subjectName_Cookie);
  
  String registrationTimes = request.getParameter("RegistrationTimes");
  Cookie registrationTimes_Cookie=new Cookie("registrationTimes",registrationTimes);  
  registrationTimes_Cookie.setMaxAge(60*60*24);
  response.addCookie(registrationTimes_Cookie);
  
  String studtName = request.getParameter("StudtName");
  Cookie studtName_Cookie=new Cookie("studtName",studtName);  
  studtName_Cookie.setMaxAge(60*60*24);
  response.addCookie(studtName_Cookie);
  
  String sex = request.getParameter("Sex");
  Cookie sex_Cookie=new Cookie("sex",sex);  
  sex_Cookie.setMaxAge(60*60*24);
  response.addCookie(sex_Cookie);
  
  String studentID = request.getParameter("StudentID");
  Cookie studentID_Cookie=new Cookie("studentID",studentID);  
  studentID_Cookie.setMaxAge(60*60*24);
  response.addCookie(studentID_Cookie);
  
  String studentType = request.getParameter("StudentType");
  Cookie studentType_Cookie=new Cookie("studentType",studentType);  
  studentType_Cookie.setMaxAge(60*60*24);
  response.addCookie(studentType_Cookie);
  
  String issusOrgOfChiefResidentCert = request.getParameter("IssusOrgOfChiefResidentCert");
  Cookie issusOrgOfChiefResidentCert_Cookie=new Cookie("issusOrgOfChiefResidentCert",issusOrgOfChiefResidentCert);  
  issusOrgOfChiefResidentCert_Cookie.setMaxAge(60*60*24);
  response.addCookie(issusOrgOfChiefResidentCert_Cookie);
  
  String chiefResidentMonth = request.getParameter("ChiefResidentMonth");
  Cookie chiefResidentMonth_Cookie=new Cookie("chiefResidentMonth",chiefResidentMonth);  
  chiefResidentMonth_Cookie.setMaxAge(60*60*24);
  response.addCookie(chiefResidentMonth_Cookie);
  
  String attendingPhysicianYear = request.getParameter("AttendingPhysicianYear");
  Cookie attendingPhysicianYear_Cookie=new Cookie("attendingPhysicianYear",attendingPhysicianYear);  
  attendingPhysicianYear_Cookie.setMaxAge(60*60*24);
  response.addCookie(attendingPhysicianYear_Cookie);
  
  String doctorPhone = request.getParameter("DoctorPhone");
  Cookie doctorPhone_Cookie=new Cookie("doctorPhone",doctorPhone);  
  doctorPhone_Cookie.setMaxAge(60*60*24);
  response.addCookie(doctorPhone_Cookie);
  
  String studtLevel = request.getParameter("StudtLevel");
  Cookie studtLevel_Cookie=new Cookie("studtLevel",studtLevel);  
  studtLevel_Cookie.setMaxAge(60*60*24);
  response.addCookie(studtLevel_Cookie);
  
  String graduationYear = request.getParameter("GraduationYear");
  Cookie graduationYear_Cookie=new Cookie("graduationYear",graduationYear);  
  graduationYear_Cookie.setMaxAge(60*60*24);
  response.addCookie(graduationYear_Cookie);
  
  String graduationUniversity = request.getParameter("GraduationUniversity");
  Cookie graduationUniversity_Cookie=new Cookie("graduationUniversity",graduationUniversity);  
  graduationUniversity_Cookie.setMaxAge(60*60*24);
  response.addCookie(graduationUniversity_Cookie);
  
  String firstStageCertificationIssueDate = request.getParameter("FirstStageCertificationIssueDate");
  Cookie firstStageCertificationIssueDate_Cookie=new Cookie("firstStageCertificationIssueDate",firstStageCertificationIssueDate);  
  firstStageCertificationIssueDate_Cookie.setMaxAge(60*60*24);
  response.addCookie(firstStageCertificationIssueDate_Cookie);
  
  String firstStageSpeciality = request.getParameter("FirstStageSpeciality");
  Cookie firstStageSpeciality_Cookie=new Cookie("firstStageSpeciality",firstStageSpeciality);  
  firstStageSpeciality_Cookie.setMaxAge(60*60*24);
  response.addCookie(firstStageSpeciality_Cookie);
  
  String issueGovernmentAgency = request.getParameter("IssueGovernmentAgency");
  Cookie issueGovernmentAgency_Cookie=new Cookie("issueGovernmentAgency",issueGovernmentAgency);  
  issueGovernmentAgency_Cookie.setMaxAge(60*60*24);
  response.addCookie(issueGovernmentAgency_Cookie);
  
  String paperTitle = request.getParameter("PaperTitle");
  Cookie paperTitle_Cookie=new Cookie("paperTitle",paperTitle);  
  paperTitle_Cookie.setMaxAge(60*60*24);
  response.addCookie(paperTitle_Cookie);
  
  String issueTime = request.getParameter("IssueTime");
  Cookie issueTime_Cookie=new Cookie("issueTime",issueTime);  
  issueTime_Cookie.setMaxAge(60*60*24);
  response.addCookie(issueTime_Cookie);
  
  String issuePublicationName = request.getParameter("IssuePublicationName");
  Cookie issuePublicationName_Cookie=new Cookie("issuePublicationName",issuePublicationName);  
  issuePublicationName_Cookie.setMaxAge(60*60*24);
  response.addCookie(issuePublicationName_Cookie);
  
  String issuePublicationNumber = request.getParameter("IssuePublicationNumber");
  Cookie issuePublicationNumber_Cookie=new Cookie("issuePublicationNumber",issuePublicationNumber);  
  issuePublicationNumber_Cookie.setMaxAge(60*60*24);
  response.addCookie(issuePublicationNumber_Cookie);
  
  String employerForAPOrCurrWithSecCert = request.getParameter("EmployerForAPOrCurrWithSecCert");
  Cookie employerForAPOrCurrWithSecCert_Cookie=new Cookie("employerForAPOrCurrWithSecCert",employerForAPOrCurrWithSecCert);  
  employerForAPOrCurrWithSecCert_Cookie.setMaxAge(60*60*24);
  response.addCookie(employerForAPOrCurrWithSecCert_Cookie);
  
  String startingEmploymentDate = request.getParameter("StartingEmploymentDate");
  Cookie startingEmploymentDate_Cookie=new Cookie("startingEmploymentDate",startingEmploymentDate);  
  startingEmploymentDate_Cookie.setMaxAge(60*60*24);
  response.addCookie(startingEmploymentDate_Cookie);
  
  response.sendRedirect("Test.jsp");
%>
