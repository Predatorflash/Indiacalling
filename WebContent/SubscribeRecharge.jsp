<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="javax.servlet.http.HttpSession"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<link rel="stylesheet" type="text/css" href="css/demo.css" />
<link rel="stylesheet" type="text/css" href="css/component.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Subscribe plan.</title>

<script type="text/javascript">
function onclick1()  
{  
	alert('Subscribed successfully!');  
	return true;   
 }  
</script>
<style>.button {
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
}</style>
</head>
<body bgcolor="white" >
<div class="title-box">
<center>
					<h2>Make Your Payment. . !</h2>
				</center></div>
<form method="get" action="User.jsp" onsubmit="return onclick1();">
<center>
<table cellspacing=12 >
<tr>
<th align='right'>
Amount:
</th>
<td align='left'>
<h3><%=session.getAttribute("Rcamt")%></h3>
<input type="hidden" name="amount" value="<%=session.getAttribute("Rcamt")%>">
</td>
</tr>
 <br>
 <tr>
<th align="right">
Enter the Card Number:
</th>
<td align='left'>
<input type="text" name="cardno"  pattern="[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{4}" placeholder="1111-1111-1111-1111" maxlength=19 required>
</td>
</tr>
<br>
 <tr>
<th align='right'>
Enter CVV:
</th>
<td align='left'>
<input type="text" name="cvv" pattern="[0-9]{3}" maxlength=3 placeholder="111" required>
</td>
</tr>
<br><br>
</table>
<input name="pay" type="submit" id="pay" class="button" value="Pay">
</form>
</center>
</body>
</html>