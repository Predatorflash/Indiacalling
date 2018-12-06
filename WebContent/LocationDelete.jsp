<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<link rel="stylesheet" type="text/css" href="css/demo.css" />
<link rel="stylesheet" type="text/css" href="css/component.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<title>Delete Location</title>
<style>
.button {
  display: inline-block;
  padding: 15px 25px;
  font-size: 24px;
  cursor: pointer;
  text-align: center;
  text-decoration: none;
  outline: none;
  
  

  border-radius: 15px;
  box-shadow: 0 9px #999;
  
  
  
      background: #2471FF;
    border: none;
    padding: 10px 20px 10px 20px;
    border-bottom: 3px solid #5994FF;
    
    color: #D2E2FF;
    
    
}

.button:hover {
  background: #6B9FFF;
    color:#fff;
}

.button:active {
  background-color:  #6B9FFF;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
table a:link {
	color: #666;
	font-weight: bold;
	text-decoration:none;
}
table a:visited {
	color: #999999;
	font-weight:bold;
	text-decoration:none;
}
table a:active,
table a:hover {
	color: #bd5a35;
	text-decoration:underline;
}
table {
	font-family:Arial, Helvetica, sans-serif;
	color:#666;
	font-size:12px;
	text-shadow: 1px 1px 0px #fff;
	background:#eaebec;
	margin:20px;
	border:#ccc 1px solid;

	-moz-border-radius:3px;
	-webkit-border-radius:3px;
	border-radius:3px;

	-moz-box-shadow: 0 1px 2px #d1d1d1;
	-webkit-box-shadow: 0 1px 2px #d1d1d1;
	box-shadow: 0 1px 2px #d1d1d1;
}
table th {
	padding:21px 25px 22px 25px;
	border-top:1px solid #fafafa;
	border-bottom:1px solid #e0e0e0;

	background: #ededed;
	background: -webkit-gradient(linear, left top, left bottom, from(#ededed), to(#ebebeb));
	background: -moz-linear-gradient(top,  #ededed,  #ebebeb);
}
table th:first-child {
	text-align: left;
	padding-left:20px;
}
table tr:first-child th:first-child {
	-moz-border-radius-topleft:3px;
	-webkit-border-top-left-radius:3px;
	border-top-left-radius:3px;
}
table tr:first-child th:last-child {
	-moz-border-radius-topright:3px;
	-webkit-border-top-right-radius:3px;
	border-top-right-radius:3px;
}
table tr {
	text-align: center;
	padding-left:20px;
}
table td:first-child {
	text-align: left;
	padding-left:20px;
	border-left: 0;
}
table td {
	padding:18px;
	border-top: 1px solid #ffffff;
	border-bottom:1px solid #e0e0e0;
	border-left: 1px solid #e0e0e0;

	background: #fafafa;
	background: -webkit-gradient(linear, left top, left bottom, from(#fbfbfb), to(#fafafa));
	background: -moz-linear-gradient(top,  #fbfbfb,  #fafafa);
}
table tr.even td {
	background: #f6f6f6;
	background: -webkit-gradient(linear, left top, left bottom, from(#f8f8f8), to(#f6f6f6));
	background: -moz-linear-gradient(top,  #f8f8f8,  #f6f6f6);
}
table tr.last-child td {
	border-bottom:0;
}
table tr:last-child td:first-child {
	-moz-border-radius-bottomleft:3px;
	-webkit-border-bottom-left-radius:3px;
	border-bottom-left-radius:3px;
}
table tr:last-child td:last-child {
	-moz-border-radius-bottomright:3px;
	-webkit-border-bottom-right-radius:3px;
	border-bottom-right-radius:3px;
}
table tr:hover td {
	background: #f2f2f2;
	background: -webkit-gradient(linear, left top, left bottom, from(#f2f2f2), to(#f0f0f0));
	background: -moz-linear-gradient(top,  #f2f2f2,  #f0f0f0);	
}

    </style>

	 	<a href="Admin.jsp"  style="position:absolute;left:0;top:0;font-color:red"> <img src="logo2.png" alt="Home" title="Home"  style="width:150px;height:100px;border:0;"></a>

</head>
<body>

<center><h1 style=color:black>Modify Location</h1></center>  
<center>
<br><br>
<table bgcolor='white' align='center' border='2' cellpadding='4'>
<tr>
<th align='center'>
LOCID
</th>
<th align='center'>
CITY
</th>
<th align='center'>
STORENAME
</th>
<th align='center'>
STORE ADDRESS
</th>
<th align='center'>
CONTACTNO
</th>
</tr>

       <c:forEach var="user" items="${results}">
  	
  		<tr><td align="left"><c:out value="${user.locId}"/></td>
			<td align="left"><c:out value="${user.city}"/></td>
           	<td align="left"><c:out value="${user.storeName}"/></td>
           	<td align="left"><c:out value="${user.storeAddress}"/></td>
          	<td align="left"><c:out value="${user.contactNo}"/></td> 
            <td><a href="UpdateLocationServlet?param=${user.locId}">Update</a></td>
            <td><a href="DeleteLocationServlet?id=${user.locId}">Delete</a></td>
              </tr>
</c:forEach> </table>
<br>
</center>
<form method="get" action="Admin.jsp"><br>

<center><input type="submit" name="back" id="back" class="button" value="Back"></center>
</form>
</body>
</html>