<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<h2> File Upload</h2>
<br/>
<input type=button onClick="location.href='uploadSingleFile'"
        style="background-color:#008080; color:black;
        width:150px; height:40px; top:90px;"
        value='Single File Upload'/>