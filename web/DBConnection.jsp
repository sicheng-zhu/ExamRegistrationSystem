<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE HTML>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>无标题文档</title>
    </head>
    
    <body>
        <%
        String dbname = ""; //Access 数据库用户名，没有则为空
        String user = ""; //Access 数据库密码，没有则为空
        //数据库连接字符串 
        String url ="jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=E:\\Software\\NetBeans 7.1.2\\NetBeansProjects\\RegistrationSystem\\web\\RegistrationForm.mdb";
        //加载驱动程序
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        //建立连接
        Connection conn= DriverManager.getConnection(url); 
        %>
    </body>
</html>