<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="bean.Location"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<link rel="stylesheet" type="text/css" href="css/demo.css" />
<link rel="stylesheet" type="text/css" href="css/component.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update location details!</title>
<script type="text/javascript">
function onclick1()  
{  
	alert('Location updated successfully!');  
	return true;   
 }  
</script>
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
.title-box {
	background: red;
	width: 100%;
	padding: 10px 45% 10px 45%;
	border-bottom: 4px solid #16a085;
	text-shadow: 0 2px 1px rgba(0, 0, 0, .2);
	border-top: 2px solid #45E5C6;
}
#back
{
 width: 10em;  height: 2em;
    border: 3px;
    border-color:black;
    border-radius:2px;
    background-color: white;
    font-size:15px;
    color:red; 
    }
    #add
{
 width: 10em;  height: 2em;
    border: 3px;
    border-color:black;
    border-radius:2px;
    background-color: white;
    font-size:15px;
    color:red; 
    }
    </style>
</head>

<body >
<a href="Admin.jsp"  style="position:absolute;left:0;top:0;font-color:red"> <img src="logo2.png" alt="Home" title="Home"  style="width:150px;height:100px;border:0;"></a>
<center>
					<h2>Update Location</h2>
		</center>
<form method="get" action="ModifyLocationServlet" onsubmit="return onclick1();">
<center>
<table cellspacing=20>
<tr>
<th align="right">
Enter LocId:
</th>
<td align='left'>
<input type="text" value="<%=((Location)request.getAttribute("loc")).getLocId()%>" name="locid" readonly>
</td>
</tr>>
<br>
 <tr>
<th align="right">
Enter City:
</th>
<td align='left'>
<input type="text" value="<%=((Location)request.getAttribute("loc")).getCity()%>" name="city" required>
</td>
 </tr>
<br>
 <tr>
<th align='right'>
Enter Store Name:
</th>
<td align='left'>
<input type="text" value="<%=((Location)request.getAttribute("loc")).getStoreName()%>" name="storename" required>
</td>
 </tr>
 <br>
<tr>
<th align='right'>
Enter Store Address:
</th>
<td align='left'>
<input type="text" value="<%=((Location)request.getAttribute("loc")).getStoreAddress()%>" name="storeaddress" required><br>
</td>
 </tr>
<br>
 <tr>
<th align='right'>
Enter ContactNo:
</th>
<td align='left'>
<input type="text" value="<%=((Location)request.getAttribute("loc")).getContactNo()%>" name="contactno" required>
</td>
</tr>
<br>>
</table>
<input type="submit" value="Add" name="add"  class="button" id="add" >
</form>
<br>
</center>
 <form method="get" action="Admin.jsp">
<br>
 <center><input type="submit" name="back" id="back" value="Back"></center>

</form>

</body>
</html>