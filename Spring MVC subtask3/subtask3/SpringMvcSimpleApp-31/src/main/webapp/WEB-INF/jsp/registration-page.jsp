<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>

<head>
<title>Summer Picnic Registration</title>

  <style>
      .error{
              color:red;
              font-weight:bold;
      }
      </style>
</head>

<h2>Fantabulous Picnic registartion form</h2>

<body>

   <form:form action="submission" modelAttribute="registration">
   
     <b>Name:</b><form:input path="name"/><form:errors path="name" cssClass="error"/>
     <br/><br/>
     <b>email:</b><form:input path="email"/><form:errors path="email" cssClass="error"/>
     <br/><br/>
     
     <b>Number of guests:</b><form:input path="numGuests"/><form:errors path="numGuests" cssClass="error"/>
     <br/><br/>
     
     
     <b>Gender:</b><br/>
     
     Male<form:radiobutton path="gender" value="Male"/><br/>
       FeMale<form:radiobutton path="gender" value="FeMale"/><br/>
       <br/><br/>
       
       <b>Department</b>
       <form:select path="department" items="${departmentList}"/>
        <br/><br/>
        
        <b>Meal</b><br/>
        <form:checkbox path="food" value="BreakFast"/>BreakFast<br/>
         <form:checkbox path="food" value="Lunch"/>Lunch<br/>
          <form:checkbox path="food" value="Dinner"/>Dinner<br/>
          <br/><br/>
          
          <input type="submit" value="Submit"/>
          </form:form>
     </body>
   </html>