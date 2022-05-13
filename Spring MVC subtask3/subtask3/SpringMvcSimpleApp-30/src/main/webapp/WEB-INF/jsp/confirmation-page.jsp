<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" isELIgnored="false" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>

<html>

<head>
<title>Summer Picnic Confirmation</title>

<style>

div, li{
       color:green;
       padding:6px;
       }
       
       </style>
</head>
  
   <body>
     <div><b>Your registration is confirmed!. Please make sure your details are correct.</b></div>
     <br/><br/>
     <div>First Name: ${registration.firstName}</div>
     <div>Last Name: ${registration.lastName}</div>
     <div>Gender: ${registration.gender}</div>
     <div>Department: ${registration.department}</div>
     
     <div>Meals opted in:</div>
     
     <ul>
     <c:forEach var="meal" items="${registration.food}">
     <li>${meal}</li>
     </c:forEach>
     </ul>
     
     </body>
     
     </html>