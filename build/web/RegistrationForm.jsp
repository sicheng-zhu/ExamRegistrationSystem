<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>北京市西城区卫生局住院医师规范化培训第二阶段考试资格审核表</title>
</head>

<body>
  <s:fielderror/>
  <s:form action="Form.action" name="registrationForm" method="post" theme="simple">
  <div>
  <p align="center"><strong>北京市西城区卫生局</strong></p>
  <p align="center"><strong>住院医师规范化培训第二阶段考试资格审核表</strong>    </p>
  <table width="1024" height="260" border="1" cellpadding="2" align="center">
  <tr>
        <td width="149" align="center"><strong>医院</strong></td>
        <td colspan="2"><s:textfield name="HospitalName"/></td>
        <td width="99" align="center"><strong>考试年份</strong></td>
        <td width="314"><s:textfield name="ExamYear"/> 
          　<strong>年</strong></td>
    </tr>
      <tr>
        <td align="center"><strong>报考专业</strong></td>
        <td colspan="2"><s:textfield name="SubjectName"/></td>
        <td align="center"><strong>报考次数</strong></td>
        <td><s:textfield name="RegistrationTimes"/>
          　<strong>次</strong></td>
      </tr>
      <tr>
        <td align="center"><strong>姓名</strong></td>
        <td colspan="2"><s:textfield name="StudtName"/></td>
        <td align="center"><strong>性别</strong></td>
        <td><s:textfield name="Sex"/></td>
      </tr>
      <tr>
        <td align="center"><strong>学员编号</strong></td>
        <td colspan="2"><s:textfield name="StudentID"/></td>
        <td align="center"><strong>学员类型</strong></td>
        <td><s:textfield name="StudentType"/></td>
      </tr>
      <tr>
        <td align="center"><strong>住院医师发证机构</strong></td>
        <td colspan="2"><s:textfield name="IssusOrgOfChiefResidentCert"/></td>
        <td align="center"><strong>总住院医师</strong></td>
        <td><strong>
          <s:textfield name="ChiefResidentMonth"/>
　月</strong></td>
      </tr>
      <tr>
        <td align="center"><strong>主治医师任职</strong></td>
        <td colspan="2"><s:textfield name="AttendingPhysicianYear"/>
        　<strong>年</strong></td>
        <td align="center"><strong>联系电话</strong></td>
        <td><strong>
          <s:textfield name="DoctorPhone"/>
          　(只填数字)
        </strong></td>
      </tr>
      <tr>
        <td rowspan="2" align="center"><strong>最终学历</strong></td>
        <td width="96" align="center"><strong>学位</strong></td>
        <td width="322"><s:textfield name="StudtLevel"/></td>
        <td align="center"><strong>毕业时间</strong></td>
        <td><s:textfield name="GraduationYear"/>
                <strong>　年</strong></td>
      </tr>
      <tr>
        <td align="center"><strong>毕业学校</strong></td>
        <td><strong>
          <s:textfield name="GraduationUniversity"/>
        </strong></td>
        <td align="center">&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td rowspan="2" align="center"><strong>一阶段合格证</strong></td>
        <td align="center"><strong>发证时间</strong></td>
        <td><strong>
          <s:textfield name="FirstStageCertificationIssueDate"/>
        </strong><font size="2">（格式： XXXX-XX-XX）</font></td>
        <td align="center"><strong>专业</strong></td>
        <td><strong>
          <s:textfield name="FirstStageSpeciality"/>
        </strong></td>
      </tr>
      <tr>
        <td align="center"><strong>发证单位</strong></td>
        <td><strong>
          <s:textfield name="IssueGovernmentAgency"/>
        </strong></td>
        <td align="center">&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td rowspan="2" align="center"><strong>论文</strong></td>
        <td align="center"><strong>题目</strong></td>
        <td><strong>
          <s:textfield name="PaperTitle"/>
        </strong></td>
        <td align="center"><strong>发表时间</strong></td>
        <td><strong>
          <s:textfield name="IssueTime"/>
        </strong><font size="2">（格式： XXXX-XX-XX）</font></td>
      </tr>
      <tr>
        <td align="center"><strong>刊名</strong></td>
        <td><s:textfield name="IssuePublicationName"/></td>
        <td align="center"><strong>刊物号</strong></td>
        <td><strong>
          <s:textfield name="IssuePublicationNumber"/>
        </strong></td>
      </tr>
      <tr>
        <td align="center"><strong>曾被聘用主治医师或已获得第二阶段培训合格证书的请填写</strong></td>
        <td align="center"><strong>聘任单位</strong></td>
        <td><strong>
          <s:textfield name="EmployerForAPOrCurrWithSecCert"/>
        </strong></td>
        <td align="center"><strong>聘任时间</strong></td>
        <td><strong>
          <s:textfield name="StartingEmploymentDate"/>
        </strong><font size="2">（格式： XXXX-XX-XX）</font></td>
      </tr>
  </table>
    <p>&nbsp;</p>
    <p>　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　
    <s:submit method="save" value="保存"/>
        　
    <s:submit method="insert" value="提交"/>
      　
    <s:submit method="clear" value="清空"/>
  </p>
</div>
</s:form>
</body>
</html>