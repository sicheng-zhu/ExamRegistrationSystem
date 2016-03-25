<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ include file="DBConnection.jsp"%>

<!DOCTYPE HTML>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>无标题文档</title>
    </head>
    
    <body>
        <%
        Statement st=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        
        ResultSet rs4 = st.executeQuery("select RegistrationID from RegistrationForm");
        rs4.last();
        int registrationID;
        if(rs4.getRow()!=0){
            registrationID=rs4.getInt(1);
            registrationID++;
        }else{registrationID=1;}
        rs4.close();        
        
        String registrationNum=""+registrationID;        
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
        String registrationFormSql="insert into RegistrationForm values("+registrationNum+",'"+examYear+"',"+studentNum+",'"+studentType+"','"+subjectName+"','"+firstStageCertificationIssueDate+"','"+firstStageSpeciality+"','"+issueGovernmentAgency+"','"+issusOrgOfChiefResidentCert+"','"+registrationTimes+"','"+hospitalName+"','"+doctorPhone+"','"+graduationUniversity+"','"+graduationYear+"','"+chiefResidentMonth+"','"+attendingPhysicianYear+"','"+employerForAPOrCurrWithSecCert+"','"+startingEmploymentDate+"')";
        st.executeUpdate(registrationFormSql);
        
        ResultSet rs1 = st.executeQuery("select StudentAcc from StudentInfo");
        rs1.last();
        int studentAcc;
        if(rs1.getRow()!=0){
            studentAcc=rs1.getInt(1);
            studentAcc++;
        }else{studentAcc=1;}
        rs1.close();
        
//        request.setCharacterEncoding("gb2312");
        String studentID=""+studentAcc;
        String studtName=request.getParameter("StudtName");
        String sex=request.getParameter("Sex");
        String studtLevel=request.getParameter("StudtLevel");        
//        out.print(id);
//        String sql="insert into admin values("+id+",'"+uN+"','"+Pwd+"','"+sex+"')";
        String studentInforSql="insert into StudentInfo values("+studentID+",'"+studtName+"','"+sex+"','"+studtLevel+"')";
        st.executeUpdate(studentInforSql);
        
        ResultSet rs2 = st.executeQuery("select PaperID from Paper");
        rs2.last();
        int paperID;
        if(rs2.getRow()!=0){
            paperID=rs2.getInt(1);
            paperID++;
        }else{paperID=1;}
        rs2.close();
        
        ResultSet rs3 = st.executeQuery("select RegistrationID from RegistrationForm");
        rs3.last();
        int fkPegistrationID;
        if(rs3.getRow()!=0){
            fkPegistrationID=rs3.getInt(1);
            fkPegistrationID++;
        }else{fkPegistrationID=1;}
        rs3.close();
        
        String paperNum=""+paperID;
//        String fkRegistrationNum=""+fkPegistrationID;
        String paperTitle=request.getParameter("PaperTitle");
        String issueTime=request.getParameter("IssueTime");
        String issuePublicationName=request.getParameter("IssuePublicationName");
        String issuePublicationNumber=request.getParameter("IssuePublicationNumber");
        String paperSql="insert into Paper values("+paperNum+","+registrationNum+",'"+paperTitle+"','"+issueTime+"','"+issuePublicationName+"','"+issuePublicationNumber+"')";
        st.executeUpdate(paperSql);
        
        
        st.close();
        conn.close();
        
        out.print("成功");
//response.sendRedirect("index.jsp");
%>
    </body>
</html>