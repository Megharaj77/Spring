<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>

<head>
<title>Summer Picnic Registration</title>
</head>

<h2>Fantabulous Picnic registartion form</h2>

<body>

   <form:form action="submission" modelAttribute="registration">
   
     <b>First Name:</b><form:input path="firstName"/>
     <br/><br/>
     
     <b>Last Name:</b><form:input path="lastName"/>
     <br/><br/>
     
     <b>Gender:</b><br/>
     
     Male<form:radiobutton path="gender" value="Male"/><br/>
       FeMale<form:radiobutton path="gender" value="FeMale"/><br/>
       <br/><br/>
       
       <b>Department</b>
       <form:select path="department">
          <form:option value="Biology" label="Biology"/>
          <form:option value="Mathematics" label="Mathematics"/>
          <form:option value="Chemistry" label="Chemistry"/>
          <form:option value="Arts" label="Arts"/>
        </form:select>
        <br><br>
        
        <b>Meal</b>
        <form:checkbox path="food" value="BreakFast"/>BreakFast<br/>
         <form:checkbox path="food" value="Lunch"/>Lunch<br/>
          <form:checkbox path="food" value="Dinner"/>Dinner<br/>
          <br/><br/>
          
          <input type="submit" value="Submit"/>
          </form:form>
     </body>
   </html>