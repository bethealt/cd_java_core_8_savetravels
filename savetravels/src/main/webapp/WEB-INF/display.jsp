<%@ page isErrorPage="true" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <title>Show Expense</title>
</head>
<body>
    <h1>Expense Details</h1>
    <p><a href="/expenses">Go Back</a></p>
    <table class="detail">
        <tbody>
            <tr><td><b>Expense Name</b></td><td><c:out value="${expense.name}"></c:out></td></tr>
            <tr><td><b>Vendor Name</b></td><td><c:out value="${expense.vendor}"></c:out></td></tr>
            <tr><td><b>Description</b></td><td><c:out value="${expense.description}"></c:out></td></tr>
            <tr><td><b>Amount Spent</b></td><td><c:out value="${expense.amount}"></c:out></td></tr>
        </tbody>
    </table>
</body>
</html>