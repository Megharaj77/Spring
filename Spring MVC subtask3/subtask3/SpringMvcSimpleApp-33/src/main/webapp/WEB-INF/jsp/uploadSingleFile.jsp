<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W#C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Upload File</title>

</head>

<body>

<form method="POST" action="uploadSingleFile" enctype="multipart/form-data">

      <p>Choose File. <input type="file" name="file"/></p>
      <p>File name: <input type="text" name="name"/></p>
      
      <input type="submit" value="Upload"/>
      
      </form>
     </body>
    </html>