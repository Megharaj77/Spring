<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>

<title>Multiple File Upload Page</title>

</head>

<body>

       <h2>Multiple File Upload</h2>
       <form:form modelAttribute="upload" action="save-upload" method="post"
                 enctype="multipart/form-data">
                 
        <table>
        
              <tr>
                     <td> Please select one or more files to upload:</td>
              </tr>
              
              <tr>
                  <td>Enter name:</td>
                  
               </tr>
               
               <tr>
                    <td><input type="file" name="images" multiple="multiple"/></td>
               </tr>
               
               <tr>
                   <td>&nbsp;</td>
                </tr>
                
                <tr>
                     <td><input type="submit" id="submit"
                                style="background-color:#DE1515; color:white; width:100px; height:40px; top:250px;"
                                value="Upload"/></td>
                   <td><input type="reset" id="reset"
                              style="background-color:#DE1515; color:white; width:100px; height:40px; top:250px;"
                              value="Reset"/></td>
                 </tr>
                 
                 </table>
                 
                 </form:form>
                
                </body>
                </html>