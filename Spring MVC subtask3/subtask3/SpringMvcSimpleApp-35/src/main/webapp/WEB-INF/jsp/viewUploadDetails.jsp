<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>

<title>Upload Successful</title>

</head>
<body>

         <div id="global">
                  <h3>Fpllowing files are uploaded successfully</h3>
                
                <ol>
                     <c:forEach items="${upload.images}" var="image">
                             <li>${image.originalFilename}
                             </li>
                             </c:forEach>
                </ol>
                
        </div>
        
    </body>
    
   </html>