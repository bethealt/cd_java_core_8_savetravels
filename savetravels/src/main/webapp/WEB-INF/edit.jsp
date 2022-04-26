<%@ page isErrorPage="true" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Edit Expense</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
    <h1 class="edit">Edit Expense</h1>
    <p><a href="/expenses">Go Back</a></p>
    <form:form action="/expenses/${expense.id}" method="POST" modelAttribute="expense">
    <input type="hidden" name="_method" value="put">
            <p>
                <form:label path="name">Expense Name</form:label>
                <form:errors path="name"></form:errors>
                <form:input path="name"></form:input>
            </p>
            <p>
                <form:label path="vendor">Vendor Name</form:label>
                <form:errors path="vendor"></form:errors>
                <form:input path="vendor"></form:input>
            </p>
            <p>
                <form:label path="amount">Amount</form:label>
                <form:errors path="amount"></form:errors>
                <form:input path="amount"></form:input>
            </p>
            <p>
                <form:label path="description">Description</form:label>
                <form:errors path="description"></form:errors>
                <form:textarea path="description"></form:textarea>
            </p>
            <input type="submit" value="Submit"/>
        </form:form>
</body>
</html>