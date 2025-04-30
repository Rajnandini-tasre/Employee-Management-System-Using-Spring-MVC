<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Management</title>
<meta charset="UTF-8">
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f9f9f9;
        text-align: center;
        padding-top: 50px;
    }

    h1 {
        color: #333;
    }

    .nav-links {
        margin-top: 30px;
    }
    
        .nav-links a {
        text-decoration: none;
        background-color: #007bff;
        color: white;
        padding: 12px 20px;
        border-radius: 4px;
        margin: 0 10px;
        font-size: 16px;
        transition: background-color 0.3s ease;
    }

    .nav-links a:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
<h1>Welcome to Employee Management System</h1>
    <div class="nav-links">
        <a href="emp">Add Employee</a>
        <a href="viewemp">View Employees</a>
    </div>

</body>
</html>