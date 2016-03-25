<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String examYear=request.getParameter("ExamYear");
        String studentNum=request.getParameter("StudentID");
        String studentType=request.getParameter("StudentType");
        String subjectName=request.getParameter("SubjectName");
        String firstStageCertificationIssueDate=request.getParameter("FirstStageCertificationIssueDate");
        String firstStageSpeciality=request.getParameter("FirstStageSpeciality");
        String issueGovernmentAgency=request.getParameter("IssueGovernmentAgency");
        String issusOrgOfChiefResidentCert=request.getParameter("IssusOrgOfChiefResidentCert");
        String registrationTimes=request.getParameter("RegistrationTimes");
        String hospitalName=request.getParameter("HospitalName");
        String doctorPhone=request.getParameter("DoctorPhone");
        String graduationUniversity=request.getParameter("GraduationUniversity");
        String graduationYear=request.getParameter("GraduationYear");
        String chiefResidentMonth=request.getParameter("ChiefResidentMonth");
        String attendingPhysicianYear=request.getParameter("AttendingPhysicianYear");
        String employerForAPOrCurrWithSecCert=request.getParameter("EmployerForAPOrCurrWithSecCert");
        String startingEmploymentDate=request.getParameter("StartingEmploymentDate");
        String studtName=request.getParameter("StudtName");
        String sex=request.getParameter("Sex");
        String studtLevel=request.getParameter("StudtLevel");  
        String paperTitle=request.getParameter("PaperTitle");
        String issueTime=request.getParameter("IssueTime");
        String issuePublicationName=request.getParameter("IssuePublicationName");
        String issuePublicationNumber=request.getParameter("IssuePublicationNumber");    
                
        session.setAttribute("ExamYear",examYear);
        session.setAttribute("StudentID",studentNum);
        session.setAttribute("StudentType",studentType);
        session.setAttribute("SubjectName",subjectName);
        session.setAttribute("FirstStageCertificationIssueDate",firstStageCertificationIssueDate);
        session.setAttribute("FirstStageSpeciality",firstStageSpeciality);
        session.setAttribute("IssueGovernmentAgency",issueGovernmentAgency);        
        session.setAttribute("IssusOrgOfChiefResidentCert",issusOrgOfChiefResidentCert);
        session.setAttribute("RegistrationTimes",registrationTimes);
        session.setAttribute("HospitalName",hospitalName);
        session.setAttribute("DoctorPhone",doctorPhone);
        session.setAttribute("GraduationUniversity",graduationUniversity);
        session.setAttribute("GraduationYear",graduationYear);
        session.setAttribute("ChiefResidentMonth",chiefResidentMonth);
        session.setAttribute("AttendingPhysicianYear",attendingPhysicianYear);
        session.setAttribute("EmployerForAPOrCurrWithSecCert",employerForAPOrCurrWithSecCert);
        session.setAttribute("StartingEmploymentDate",startingEmploymentDate);
        session.setAttribute("StudtName",studtName);
        session.setAttribute("Sex",sex);
        session.setAttribute("StudtLevel",studtLevel);
        session.setAttribute("PaperTitle",paperTitle);
        session.setAttribute("IssueTime",issueTime);
        session.setAttribute("IssuePublicationName",issuePublicationName);
        session.setAttribute("IssuePublicationNumber",issuePublicationNumber);
        response.sendRedirect("RegistrationForm.jsp");
        %>
    </body>
</html>
