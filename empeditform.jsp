<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
 <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f6f9;
            padding: 40px;
        }

        h1 {
            text-align: center;
            color: #333;
        }

        .form-table {
            margin: 0 auto;
            background-color: #ffffff;
            padding: 20px;
            border-radius: 6px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        .form-table td {
            padding: 10px 15px;
            font-size: 16px;
        }

        input[type="text"], input[type="number"] {
            width: 100%;
            padding: 8px;
            border: 1px solid #ccc;
             border-radius: 4px;
        }

        input[readonly] {
            background-color: #e9ecef;
        }

        input[type="submit"] {
            background-color: #007bff;
            color: white;
            border: none;
            padding: 10px 18px;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }

        .form-container {
            width: 50%;
            margin: auto;
        }
    </style>
            

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="empeditform.css">
</head>
<body>
<h1>Edit employee</h1>
<form:form method="POST" action="${pageContext.request.contextPath}/editsave" modelAttribute="emp">
<table>
<tr>
<td>ID :</td>
<td><form:input path="id" /></td>
</tr>
<tr>
<td>NAME:</td>
<td><form:input path="name" /></td>
</tr>
<tr>
<td>Salary:</td>
<td><form:input path="salary" /></td>
</tr>
<tr>
<td>Designation:</td>
<td><form:input path="designation" /></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="EDIT SAVE"/></td>
</tr>
</table>
</form:form>
</body>
</html>