<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int method = Integer.parseInt(request.getParameter("method"));
            
            if(method == 0){
                String hospitalName = request.getParameter("HospitalName");
                hospitalName = new String(hospitalName.getBytes());
                session.setAttribute("HospitalName",hospitalName);
                
                String examYear = request.getParameter("ExamYear");
                examYear = new String(examYear.getBytes());
                session.setAttribute("ExamYear",examYear);
                
                String subjectName = request.getParameter("SubjectName");
                subjectName = new String(subjectName.getBytes());
                session.setAttribute("SubjectName",subjectName);
                
                String registrationTimes = request.getParameter("RegistrationTimes");
                registrationTimes = new String(registrationTimes.getBytes());
                session.setAttribute("RegistrationTimes",registrationTimes);
                
                String studtName = request.getParameter("StudtName");
                studtName = new String(studtName.getBytes());
                session.setAttribute("StudtName",studtName);
                
                String sex = request.getParameter("Sex");
                sex = new String(sex.getBytes());
                session.setAttribute("Sex",sex);
                
                String studentID = request.getParameter("StudentID");
                studentID = new String(studentID.getBytes());
                session.setAttribute("StudentID",studentID);
                
                String studentType = request.getParameter("StudentType");
                studentType = new String(studentType.getBytes());
                session.setAttribute("StudentType",studentType);
                
                String issusOrgOfChiefResidentCert = request.getParameter("IssusOrgOfChiefResidentCert");
                issusOrgOfChiefResidentCert = new String(issusOrgOfChiefResidentCert.getBytes());
                session.setAttribute("IssusOrgOfChiefResidentCert",issusOrgOfChiefResidentCert);
                
                String chiefResidentMonth = request.getParameter("ChiefResidentMonth");
                chiefResidentMonth = new String(chiefResidentMonth.getBytes());
                session.setAttribute("ChiefResidentMonth",chiefResidentMonth);
                
                String attendingPhysicianYear = request.getParameter("AttendingPhysicianYear");
                attendingPhysicianYear = new String(attendingPhysicianYear.getBytes());
                session.setAttribute("AttendingPhysicianYear",attendingPhysicianYear);
                
                String doctorPhone = request.getParameter("DoctorPhone");
                doctorPhone = new String(doctorPhone.getBytes());
                session.setAttribute("DoctorPhone",doctorPhone);
                
                String studentLevel = request.getParameter("StudtLevel");
                studentLevel = new String(studentLevel.getBytes());
                session.setAttribute("StudtLevel",studentLevel);
                
                String graduationYear = request.getParameter("GraduationYear");
                graduationYear = new String(graduationYear.getBytes());
                session.setAttribute("GraduationYear",graduationYear);
                
                String graduationUniversity = request.getParameter("GraduationUniversity");
                graduationUniversity = new String(graduationUniversity.getBytes());
                session.setAttribute("GraduationUniversity",graduationUniversity);
                
                String firstStageCertificationIssueDate = request.getParameter("FirstStageCertificationIssueDate");
                firstStageCertificationIssueDate =new String(firstStageCertificationIssueDate.getBytes());
                session.setAttribute("FirstStageCertificationIssueDate",firstStageCertificationIssueDate);
                
                String firstStageSpeciality = request.getParameter("FirstStageSpeciality");
                firstStageSpeciality = new String(firstStageSpeciality.getBytes());
                session.setAttribute("FirstStageSpeciality",firstStageSpeciality);
                
                String issueGovernmentAgency = request.getParameter("IssueGovernmentAgency");
                issueGovernmentAgency = new String(issueGovernmentAgency.getBytes());
                session.setAttribute("IssueGovernmentAgency",issueGovernmentAgency);
                
                String paperTitle = request.getParameter("PaperTitle");
                paperTitle = new String(paperTitle.getBytes());
                session.setAttribute("PaperTitle",paperTitle);
                
                String issueTime = request.getParameter("IssueTime");
                issueTime = new String(issueTime.getBytes());
                session.setAttribute("IssueTime",issueTime);
                
                String issuePublicationName = request.getParameter("IssuePublicationName");
                issuePublicationName = new String(issuePublicationName.getBytes());
                session.setAttribute("IssuePublicationName",issuePublicationName);
                
                String issuePublicationNumber = request.getParameter("IssuePublicationNumber");
                issuePublicationNumber = new String(issuePublicationNumber.getBytes());
                session.setAttribute("IssuePublicationNumber",issuePublicationNumber);
                
                String employerForAPOrCurrWithSecCert = request.getParameter("EmployerForAPOrCurrWithSecCert");
                employerForAPOrCurrWithSecCert = new String(employerForAPOrCurrWithSecCert.getBytes());
                session.setAttribute("EmployerForAPOrCurrWithSecCert",employerForAPOrCurrWithSecCert);
                
                String startingEmploymentDate = request.getParameter("StartingEmploymentDate");
                startingEmploymentDate = new String(startingEmploymentDate.getBytes());
                session.setAttribute("StartingEmploymentDate",startingEmploymentDate);
                
                response.sendRedirect("Form!saveSession.action");
            }
            if(method == 1){
                session.invalidate();
                response.sendRedirect("index.jsp");
            }
        %>
    </body>
</html>
