<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="javax.servlet.http.HttpSession"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<link rel="stylesheet" type="text/css" href="css/demo.css" />
<link rel="stylesheet" type="text/css" href="css/component.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Recharge Prepaid</title>
<script type="text/javascript">
function onclick1()  
{  
	alert('Recharge successful!');  
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
}</style>
</head>
<body >
<div class="title-box">
<center>
					<h2>Make Your Payment. . !</h2>
				
				</center></div>
<form method="get" action="User.jsp" onsubmit="return onclick1();">
<center>
<table cellspacing=12>
<tr>
<th align='right'>
Amount:
</th>
<td align='left'>
<input type="hidden" name="amount" value="<%=session.getAttribute("amt")%>">
<h3><%=session.getAttribute("amt")%></h3>
</td>
 </tr>
<br>
<tr>
<th align="right">
Enter the Card Number:
</th>
<td align='left'>
<input type="text" name="cardno" pattern="[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{4}" placeholder="1111-1111-1111-1111" required>
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
</table>
<br><br>
<input name="pay" id="pay"  type="submit" class="button" value="Recharge">
</form>
<center>
</body>
</html>